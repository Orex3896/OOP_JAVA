package HW_OOP.HW1;

import java.util.List;

public class VendingMachine {

    private final List<Product> products;

    public VendingMachine(List<Product> products) {
        this.products = products;
    }
    public AlpenGold getChocolate(String name, double callory) {
        for (Product product: products){
            if(product instanceof AlpenGold){
                AlpenGold chocolate = ((AlpenGold)products);
                if(chocolate.name.equals(name) && chocolate.getCallory() ==callory)
                    return chocolate;
            }
        }
        return null;
    }
}
