package HW_OOP.HW1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.name = "Nestle";
        product1.callory = 300.50;

        System.out.println(product1.displayInfo());


        Product product3 = new Product();
        System.out.println(product3.displayInfo());

        Product product4 = new Product("Шоколад 100",300);

        Product product5 = new Product("Шоколад 300",900);


        List<Product> products = new ArrayList<>();
        products.add(product5);
        products.add(product4);

        VendingMachine vendingMachine = new VendingMachine(products);

        AlpenGold chocolateRes = vendingMachine.getChocolate("Шоколад 100",300);
        if(chocolateRes!= null){
            System.out.println("Вы купили: ");
            System.out.println(chocolateRes.displayInfo());
        }
        else {
            System.out.println("Такой шоколадки нет в автомате");
        }
}}
