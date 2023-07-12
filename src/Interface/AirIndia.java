package Interface;

public class AirIndia implements FlightServiceProvider{
    @Override
    public void getServiceName(String Service) {

        System.out.println("Service Provide Is AirIndia");
    }

    @Override
    public void BookTicket(int qty) {
        double TicketCost=2500;
        double total=TicketCost*qty;
        System.out.println("Total Cost "+total);

    }
}
