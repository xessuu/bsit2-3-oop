// Book.java
class Book {
    // Attributes (public by default, no private keyword)
    String title;
    String author;
    int pages;
    boolean isAvailable;

    // Constructor
    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.isAvailable = true; // Set to true by default

        // Print message when new book is added
        System.out.println("New book '" + title + "' by " + author + " has been added to the library!");
    }

    // Method to display book information
    public void displayInfo() {
        System.out.println("Book Information ");
        System.out.println(" Title: " + title);
        System.out.println(" Author: " + author);
        System.out.println(" Pages: " + pages);
        System.out.println(" Available: " + (isAvailable ? "Yes" : "No"));
        System.out.println("");
    }

    // Method to borrow a book
    public void borrowBook() {
        isAvailable = false;
        System.out.println(" Book Borrowed");
    }

    // Method to return a book
    public void returnBook() {
        isAvailable = true;
        System.out.println(" Book Returned ");
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        System.out.println("Library Management System ");

        // Create three Book objects as required
        Book book1 = new Book("The Cotton Picker ", "Arnold SchwachNigger", 180);
        Book book2 = new Book("The Slavery", "Harold the Slave", 281);
        Book book3 = new Book("The Book of Whips(1800's)", "Demetreus Scalliwag", 328);

        System.out.println(); // Empty line for better formatting

        // Display information for all books
        System.out.println("Displaying all books in the library:");
        book1.displayInfo();
        book2.displayInfo();
        book3.displayInfo();

        // Test borrowing and returning functionality
        System.out.println("Testing borrow/return functionality:");
        System.out.println(" Borrowing books ");
        book1.borrowBook();
        book2.borrowBook();

        System.out.println(" Checking availability after borrowing ");
        book1.displayInfo();
        book2.displayInfo();

        System.out.println(" Returning books ");
        book1.returnBook();

        System.out.println(" Final status ");
        book1.displayInfo();
        book2.displayInfo();
        book3.displayInfo();
    }

}