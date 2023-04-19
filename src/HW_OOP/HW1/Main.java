package HW_OOP.HW1;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.name = "Nestle";
        product1.callory = 300.50;

        System.out.println(product1.displayInfo());

        Product product2 = new Product("AlpenGold",150.2);

        System.out.println(product2.displayInfo());
}}
