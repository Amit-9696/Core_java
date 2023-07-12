package ForLoopProgram;
import  java.util.Scanner;

public class ForLoopDemo3 {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter Start Point");
        int start=sc1.nextInt();
        System.out.println("Enter end point");
        int end= sc1.nextInt();

        for (int a=start;a<=end;a++){
            if (a%2!=0){
                System.out.println(a);
            }

        }

    }
}
