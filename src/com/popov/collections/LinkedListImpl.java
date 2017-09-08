package com.popov.collections;

import java.util.Collection;

/**
 * Created by Andrey on 04.09.2017.
 */
public class LinkedListImpl<E> implements List<E> {

        int size = 0;

        Node<E> first;

        Node<E> last;

        private static class Node<E> {
                E item;
                LinkedListImpl.Node<E> prev;
                LinkedListImpl.Node<E> next;

                Node(E element, LinkedListImpl.Node<E> prev, LinkedListImpl.Node<E> next) {
                        this.item = element;
                        this.prev = prev;
                        this.next = next;
                }

                boolean hasNext() {return next!=null;}

                @Override
                public String toString() {
                        return "Node{" +
                                "item=" + item +
                                '}';
                }
        }

        @Override
        public boolean add(E e) {
                if (size==0) {
                    first=last=new Node(e, null, null);
                } else {
                        Node n = new Node(e, last, null);
                        last.next = n;
                        last=n;
                }
                size++;
                return true;
        }

        @Override
        public void add(int index, E element) {

        }

        @Override
        public void addAll(Collection<? extends E> c) {

        }

        @Override
        public void addAll(int index, Collection<? extends E> c) {

        }

        @Override
        public boolean contains(Object o) {
                return false;
        }

        @Override
        public boolean containsAll(Collection<?> c) {
                return false;
        }

        @Override
        public E get(int index) {
                return null;
        }

        @Override
        public int indexOf(Object o) {
                return 0;
        }

        @Override
        public E remove(int index) {
                return null;
        }

        @Override
        public boolean remove(Object o) {
                return false;
        }

        @Override
        public boolean removeAll(Collection<?> c) {
                return false;
        }

        @Override
        public E set(int index, E element) {
                return null;
        }

        @Override
        public String toString() {
                StringBuilder sb = new StringBuilder();
                Node n = this.first;
                sb.append(n.item+"/ ");
                while (n.hasNext()) {
                        n=n.next;
                        sb.append(n.item+"/ ");
                }
                return "LinkedListImpl{" +
                        "size=" + size +
                        ", list=" + sb.toString() +
                        '}';
        }
}
