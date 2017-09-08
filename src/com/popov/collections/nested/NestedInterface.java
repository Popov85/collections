package com.popov.collections.nested;

/**
 * Created by Andrey on 07.09.2017.
 */
public interface NestedInterface {
        void getData();

        interface Nest {

                String getName();
                int getNumber();

                static void get(){};
        }
}
