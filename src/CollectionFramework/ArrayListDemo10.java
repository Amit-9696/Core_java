package CollectionFramework;

import java.util.ArrayList;

public class ArrayListDemo10 {
    public static void main(String[] args) {
        Course c1=new Course("JAVA","1CCM25");
        Course c2=new Course("SPRING","1EWM8");
        Course c3=new Course("J2EE","1EJM9");
        ArrayList<Course> courseList=new ArrayList<>();
        courseList.add(c1);
        courseList.add(c2);
        courseList.add(c3);
        for (Course c:courseList){
            System.out.println(c);
        }
    }
}
