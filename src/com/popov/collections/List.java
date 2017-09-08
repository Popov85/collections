package com.popov.collections;

import java.util.Collection;

/**
 * Created by Andrey on 04.09.2017.
 */
public interface List<E> {
        boolean add(E e);
        void add(int index, E element);
        void addAll(Collection<? extends E> c);
        void addAll(int index, Collection<? extends E> c);
        boolean contains(Object o);
        boolean containsAll(Collection<?> c);
        E get(int index);
        int indexOf(Object o);
        E remove(int index);
        boolean remove(Object o);
        boolean removeAll(Collection<?> c);
        E set(int index, E element);
}
