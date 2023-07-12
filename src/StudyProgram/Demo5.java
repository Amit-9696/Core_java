package StudyProgram;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Demo5 {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Message");
        String str=sc.nextLine();
        System.out.println("Enter File Name");
        String file=sc.next();
        File f1=new File(file);
        if (f1.exists()){
            FileWriter fw=new FileWriter(file,true);
            fw.write(str);
            fw.close();
            System.out.println("Message Add Successfully");
        }else {
            System.out.println("File Not Fund");
        }

    }
}
