
import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private String author;
    private ArrayList<Integer> ratings;
    private static int totalBooks = 0;

   
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.ratings = new ArrayList<>();
        totalBooks++;
    }

    public void addRating(int rating) throws IllegalArgumentException {
        if (rating < 1 || rating > 5) {
            throw new IllegalArgumentException("Invalid rating: must be 1-5 stars");
        }
        ratings.add(rating);
    }

    public double getAverageRating() {
        if (ratings.isEmpty()) {
            return 0.0;
        }
        int sum = 0;
        for (int r : ratings) {
            sum += r;
        }
        return (double) sum / ratings.size();
    }
    public String getPopularityLevel() {
        if (ratings.isEmpty()) {
            return "No ratings";
        }

        double avg = getAverageRating();
        if (avg >= 4.5 && avg <= 5.0) {
            return "Excellent";
        } else if (avg >= 3.5 && avg <= 4.4) {
            return "Good";
        } else if (avg >= 2.5 && avg <= 3.4) {
            return "Average";
        } else if (avg >= 1.5 && avg <= 2.4) {
            return "Poor";
        } else if (avg >= 1.0 && avg <= 1.4) {
            return "Useless";
        } else {
            return "No ratings";
        }
    }


    public void addMultipleRatings(int... ratings) {
        for (int r : ratings) {
            try {
                addRating(r);
            } catch (IllegalArgumentException e) {
               
            }
        }
    }

  
    public static int getTotalBooks() {
        return totalBooks;
    }


    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String displayBook() {
        double avg = getAverageRating();
        String avgStr = (ratings.isEmpty()) ? "0.0" : String.format("%.2f", avg);
        String level = getPopularityLevel();
        return "Book: [" + title + "] by [" + author + "], Average Rating: [" + avgStr + "], Level: [" + level + "]";
    }
}
