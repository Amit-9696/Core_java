package Arrays;

public class ArrayDemo1 {
    public static void main(String[] args) {
        //declaration
        int []arr;
        //size allocation
        arr =new int[5];
        //initialization
        arr[0]=100;
        arr[1]=200;
        arr[2]=300;
        arr[3]=400;
        arr[4]=500;
        //print data
        for (int a=0;a<5;a++)
        {
            System.out.println(arr[a]);
        }
    }
}
