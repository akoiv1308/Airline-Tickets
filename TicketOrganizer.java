import java.util.*;

public class TicketOrganizer
{
    private ArrayList<AirlineTicket> tickets;
    
    TicketOrganizer(ArrayList<AirlineTicket> tickets) {
        this.tickets = tickets;
    }
    
    public ArrayList<AirlineTicket> getTickets() {
        return tickets;
    }
    
    public void printPassengersByBoardingGroup() {
        int count = 0;
        for(int i = 1; i <= 5; i++) {
            System.out.println("Boarding Group " + i + ":");
            for(AirlineTicket ticket: tickets) {
                if(ticket.getBoardingGroup() == i) {
                    System.out.println(ticket.getName());
                }
            }
        }
    }
    
    public void canBoardTogether() {
        int count = 0;
        for(int i = 1; i < tickets.size(); i++) {
            if(tickets.get(i-1).getRow() == tickets.get(i).getRow() && tickets.get(i-1).getBoardingGroup() == tickets.get(i).getBoardingGroup()) {
                System.out.println("Passenger "+ (i) + " can board with Passenger " + (i+1) + ".");
                count++;
            }
        }
        if(count == 0) {
            System.out.println("There are no passengers with the same row and boarding group.");
        }
        
    }

    
}
