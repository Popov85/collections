package com.popov.collections;

import java.util.Collection;
import java.util.LinkedList;

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
        public void add(int index, E e) {
                if (index<=0) {
                        // add at the beginning
                        Node<E> n = new Node<E>(e, null, first);
                        first.prev = n;
                        first=n;
                        size++;
                        return;
                }
                // add to the end
                if (index>=size-1) {
                        add(e);
                        return;
                }
                // somewhere in the middle
                Node<E> n = first;
                int i = 0;
                while (index!=i) {
                        n=n.next;
                        i++;
                }
                Node<E> node = new Node<E>(e, n.prev, n);
                n.prev.next=node;
                n.prev=node;
                size++;
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
                Node<E> n = first;
                int i = 0;
                while (n!=null) {
                        if (n.item.equals(o)) return i;
                        n=n.next;
                        i++;
                }
               /* for (Node<E> x = first; x != null; x = x.next) {
                        if (x.item.equals(o)) return i;
                        i++;
                }*/
                return -1;
        }

        @Override
        public E remove(int index) {
                if (size==0) throw new IllegalStateException("The list is empty, nothing to delete!");
                // remove first
                if (index<=0) {
                        first.next.prev=null;
                        Node<E> removed = first;
                        first=first.next;
                        size--;
                        return removed.item;
                }
                //remove last
                if (index>=size-1) {
                        last.prev.next=null;
                        Node<E> removed = last;
                        last=last.prev;
                        size--;
                        return removed.item;

                }
                Node<E> n = first;
                int i = 0;
                while (index!=i) {
                        n=n.next;
                        i++;
                }
                n.prev.next=n.next;
                n.next.prev=n.prev;
                size--;
                return n.item;
        }

        @Override
        public boolean remove(Object o) {
                int index = indexOf(o);
                if (index==-1) return false;
                remove(index);
                return true;
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
                Node<E> n = first;
                while (n!=null) {
                        sb.append(n.item+"/ ");
                        n=n.next;
                }
                return "LinkedListImpl{" +
                        "size=" + size +
                        ", list=" + sb.toString() +
                        '}';
        }
}
