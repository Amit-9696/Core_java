package demo;

public class Mobile {

    String company;

    double price;

    public Mobile(String company, double price) {
        this.company = company;
        this.price = price;
    }
    void display(){
        System.out.println(company+"\t"+price);
    }
}
