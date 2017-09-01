package com.popov.collections;

import java.util.*;


/**
 * Created by Andrey on 21.08.2017.
 */
public class CollectionsTest {
        public static void main(String[] args) {
                //AbstractCollection
                List<String> l = new ArrayList();
                List<String> ll = new LinkedList();
                List<String> lll = new Vector();
                Deque<String> strings = new LinkedList<String>();
                Deque<String> d = new ArrayDeque<String>();

                PriorityQueue<String> pq = new PriorityQueue<>();

                Queue<Integer> q = new QueueImpl<>();
                q.offer(5);
                System.out.println(q.toString());
                q.offer(6);
                System.out.println(q.toString());
                q.offer(7);
                System.out.println(q.toString());
                q.offer(8);
                System.out.println(q.toString());

                q.poll();
                System.out.println(q.toString());
                q.poll();
                System.out.println(q.toString());
                /*q.poll();
                System.out.println(q.toString());*/


                q.offer(9);
                System.out.println(q.toString());




            /*    Stack<Integer> stack = new StackImpl<Integer>();
                stack.push(5);
                System.out.println(stack);
                stack.push(6);
                System.out.println(stack);

                stack.pop();
                System.out.println(stack);
                stack.pop();
                System.out.println(stack);

                stack.pop();
                System.out.println(stack);*/


        }
}
