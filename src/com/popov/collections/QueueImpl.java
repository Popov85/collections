package com.popov.collections;

import java.util.Arrays;

/**
 * Created by Andrey on 01.09.2017.
 */
public class QueueImpl<E> implements Queue<E> {

        private static final int DEF_CAPACITY = 4;

        private E[] elements;

        private int size;

        private int head;

        private int tail;

        public QueueImpl() {
                this.elements = (E[]) new Object[DEF_CAPACITY] ;
        }

        @Override
        public void offer(E e) {
                // adds
                if (isEmpty()) {
                        elements[0]=e;
                        size=1;
                        return;
                }

                if (isFull()) {
                        // do resize or shift back
                        if (isShiftable()) {
                                shift();
                        } else {
                                increase();
                        }
                }

                // do ordinary add
                this.elements[++tail]=e;
                size++;
        }

        @Override
        public E poll() {
                if (isEmpty()) return null;
                E e = this.elements[head];
                this.elements[head]=null;
                if (isLast()) {
                        head=tail=0;
                } else {
                        head++;
                }
                size--;
                return e;
        }

        private boolean isLast() {
                return size==1;
        }

        @Override
        public E peek() {
                return this.elements[head];
        }

        private boolean isEmpty() {
                return this.size==0;
        }

        private boolean isFull() {
                return this.elements.length-1==tail;
        }

        // Checks if the part of the queue between tail and head can be moved to the beginning of the internal array
        private boolean isShiftable() {
                return this.elements.length-1>size;
        }

        private void shift() {
                if (!isShiftable()) return; // cannot be shifted
                System.out.println("Shifting...");
                int counter=0;
                for (int i = head; i <= tail; i++) {
                        this.elements[counter]=this.elements[i];
                        this.elements[i]=null;
                        counter++;
                }
                head=0;
                tail=size-1;
        }

        private void increase() {
                int newCapacity=this.elements.length*2;
                E[] newArray = (E[]) new Object[newCapacity];
                System.arraycopy(this.elements,0,newArray,0, this.elements.length);
                this.elements = newArray;
                System.out.println("Increased: "+toString());
        }

        @Override
        public String toString() {
                return "QueueImpl{" +
                        "elements=" + Arrays.toString(elements) +
                        ", size=" + size +
                        ", head=" + head +
                        ", tail=" + tail +
                        '}';
        }
}
