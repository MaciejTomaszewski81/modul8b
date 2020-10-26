public class Ticket {
    private String name;
    private String place;
    private String type;
    private double price;
    private double promotion;
    private double originalPrice = 20;
    private int numberOfTicket;

    public Ticket(String name, String place, String type, double promotion, int numberOfTicket) {
        this.name = name;
        this.place = place;
        this.type = type;
        this.promotion = promotion;
        this.numberOfTicket = numberOfTicket;
    }

    public String getName() {
        return name;
    }

    public String getPlace() {
        return place;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPromotion() {
        return promotion;
    }

    public int getNumberOfTicket() {
        return numberOfTicket;
    }

    public double getOriginalPrice() {
        return originalPrice;
    }
}
