package WrapperClass;

public class Demo2 {
    public static void main(String[] args) {
        String s1="50";
        String s2="20";
        System.out.println(s1+s2);//5020
        //parse string into integer
        int no1=Integer.parseInt(s1);
        int no2=Integer.parseInt(s2);
        System.out.println(no1+no2);//70

        double v1=45.25;
        double v2=30.25;
        String str1=Double.toString(v1);
        String str2=Double.toString(v2);
        System.out.println(str1+str2);//45.2530.25

    }
}
