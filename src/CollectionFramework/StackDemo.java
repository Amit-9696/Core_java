package CollectionFramework;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Character> data=new Stack<>();
        data.push('A');
        data.push('B');
        data.push('C');
        data.push('D');
        System.out.println(data);
        data.pop();
        System.out.println(data);
        System.out.println("Top Element "+data.peek());
        System.out.println("Search Position Of A "+data.search('A'));
        System.out.println("Empty OR Not "+data.isEmpty());
        data.clear();
        System.out.println("Empty OR Not "+data.isEmpty());
    }
}
