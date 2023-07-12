package StudyProgram;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Demo6 {
    public static void main(String[] args) throws FileNotFoundException {
        String str="ABC.txt";
        File f1=new File(str);
        Scanner sc=new Scanner(f1);
        while (sc.hasNextLine()){
            String data=sc.nextLine();
            System.out.println(data);
        }
    }
}
