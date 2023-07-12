package ArrayTest1;

public class Que3 {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        int length= arr.length;

        int sum=0;


        for (int a=0;a< arr.length;a++){
            sum +=arr[a];

        }
        double avg = sum /length;
        System.out.println("Average Value of an Array is:"+avg);
    }
}
