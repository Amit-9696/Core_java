package Abstract;

public class Central extends Master{
    Central(){
        super(10);
        System.out.println("SubClass Constructor");
    }

    @Override
    void test() {
        System.out.println("Test Method");
    }
}
