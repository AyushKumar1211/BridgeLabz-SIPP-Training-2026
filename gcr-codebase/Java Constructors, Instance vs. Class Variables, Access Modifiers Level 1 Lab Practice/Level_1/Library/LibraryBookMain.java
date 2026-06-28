public class LibraryBookMain {
    public static void main(String[] args) {
        LibraryBook book1 = new LibraryBook("OOP Concepts", "John Smith", 250.0, true);
        book1.display();
        book1.borrowBook();
        book1.borrowBook();
    }
}
