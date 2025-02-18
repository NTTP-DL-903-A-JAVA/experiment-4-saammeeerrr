import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListOperations {
    public static void main(String[] args) {
        List<String> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Display");
            System.out.println("4. Search");
            System.out.println("5. Update");
            System.out.println("6. Exit");
            System.out.print("Enter your choice (1-6): ");

            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    System.out.print("Enter the string to insert: ");
                    String newItem = scanner.nextLine();
                    items.add(newItem);
                    System.out.println("'" + newItem + "' has been inserted into the list.");
                    break;

                case "2":
                    if (items.isEmpty()) {
                        System.out.println("The list is empty. Nothing to delete!");
                    } else {
                        System.out.print("Enter the string to delete: ");
                        String delItem = scanner.nextLine();
                        if (items.contains(delItem)) {
                            items.remove(delItem);
                            System.out.println("'" + delItem + "' has been removed from the list.");
                        } else {
                            System.out.println("'" + delItem + "' was not found in the list.");
                        }
                    }
                    break;

                case "3":
                    if (items.isEmpty()) {
                        System.out.println("The list is empty.");
                    } else {
                        System.out.println("Current list items:");
                        for (int i = 0; i < items.size(); i++) {
                            System.out.println((i + 1) + ". " + items.get(i));
                        }
                    }
                    break;

                case "4":
                    System.out.print("Enter the string to search: ");
                    String searchItem = scanner.nextLine();
                    int index = items.indexOf(searchItem);
                    if (index != -1) {
                        System.out.println("'" + searchItem + "' found at position " + (index + 1) + ".");
                    } else {
                        System.out.println("'" + searchItem + "' not found in the list.");
                    }
                    break;

                case "5":
                    if (items.isEmpty()) {
                        System.out.println("The list is empty. Nothing to update!");
                    } else {
                        System.out.print("Enter the string to update: ");
                        String oldItem = scanner.nextLine();
                        int oldIndex = items.indexOf(oldItem);
                        if (oldIndex != -1) {
                            System.out.print("Enter the new string: ");
                            String newString = scanner.nextLine();
                            items.set(oldIndex, newString);
                            System.out.println("'" + oldItem + "' has been updated to '" + newString + "'.");
                        } else {
                            System.out.println("'" + oldItem + "' was not found in the list.");
                        }
                    }
                    break;

                case "6":
                    System.out.println("Exiting the program. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
            }
        }
    }
}
