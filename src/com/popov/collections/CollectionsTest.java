package com.popov.collections;

import java.util.*;


/**
 * Created by Andrey on 21.08.2017.
 */
public class CollectionsTest {

        private static final int DEF = 16;

        private static final int DEF1 = 23;

        public static void main(String[] args) throws Exception {
                //AbstractCollection
                java.util.List<String> l = new ArrayList<>();
                java.util.List<String> ll = new LinkedList<>();
                java.util.List<String> lll = new Vector<>();
                Deque<String> strings = new LinkedList<String>();
                Deque<String> d = new ArrayDeque<String>();

                PriorityQueue<String> pq = new PriorityQueue<>();
                Map<String, String> m = new HashMap<>();


                System.out.println(Integer.toBinaryString(1154));

                int hash=966998222;
                System.out.println(hash&(DEF-1));
                System.out.println(hash%DEF);

                System.out.println("-------------------");
                System.out.println(hash&(DEF1));
                System.out.println(hash%DEF1);



              /*  int test = 0b1111_1111_1111_1111_0000_0000_0000_0000;
                System.out.println(Integer.toBinaryString(test>>>16));*/

           /*     int size=16;
                System.out.println("size: "+size+" "+Integer.toBinaryString(size));

                int domain = new AverageDomainObject("GS-34","Jefferson",416).hashCode();
                int domainAver = new AverageDomainObject("IO-56","Hawaii",526).hashCode();
                System.out.println("1: "+domain+" "+Integer.toBinaryString(domain));
                System.out.println("2: "+domainAver+" "+Integer.toBinaryString(domainAver));
                int transformed1 = domain ^ (domain>>>16);
                int transformed2 = domainAver ^ (domainAver>>>16);
                System.out.println(Integer.toBinaryString(transformed1));
                System.out.println(Integer.toBinaryString(transformed2));


                int index01 = (16-1)&domain;
                int index02 = (16-1)&domainAver;
                System.out.println("[01]"+index01+" "+Integer.toBinaryString(index01));
                System.out.println("[02]"+index02+" "+Integer.toBinaryString(index02));


                int index1 = (16-1)&transformed1;
                int index2 = (16-1)&transformed2;
                System.out.println("[1]"+index1+" "+Integer.toBinaryString(index1));
                System.out.println("[2]"+index2+" "+Integer.toBinaryString(index2));*/

        }
}
