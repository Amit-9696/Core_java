package ObjectClass;

public class Demo {
    public static void main(String[] args) {
        String s1=new String("ABC");
        String s2=new String("ABC");
        String s3=new String("PQR");

        System.out.println(s1==s2);//false
        System.out.println(s1==s3);//false

        System.out.println(s1.hashCode()==s2.hashCode());//true

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
    }
}
