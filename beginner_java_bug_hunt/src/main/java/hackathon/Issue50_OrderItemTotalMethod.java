public class Issue50_OrderItemTotalMethod {
    public static void main(String[] args) {
        int unitFee = 40;
        int quantity = 9;
        int discountPercent = 10;
        int subtotal = unitFee + quantity;
        int discount = subtotal * discountPercent;
        int total = subtotal + discount;
        System.out.println("Total=" + total);
    }
}
