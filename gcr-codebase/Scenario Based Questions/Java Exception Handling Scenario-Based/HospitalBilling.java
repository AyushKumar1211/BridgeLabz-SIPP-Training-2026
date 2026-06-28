public class HospitalBilling {
    public static void main(String[] args) {
        int bills[] = {1000, 2000, 3000};
        String input = "abc";   // bad input example
        int payment = 500;
        int totalBill = 1000;

        try {
            // Division by zero
            int items = 0;
            int avg = totalBill / items;
            System.out.println("Average bill: " + avg);

            // Array out of bounds
            System.out.println(bills[5]);

            // Number format exception
            int num = Integer.parseInt(input);

            // Custom exception
            if (payment < totalBill) {
                throw new InsufficientFundsException("Payment failed: Not enough money");
            }

        } catch (ArithmeticException e) {
            System.out.println("Error: Number of items cannot be zero");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid patient index");

        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number entered");

        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String msg) {
        super(msg);
    }
}
