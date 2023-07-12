package StudyProgram;

import java.io.File;
import java.io.IOException;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        String str="XYZ.txt";
        File file=new File("E:\\Amit\\ideaproject\\_1CCM25_1\\XYZ.txt");
        System.out.println(file);
        boolean status=file.createNewFile();
        if (status){
            System.out.println("File Created Successfully");
        }else {
            System.out.println("File Not Created");
        }
    }
}
