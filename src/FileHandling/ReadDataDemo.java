package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadDataDemo {
    //Read data by using scanner
    public static void main(String[] args) throws FileNotFoundException {
        String str="Demo.txt";
        File f1=new File(str);
        Scanner sc=new Scanner(f1);
        while (sc.hasNextLine()){
            String data= sc.nextLine();
            System.out.println(data);
        }
    }
}
