package main.Product;
/**
 * Product el objeto de los productos.
 */
public class Product {
    private final String name;
    private final int price;
    private final int amount;
    private final String category;

    public Product(String name, int price, int amount, String category ) {
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }

    public String getCategory() {
        return category;
    }

}

