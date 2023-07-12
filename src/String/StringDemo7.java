package String;

public class StringDemo7 {
    public static void main(String[] args) {
        String s="Java is Language";
        System.out.println(s);
        String[] courses=s.split(" ");
        for (int a=courses.length-1;a>=0;a--)
        {
            System.out.print(courses[a]+" ");
        }
    }
}
