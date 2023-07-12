package ExceptionHandling;

public class ExceptionDemo5 {
    public static void main(String[] args) {
        System.out.println("Program Started");
        int[] data=new int[5];
        try {
            System.out.println("try block Started");
            data [1]=20;
            data [2]=40;
            System.out.println(data[1]+"\t"+data[2]);
            System.out.println("try block ended");
            //System.exit(0);//end Point
        }catch (NullPointerException e){
            System.out.println(e);
        }finally {
            System.out.println("Closing Costly Resources");
        }
        System.out.println("Program Ended");
    }
}
