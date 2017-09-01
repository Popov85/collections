package com.popov.collections;

/**
 * Created by Andrey on 31.08.2017.
 */
public interface Queue<E> {

        void offer(E e);
        E poll();
        E peek();
}
