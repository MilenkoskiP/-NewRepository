public class Main {
    public static void main(String[] args) {
        Product[] items = new Product[5];
        items[0] = new Product("Laptop", 999.99, 10);
        items[1] = new Product("Smartphone", 499.99, 25);
        items[2] = new Product("Headphones", 79.99, 50);
        items[3] = new Product("Monitor", 199.99, 15);
        items[4] = new Product("Keyboard", 49.99, 30);

        Inventory inventory = new Inventory(items);

        System.out.println("Initial Inventory:");
        inventory.displayAll();

        System.out.println("\nRestocking Products:");
        items[0].increaseQuantity(5);
        items[2].increaseQuantity(20);

        System.out.println("\nUpdating Sales:");
        items[1].decreaseQuantity(5);
        items[3].decreaseQuantity(10);
        items[4].decreaseQuantity(15);

        System.out.println("\nUpdated Inventory:");
        inventory.displayAll();

        System.out.println("\nProduct with the Highest Quantity:");
        Product highest = inventory.findHighestQuantity();
        highest.displayDetails();
    }
}