package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataDemo1 {
    //Read Data By Using File Reader
    public static void main(String[] args) throws IOException {
        String str="Demo.txt";
        File file=new File(str);
        FileReader reader=new FileReader(file);
        int i=0;
        while ((i= reader.read())!=-1){
            System.out.println((char)(reader.read()));
        }
    }
}
