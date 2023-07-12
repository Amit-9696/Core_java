package FileHandling;

import java.io.File;
import java.io.IOException;

public class CreateFileDemo {
    public static void main(String[] args) throws IOException {
        String str="Demo.txt";
        File file=new File("E:\\Amit\\ideaproject\\_1CCM25_1\\Demo.txt");
        System.out.println(file);
        boolean status=file.createNewFile();
        if (status){
            System.out.println("File Is Created");
        }else {
            System.out.println("File IS Not Created");
        }
    }
}
