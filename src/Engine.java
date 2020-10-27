import java.util.Scanner;

public class Engine {
    private int ticketCounter = 0;
    private final String ONLINE = "online";
    private final String STANDARD = "standard";
    private final String GIFT = "gift";

    public void ticketCalculator(Ticket ticket) {
        if (ticket.getType().equals(ONLINE) && ticket.getPromotion() > 0) {
            ticket.setPrice(ticket.getOriginalPrice() * (1 - ticket.getPromotion()));
        } else if (ticket.getType().equals(STANDARD)) {
            ticket.setPrice((ticket.getOriginalPrice() * (1 - ticket.getPromotion())) + 5);
        } else if (ticket.getType().equals(GIFT)) {
            ticket.setPrice(((ticket.getOriginalPrice() * (1 - ticket.getPromotion())) + 5) + ((ticket.getOriginalPrice() * (1 - ticket.getPromotion())) * 0.05));
        } else System.out.println("kolega mówi że zły typ biletu wybrałeś, popraw się");
    }

    public Ticket ticketGenerator() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwę biletu: ");
        String name = scanner.nextLine();
        System.out.println("Podaj miejscę wydarzenia: ");
        String place = scanner.nextLine();
        System.out.println("Podaj typ biletu: ");
        String type = scanner.nextLine();
        System.out.println("Podaj zniżkę biletu: ");
        double promotion = scanner.nextDouble();
        ticketCounter++;
        return new Ticket(name, place, type, promotion, ticketCounter);
    }

    public void showTicketInfo(Ticket ticket) {
        System.out.println("Nazwa wydarzenia: " + ticket.getName());
        System.out.println("Miejsce wydarzenia: " + ticket.getPlace());
        if (ticket.getType().equals(ONLINE)) {
            System.out.println("Bilet internetowy");
        } else if (ticket.getType().equals(STANDARD)) {
            System.out.println("Bilet Standardowy");
        } else if (ticket.getType().equals(GIFT)) {
            System.out.println("Bilet prezentowy");
        } else System.out.println("Zły typ biletu");

        System.out.println("Cena koncowa biletu: " + ticket.getPrice());
        System.out.println("Zniżka: " + ticket.getPromotion());
        System.out.println("Oryginalna cena biletu: " + ticket.getOriginalPrice());
        System.out.println("Numer seryjny unikalny biletu: " + ticket.getNumberOfTicket());
    }
}
