package laboratorio4;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void applyDiscounts(Discountable discountable) {
        for (Product product : products) {
            System.out.println(product.getName() + " original price: $" + product.getPrice());
            System.out.println("Price after discount: $" + discountable.applyDiscount(product));
        }
    }
    // Apply a 10% discount 
    public static Discountable percentageDiscount = product -> product.getPrice() * 0.90;

    // discount: 15% if price > 100, otherwise 5%
    public static Discountable variableDiscount = product -> {
        if (product.getPrice() > 100) {
            return product.getPrice() * 0.85;
        } else {
            return product.getPrice() * 0.95;
        }
    };

    // Combined discount
    public static Discountable combinedDiscount = product -> {
        double intermediatePrice = percentageDiscount.applyDiscount(product);
        return variableDiscount.applyDiscount(new Accessory(product.getName(), intermediatePrice));
    };
}