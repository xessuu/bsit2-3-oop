
import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManager {
    private ArrayList<String> books;
    private Scanner scanner;

    public LibraryManager() {
        books = new ArrayList<>();
        books.add("Necromancer");
        books.add("The Substance ASSociate");
        books.add("The book of the Dead");
        scanner = new Scanner(System.in);
    }

    public void showBooks() {
        try {
            if (books == null) {
                throw new IllegalStateException("Book list is null!");
            }
            System.out.println("\n--- Current Books ---");
            if (books.isEmpty()) {
                System.out.println("No books in the library.");
            } else {
                for (int i = 0; i < books.size(); i++) {
                    System.out.println((i + 1) + ". " + books.get(i));
                }
            }
        } finally {
            System.out.println("Display operation completed.");
        }
    }

    public void addBook() {
        System.out.print("\nEnter book title to add: ");
        String title = scanner.nextLine().trim();

        try {
            if (title == null || title.isEmpty()) {
                throw new IllegalArgumentException("Book title cannot be empty!");
            }
            if (title.length() < 3) {
                throw new IllegalArgumentException("Book title must be at least 3 characters long!");
            }
            books.add(title);
            System.out.println("Book '" + title + "' added successfully!");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Add book operation completed.");
        }
    }

    public void removeBook() {
        if (books.isEmpty()) {
            System.out.println("\nNo books to remove. Library is empty.");
            System.out.println("Remove book operation completed.");
            return;
        }

        System.out.print("\nEnter book number to remove (1-" + books.size() + "): ");
        String input = scanner.nextLine().trim();

        try {
            int index = Integer.parseInt(input);
            if (index <= 0) {
                throw new IllegalArgumentException("Index must be positive!");
            }
            String removedBook = books.remove(index - 1);
            System.out.println("Book '" + removedBook + "' removed successfully!");
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid number!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid book number! Please enter between 1 and " + books.size() + ".");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Remove book operation completed.");
        }
    }

    public static void main(String[] args) {
        LibraryManager manager = new LibraryManager();

        manager.showBooks();

        manager.addBook();
        manager.addBook();
        manager.addBook();

        manager.removeBook();
        manager.removeBook();
        manager.removeBook();

        System.out.println("\nProgram completed successfully.");
    }
}
