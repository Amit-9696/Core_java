package CollectionFramework;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo2 {
    public static void main(String[] args) {
        Queue<Integer> data=new PriorityQueue<>();
        data.offer(78);
        data.offer(24);
        data.offer(37);
        data.offer(15);
        System.out.println(data);
    }
}
//O/p:-15 24 37 78