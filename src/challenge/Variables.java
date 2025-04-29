package challenge;
//Variable example
public class Variables {
    public static void calculateCost() {
        int pencils = 12;
        double pencilPrice = 5.0;

        double totalCost = pencils * pencilPrice;

        System.out.println("Number of Pencils: " + pencils);
        System.out.println("Price per pencil: " + pencilPrice);
        System.out.println("Total cost: " + totalCost);

    }
    public static void main(String[] args) {
        calculateCost();
    }

}
