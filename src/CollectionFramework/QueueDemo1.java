package CollectionFramework;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo1 {
    public static void main(String[] args) {
        Queue<Integer> data=new LinkedList<>();
        data.offer(50);
        data.offer(100);
        data.offer(150);
        data.offer(200);
        System.out.println(data);
        System.out.println("Head Of The Queue "+data.peek());//50
        data.poll();
        System.out.println("Head Of The Queue "+data.peek());//100
        data.poll();
        System.out.println("Head Of The Queue "+data.peek());//150
        data.poll();
        System.out.println("Head Of The Queue "+data.peek());//200
        data.poll();
        System.out.println("Head Of The Queue "+data.peek());//null
        System.out.println("Head Of The Queue "+data.element());//Exception

    }
}
