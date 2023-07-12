package CollectionFramework;

public class Course {
    String CourseName;
    String BatchCode;

    public Course(String courseName, String batchCode) {
       this.CourseName = courseName;
       this.BatchCode = batchCode;
    }

    @Override
    public String toString() {
        return CourseName+"\t"+BatchCode;
    }
}
