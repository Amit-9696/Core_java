package Interface;

public class Indigo implements FlightServiceProvider{
    @Override
    public void getServiceName(String Service)
    {
        System.out.println("Service Provide Is Indigo");
    }

    @Override
    public void BookTicket(int qty) {
        double TicketCost=3000;
        double total=TicketCost*qty;
        System.out.println("Total Cost "+total);

    }
}
