public class MovieTicketMain {
    public static void main(String[] args) {
        MovieTicket t1 = new MovieTicket("Avengers", 0, 0);
        t1.bookTicket(12, 250);
        t1.displayDetails();
    }
}
