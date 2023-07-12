package Arrays;

public class Product {
    public void calculateBill(double[] billAmounts){
        //call gstCalculation() method and store the output into array variable
        double [] gstValues=gstCalculation(billAmounts);
        //create new array to store total amount
        double[] totalAmounts=new double[billAmounts.length];
        //perform addition of two array i.e billAmt+gstValue
        for (int a=0;a< billAmounts.length;a++){
            totalAmounts[a]=billAmounts[a]+gstValues[a];
        }
        //create three variable to store summation values
        double finalOriginalBillAmt=0.0;
        double finalGstAmt=0.0;
        double finalTotalAmt=0.0;
        //perform summation of all element from each array
        for (int a=0;a<billAmounts.length;a++){
            finalOriginalBillAmt+=billAmounts[a];
            finalGstAmt+=gstValues[a];
            finalTotalAmt+=totalAmounts[a];
        }
        //display output in given format
        System.out.println("ORG.BILL\tGST.AMT\tTOTAL.AMT");
        System.out.println("=====================================");
        for (int a=0;a<billAmounts.length;a++){
            System.out.println(billAmounts[a]+"\t\t"+gstValues[a]+"\t\t"+totalAmounts[a]);
        }
        System.out.println("____________________________________");
        System.out.println(finalOriginalBillAmt+"\t\t"+finalGstAmt+"\t\t"+finalTotalAmt);
    }
    private double[] gstCalculation(double[] billAmounts){
        //create an array to store gst amount
            double []gstAmounts=new double[billAmounts.length];
        //check each bill amount and apply respective gst
        for (int a=0;a< billAmounts.length;a++){
            //store gst amount into array
            if (billAmounts[a]<500){
                gstAmounts[a]=billAmounts[a]*0.05;
            } else if (billAmounts[a]>=500 && billAmounts[a]<2000)
            {
                gstAmounts[a]=billAmounts[a]*0.1;
            }
            else {
                gstAmounts[a]=billAmounts[a]*0.15;
            }
        }
        //return array of gst amount
        return gstAmounts;
    }
}
