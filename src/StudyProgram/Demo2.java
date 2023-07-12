package StudyProgram;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) throws IOException {
       Scanner sc=new Scanner(System.in);
        System.out.println("Insert the message");
        String str=sc.nextLine();
        System.out.println("Enter File Name");
        String file=sc.next();
        File f1=new File(file);
        if (f1.exists()){
            FileWriter fw=new FileWriter(file,true);
            fw.write(str);
            fw.close();
            System.out.println("Data Is Inserted");
        }else {
            System.out.println("File Not Found");
        }
    }
}
