package FileHandling;

import java.io.File;

public class DeleteFileDemo {
    public static void main(String[] args) {
        String str="Demo.txt";
        File file=new File(str);
        if (file.exists()){
            file.delete();
            System.out.println("File Has Been deleted");
        }else {
            System.out.println("File Not Present");
        }
    }
}
