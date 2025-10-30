public class Inventory {
    private Product[] products;

    public Inventory(Product[] products) {
        this.products = products;
    }

    public Product[] getProducts() {
        return products;
    }

    public Product findHighestQuantity() {
        Product highest = products[0];
        for (int i = 1; i < products.length; i++) {
            if (products[i].getQuantity() > highest.getQuantity()) {
                highest = products[i];
            }
        }
        return highest;
    }

    public void displayAll() {
        for (Product p : products) {
            p.displayDetails();
        }
    }
}
