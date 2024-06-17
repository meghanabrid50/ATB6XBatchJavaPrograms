package june.ex_01062024;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Lab251 {
    public static void main(String[] args) {
        Queue q = new PriorityQueue();
        q.add("A");
        q.add("B");
        q.add("C");
        q.add("C");
        q.offer("D");
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q);

        Iterator it = q.iterator();
        while (it.hasNext()){
            System.out.println(it.next() + " ");
        }

    }
}
