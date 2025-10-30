public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void increaseQuantity(int amount) {
        if (amount > 0) {
            quantity += amount;
            System.out.println(amount + " units added to " + name + ".");
        } else {
            System.out.println("Invalid restock amount for " + name + ".");
        }
    }

    public void decreaseQuantity(int amount) {
        if (amount > 0 && amount <= quantity) {
            quantity -= amount;
            System.out.println(amount + " units sold from " + name + ".");
        } else {
            System.out.println("Invalid sale amount for " + name + ".");
        }
    }

    public void displayDetails() {
        System.out.println("Product: " + name + ", Price: $" + price + ", Quantity: " + quantity);
    }
}
