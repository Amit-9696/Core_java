package ExceptionHandling;

import java.io.FileWriter;
import java.io.IOException;

public class ExceptionDemo6 {
    public static void main(String[] args) {
        String Message="Core java is nothing but jse";
        FileWriter fw=null;
        //checked exception
        try {
            fw=new FileWriter("E://Amit//master.txt");
            fw.write(Message);
            System.out.println("File Created Successfully");
        } catch (IOException e) {
            System.out.println(e);
        }finally {
            try {
                fw.close();//Closing Costly Resources
            }catch (IOException e) {
                System.out.println(e);
            }
        }
    }
}
