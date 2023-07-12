package Arrays;

public class ArrayDemo11 {
    public static void main(String[] args) {
        //declaration
        int [][] data;
        //size allocation
        data=new int[2][2];
        //initialization
        data [0][0]=100;
        data [0][1]=200;
        data [1][0]=300;
        data [1][1]=400;
        //print data
        //rows
        for (int a=0;a< data.length;a++){
            //cols
            for (int b=0;b< data.length;b++){
                System.out.print(data[a][b]+"\t\t");
            }
            System.out.println();
        }
    }
}
