package String;

public class StringDemo4 {
    public static void main(String[] args) {
        String str="MAHARASHTRA";
        System.out.println(str);
        char[] data=str.toCharArray();
        for (int a=0;a< data.length;a++)
        {
            System.out.println(data[a]);
        }
        //reverse string
        System.out.println("=============================");
        for (int a= data.length-1;a>=0;a--)
        {
            System.out.println(data[a]);
        }
    }
}
//output:-MAHARASHTRA
//M
//A
//H
//A
//R
//A
//S
//H
//T
//R
//A
//=============================
//A
//R
//T
//H
//S
//A
//R
//A
//H
//A
//M