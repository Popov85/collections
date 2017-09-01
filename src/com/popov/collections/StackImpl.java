package com.popov.collections;

import java.util.Arrays;

/**
 * Created by Andrey on 31.08.2017.
 */
public class StackImpl<E> implements Stack<E> {

        private static final int DEF_CAPACITY = 4;

        private E[] elements;

        private int head;

        public StackImpl() {
                this.elements = (E[]) new Object[DEF_CAPACITY] ;
        }

        @Override
        public void push(E e) {
                if (isFull()) increase();
                if (isEmpty()) {
                        elements[head] = e;
                } else {
                        elements[++head] = e;
                }
        }

        @Override
        public E pop() {
                E e = this.elements[head];
                this.elements[head]=null;
                if (head!=0) head--;
                return e;
        }

        @Override
        public E peek() {
                return this.elements[head];
        }

        private boolean isEmpty() {
                return this.elements[head]==null;
        }

        private boolean isFull() {
               return this.elements.length-1==head;
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
                return "StackImpl{" +
                        "elements=" + Arrays.toString(elements) +
                        ", head=" + head +
                        '}';
        }
}
