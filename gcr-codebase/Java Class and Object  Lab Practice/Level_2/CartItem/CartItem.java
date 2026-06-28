public class CartItem {
    private String itemName;
    private double price;
    private int quantity;

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public void addItem(int q) {
        quantity += q;
    }

    public void removeItem(int q) {
        if (q <= quantity) {
            quantity -= q;
        } else {
            quantity = 0;
        }
    }

    public double calculateTotalCost() {
        return price * quantity;
    }

    public void display() {
        System.out.println("Item: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + calculateTotalCost());
    }
}
