package Overloading;

public class MainApp4 {
    public static void main(String[] args) {
        System.out.println("First Main Method");
        main(25);
        main('J');
    }

    public static void main(int a) {
        System.out.println("A Value "+a);
        System.out.println("Second Main Method");
    }

    public static void main(char arg) {
        System.out.println("ARG "+arg);
        System.out.println("Third Main Method");
    }
}
