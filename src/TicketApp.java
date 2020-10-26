public class TicketApp {
    public static void main(String[] args) {
        Engine engine = new Engine();
        Ticket ticket1 = engine.ticketGenerator();
        Ticket ticket2 = engine.ticketGenerator();
        Ticket ticket3 = engine.ticketGenerator();
        engine.ticketCalculator(ticket1);
        engine.ticketCalculator(ticket2);
        engine.ticketCalculator(ticket3);
        engine.ticketInfo(ticket1);
        System.out.println();
        engine.ticketInfo(ticket2);
        System.out.println();
        engine.ticketInfo(ticket3);
    }
}
