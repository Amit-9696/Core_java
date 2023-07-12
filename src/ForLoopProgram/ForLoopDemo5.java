package ForLoopProgram;

import java.util.Scanner;

public class ForLoopDemo5 {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter start point");
        int start= sc1.nextInt();
        System.out.println("Enter end point");
        int end=sc1.nextInt();
        for (int a=start;a<=end;a++){
            if (a%2==0){
                System.out.println(a+"Square is"+(a*a));
            }
            else{
            System.out.println(a + "Qube is" + (a * a * a));
        }
        }

    }
}
