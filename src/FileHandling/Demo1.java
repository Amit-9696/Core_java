package FileHandling;

import java.io.File;

public class Demo1 {
    public static void main(String[] args) {
        String file="Demo.txt";
        File f1=new File(file);
        System.out.println("File Name Is "+f1.getPath());
        System.out.println("File Path Is "+f1.getAbsolutePath());
        System.out.println("File Is Present Or Not "+f1.exists());
        System.out.println("File Length Is "+f1.length());
    }
}
