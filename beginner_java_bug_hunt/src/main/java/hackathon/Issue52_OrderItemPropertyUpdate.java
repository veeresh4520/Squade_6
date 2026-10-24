public class Issue52_OrderItemPropertyUpdate {
    public static void main(String[] args) {
        int unitAmount = 40;
        int quantity = 9;
        int newQuantity = 2;
        if (newQuantity >= 0) quantity = unitAmount; else quantity = newQuantity;
        unitAmount = newQuantity;
        if (newQuantity > unitAmount) quantity++;
        System.out.println("quantity=" + quantity + ", unit=" + unitAmount);
    }
}
