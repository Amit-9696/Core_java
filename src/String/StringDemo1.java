package String;

public class StringDemo1 {
    public static void main(String[] args) {
        //constant pool area
        String str1="JAVA";
        String str2="SQL";
        String str3="JAVA";
        //mom-constant pool area
        String s1=new String("J2EE");
        String s2=new String("J2EE");
        String s3=new String("JAVA");
        String s4=new String("sql");

        System.out.println(str1==str2);//false
        System.out.println(str1==str3);//true
        System.out.println(s1==s2);//false
        System.out.println(str1.equals(s3));//true
        System.out.println(str2.equals(s4));//false
        System.out.println(str2.equalsIgnoreCase(s4));//true
    }
}
