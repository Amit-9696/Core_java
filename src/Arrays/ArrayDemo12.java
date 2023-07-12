package Arrays;

public class ArrayDemo12 {
    public static void main(String[] args) {
        String[][] emp;
        emp=new String[5][2];
        emp[0][0]="Abc";
        emp[0][1]="desg";
        emp[1][0]="rushi";
        emp[1][1]="mng";
        emp[2][0]="yash";
        emp[2][1]="dev";
        emp[3][0]="om";
        emp[3][1]="test";
        emp[4][0]="patil";
        emp[4][1]="test";
        System.out.println("EMPNAME\t\tDESG");
        System.out.println("====================");
        for (int a=0;a< emp.length;a++){
            for (int b=0;b< emp[a].length;b++){
                System.out.print(emp[a][b]+"\t\t");
            }
            System.out.println();
        }

    }
}
