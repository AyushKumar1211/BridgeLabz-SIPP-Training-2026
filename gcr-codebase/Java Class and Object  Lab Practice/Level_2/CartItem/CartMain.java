public class CartMain {
    public static void main(String[] args) {
        CartItem c1 = new CartItem("Shoes", 2500, 2);
        c1.display();
        c1.addItem(1);
        c1.display();
        c1.removeItem(2);
        c1.display();
    }
}
