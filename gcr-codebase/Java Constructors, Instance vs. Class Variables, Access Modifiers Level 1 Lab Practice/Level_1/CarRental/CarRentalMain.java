public class CarRentalMain {
    public static void main(String[] args) {
        CarRental r1 = new CarRental();
        CarRental r2 = new CarRental("Sneha", "SUV", 5);

        r1.display();
        r2.display();
    }
}
