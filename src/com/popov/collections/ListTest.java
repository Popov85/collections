package com.popov.collections;

/**
 * Created by Andrey on 08.09.2017.
 */
public class ListTest {
        public static void main(String[] args) {
                List<String> l = new LinkedListImpl<>();
                l.add("Andrii");
                l.add("Eugen");
                l.add("Valentine");
                System.out.println(l.toString());
        }
}
