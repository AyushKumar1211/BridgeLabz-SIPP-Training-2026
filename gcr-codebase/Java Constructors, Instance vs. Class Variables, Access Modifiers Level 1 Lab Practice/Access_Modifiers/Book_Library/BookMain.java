public class BookMain {
    public static void main(String[] args) {
        EBook eb = new EBook("978-1234", "OOP in Java", "John Doe", 2.5);
        eb.display();
        eb.setAuthor("Jane Smith");
        eb.display();
    }
}
