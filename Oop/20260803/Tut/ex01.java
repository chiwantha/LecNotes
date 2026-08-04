public class ex01 {
    public static void main(String[] args) {
        Float price = Float.parseFloat(args[0]);
        Float taxRate =  0.0825;

        Float totalTax = price * taxRate;
        Float totalPrice = price + totalTax;

        System.out.println("Total Tax: " + totalTax);
        System.out.println("Total Price: " + totalPrice);
    }
}