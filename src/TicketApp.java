public class TicketApp {
    public static void main(String[] args) {
        Engine engine = new Engine();
        Ticket ticket1 = engine.ticketGenerator();
        Ticket ticket2 = engine.ticketGenerator();
        Ticket ticket3 = engine.ticketGenerator();
        engine.ticketCalculator(ticket1);
        engine.ticketCalculator(ticket2);
        engine.ticketCalculator(ticket3);
        engine.showTicketInfo(ticket1);
        System.out.println();
        engine.showTicketInfo(ticket2);
        System.out.println();
        engine.showTicketInfo(ticket3);
    }
}
