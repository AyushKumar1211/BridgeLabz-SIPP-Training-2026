public class ItemMain {
    public static void main(String[] args) {
        Item i1 = new Item(101, "Laptop", 55000);
        Item i2 = new Item(102, "Headphones", 2000);
        i1.displayDetails();
        System.out.println("Total Cost for 2: " + i1.calculateTotalCost(2));
        i2.displayDetails();
        System.out.println("Total Cost for 3: " + i2.calculateTotalCost(3));
    }
}
