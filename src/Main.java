
import java.util.ArrayList;
import java.util.List;

class Book {
    private String title;
    private String author;
    private List<Integer> ratings = new ArrayList<>();

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void addRating(int rating) {
        validateRating(rating);
        ratings.add(rating);
    }

   
    public void addMultipleRatings(int... rs) {
        for (int r : rs) {
            validateRating(r);
            ratings.add(r);
        }
    }

    private void validateRating(int rating) {
        if (rating < 1 || rating > 5) {
            throw new IllegalArgumentException("Rating must be between 1 and 5. Received: " + rating);
        }
    }

    public double getAverageRating() {
        if (ratings.isEmpty()) return 0.0;
        int sum = 0;
        for (int r : ratings) sum += r;
        return (double) sum / ratings.size();
    }

    public String toString() {
        return "Book{title='" + title + "', author='" + author + "', averageRating=" + String.format("%.2f", getAverageRating()) +
               ", ratings=" + ratings +
               "}";
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
}

public class BookRatingDemo {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        Book b1 = new Book("The Crippled Man", "Harold the Crippled");
        Book b2 = new Book("The Slave African", "Mira Solari");
        Book b3 = new Book("Break a Leg Journey", "Julius the handicapped");

        books.add(b1);
        books.add(b2);
        books.add(b3);
        
        b1.addRating(4);      
        b2.addMultipleRatings(5, 4, 3, 5);
        b3.addRating(4);
        b3.addMultipleRatings(5, 4);
        
        try {
            b1.addRating(6); 
        } catch (Exception e) {
            System.out.println("Caught exception for b1: " + e.getMessage());
        }

        try {
            b2.addMultipleRatings(0, 3); 
        } catch (Exception e) {
            System.out.println("Caught exception while adding multiple to b2: " + e.getMessage());
        }

        System.out.println("Books:");
        for (Book b : books) {
            System.out.println(b.toString());
        }

        System.out.println("Total books created: " + books.size());

        Book top = null;
        double topAvg = -1.0;
        for (Book b : books) {
            double avg = b.getAverageRating();
            if (avg > topAvg) {
                topAvg = avg;
                top = b;
            }
        }

        if (top != null) {
            System.out.println("Book with highest average rating: " + top.getTitle() +
                               " by " + top.getAuthor() +
                               " (avg " + String.format("%.2f", topAvg) + ")");
        } else {
            System.out.println("No books with ratings found.");
        }
    }
}
