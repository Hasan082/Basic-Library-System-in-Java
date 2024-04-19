import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LibrarySystem {

    public static Map<String, Integer> books = new HashMap<>();

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to Library System");
            System.out.println("Choose an options from Library System Menu:");
            System.out.println("For Add Book - Type: 1");
            System.out.println("For Borrow Book - Type: 2");
            System.out.println("For Return Book - Type: 3");
            System.out.println("For Exit - Type: 4");

            // Validate input to ensure it's an integer
            int option = 0;
            while (true) {
                System.out.print("Choose your option: ");
                String input = scanner.nextLine();
                try {
                    option = Integer.parseInt(input);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input! Please enter a valid integer.");
                    System.out.print("Choose your option: ");
                }
            }

            // Switch case for user input
            switch (option) {
                case 1:
                    addBooks(scanner);
                    break;
                case 2:
                    borrowBooks(scanner);
                    break;
                case 3:
                    returnBooks(scanner);
                    break;
                case 4:
                    System.out.println("Exiting from the Library System. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Option! Please enter a number between 1 and 4.");
            }
        }

    };

    // Return book from library function=========================
    private static void returnBooks(Scanner scanner) {
        System.out.println("Returning Books:");
        System.out.print("Enter the book title: ");
        String bookTitle = scanner.nextLine();

        // Return book from library if available
        if (books.containsKey(bookTitle)) {

            int currentQuantity = books.get(bookTitle);

            // Zero initialize for vlaidation, if user enter integer then we add value later
            int quantityToReturn = 0;

            while (true) {
                System.out.print("Enter the number of books to return: ");
                String input = scanner.nextLine();
                try {
                    quantityToReturn = Integer.parseInt(input);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input! Please enter a valid integer for quantity.");
                }
            }

            books.put(bookTitle, currentQuantity + quantityToReturn);
            System.out.println("Book(s) returned successfully!");
        } else {
            System.out.println("Sorry, the book does not belong to the library system.");
        }
    }

    // Borrow book from library function=========================
    private static void borrowBooks(Scanner scanner) {
        System.out.println("Borrowing Books:");
        System.out.print("Enter the book title: ");
        String bookTitle = scanner.nextLine();

        // Borrow book from library if available
        if (books.containsKey(bookTitle)) {
            int avaiableQuantity = books.get(bookTitle);

            // Zero initialize for vlaidation, if user enter integer then we add value next
            // step
            int quantityToBorrow = 0;

            // Hnadle input exception if user enter except integer
            while (true) {
                System.out.print("Enter the number of books to borrow: ");
                String input = scanner.nextLine();
                try {
                    quantityToBorrow = Integer.parseInt(input);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input! Please enter a valid integer for quantity.");
                }
            }

            if (avaiableQuantity >= quantityToBorrow) {
                books.put(bookTitle, avaiableQuantity - quantityToBorrow);
                System.out.println("Book(s) borrowed successfully!");
            } else {
                System.out.println("Sorry, the requested number of books is not available in the library.");
            }
        } else {
            System.out.println("Sorry, the book is not available in the library.");
        }
    }

    // Add book to library function=========================
    private static void addBooks(Scanner scanner) {
        System.out.println("Adding Books:");
        System.out.print("Enter the book title: ");
        String bookTitle = scanner.nextLine();
        System.out.print("Enter the author: ");
        scanner.nextLine();
        // Zero initialize for vlaidation, if user enter integer then we add value later
        int bookQuantity = 0;

        // Hnadle input exception if user enter except integer
        while (true) {
            System.out.print("Enter the quantity: ");
            String input = scanner.nextLine();
            try {
                bookQuantity = Integer.parseInt(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid integer for quantity.");
            }
        }

        // Add book to library
        if (books.containsKey(bookTitle)) {
            int currentQuantity = books.get(bookTitle);
            books.put(bookTitle, currentQuantity + bookQuantity);
        } else {
            books.put(bookTitle, bookQuantity);
        }
        System.out.println("Book(s) added successfully!");
    }
}
