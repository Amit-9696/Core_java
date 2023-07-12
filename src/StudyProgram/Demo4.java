package StudyProgram;

import java.io.File;

public class Demo4 {
    public static void main(String[] args) {
        String str="XYZ.txt";
        File file=new File(str);
        if (file.exists()){
            file.delete();
            System.out.println("File Deleted");
        }else {
            System.out.println("File Not found");
        }
    }
}
