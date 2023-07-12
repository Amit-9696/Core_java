package ObjectClass;

public class TV {
    String Company;
    double Price;

    @Override
    public String toString() {
        return Company+"\t\t"+Price;
    }

    public TV(String Company, double Price){
        this.Company=Company;
        this.Price=Price;


    }
}
