public class Issue55_OrderItemStringSearch {
    public static void main(String[] args) {
        String[] ids = new String[] {"A6", "B6", "C6"};
        String target = new String("B6");
        int found = 0;
        for (int i = 1; i < ids.length - 1; i++) { if (ids[i] == target) found = i; else found = i - 1; }
        System.out.println("Index=" + found);
    }
}
