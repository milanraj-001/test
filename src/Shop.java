import java.util.ArrayList;

class Shop {
    private ArrayList<Item> items;


    public Shop() {
        items = new ArrayList<>();
    }


    public void addProduct(Item item) {
        items.add(item);
        System.out.println("Product added successfully!");
    }


    public void removeProduct(String sku) {
        items.removeIf(item -> item.getSku().equals(sku));
        System.out.println("Product removed successfully (if SKU existed).");
    }


    public void editProduct(String sku, String newName, String newCategory) {
        for (Item item : items) {
            if (item.getSku().equals(sku)) {
                item.setName(newName);
                item.setCategory(newCategory);
                System.out.println("Product updated successfully!");
                return;
            }
        }
        System.out.println("Product with given SKU not found.");
    }


    public void listProducts() {
        if (items.isEmpty()) {
            System.out.println("No products available.");
        } else {
            System.out.println("Available products:");
            for (Item item : items) {
                System.out.println(item);
            }
        }}}