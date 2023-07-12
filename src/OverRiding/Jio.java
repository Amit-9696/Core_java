package OverRiding;

public class Jio extends TelecomService{
    double[] rechargeCostForPrepaid={149,249};
    double[] RechargeCostForPostpaid={299,349};

    @Override
    void Recharge(String type, double ChoicePlan) {
        if (type.equalsIgnoreCase("Prepaid")){
            if (ChoicePlan==1){
                double Cost=rechargeCostForPrepaid[0];
                double total=Cost+Cost*0.05;
                System.out.println("Total Recharge Amt "+total);
            } else if (ChoicePlan==2) {
                double Cost=rechargeCostForPrepaid[1];
                double total=Cost+Cost*0.05;
                System.out.println("Total Recharge Amt "+total);
            }
        } else if (type.equalsIgnoreCase("Postpaid")) {
            if (ChoicePlan==1){
                double Cost=RechargeCostForPostpaid[0];
                double total=Cost+Cost*0.05;
                System.out.println("Total Recharge Amt "+total);
            } else if (ChoicePlan==2) {
                double Cost=RechargeCostForPostpaid[1];
                double total=Cost+Cost*0.05;
                System.out.println("Total Recharge Amt "+total);
            }
        }

    }
}
