import java.util.Scanner;

public  class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shop shop = new Shop();

        while (true) {
            System.out.println("\n--- Shop Management System ---");
            System.out.println("1. Add Product");
            System.out.println("2. Remove Product");
            System.out.println("3. Edit Product");
            System.out.println("4. List Products");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter product name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter product category: ");
                    String category = scanner.nextLine();
                    System.out.print("Enter product SKU: ");
                    String sku = scanner.nextLine();
                    shop.addProduct(new Item(name, category, sku));
                    break;

                case 2:
                    System.out.print("Enter SKU of product to remove: ");
                    String removeSku = scanner.nextLine();
                    shop.removeProduct(removeSku);
                    break;

                case 3:
                    System.out.print("Enter SKU of product to edit: ");
                    String editSku = scanner.nextLine();
                    System.out.print("Enter new name: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter new category: ");
                    String newCategory = scanner.nextLine();
                    shop.editProduct(editSku, newName, newCategory);
                    break;

                case 4:
                    shop.listProducts();
                    break;

                case 5:
                    System.out.println("Exiting system. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}