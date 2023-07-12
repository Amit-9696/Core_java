package String;

public class StringDemo8 {
    public static void main(String[] args) {
        String s="java j2ee wt react";
        System.out.println(s);
        String [] courses=s.split(" ");
        for (int a=0;a<courses.length;a++)
        {
            System.out.println(courses[a]);
        }
    }
}
