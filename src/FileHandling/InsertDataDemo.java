package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import static com.sun.deploy.perf.DeployPerfUtil.write;

public class InsertDataDemo {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        System.out.println("Message Insert To File");
        String data=sc.nextLine();
        System.out.println("Enter File Name");
        String file=sc.next();
        File f1=new File(file);
        if (f1.exists()){
            FileWriter fw=new FileWriter(file,true);
            fw.write(data);
            fw.close();
            System.out.println("Data Is Inserted");
        }else {
            System.out.println("File Is Not Present");
        }
    }
}
