package String;

public class StringDemo2 {
    public static void main(String[] args) {
        String s1="JAVA";
        String s2="JAVA";
        System.out.println(s1==s2);//true
        s1="CORE"+s1;
        System.out.println(s1==s2);//false
    }
}
