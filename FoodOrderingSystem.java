import java.util.ArrayList;

public class Food {

    private String Food;
    private String Costumer;
    private ArrayList<Integer> ratings;
    private static int totalFoods = 0;

    public Food (String Food, String Costumer) {
        this.Food = Food;
        this.Costumer = Costumer;
        this.ratings = new ArrayList<>();
        totalFoods++;
    }

    public void addRating(int rating) throws IllegalArgumentException {
        if (rating < 1 || rating > 5) {
            throw new IllegalArgumentException("Invalid Price: must be greater than 0 ");
        }
        ratings.add(rating);
    }

    public double getAverageRating() {
        if (ratings.isEmpty()) {
            return 0.0;
        }
        int sum = 0;
        for (int rating : ratings) {
            sum += rating;
        }
        return sum / (double) ratings.size();
    }

    public String getPopularityLevel() {
        double averageRating = getAverageRating();
        if (averageRating == 0.0) {
            return "No ratings";
        } else if (averageRating >= 4.5) {
            return "Excellent";
        } else if (averageRating >= 3.5) {
            return "Good";
        } else if (averageRating >= 2.5) {
            return "Average";
        } else if (averageRating >= 1.5) {
            return "Poor";
        } else {
            return "Terrible";
        }
    }

    public void addMultipleRatings(int... ratings) {
        for (int rating : ratings) {
            try {
                addRating(rating);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static int getTotalFood() {
        return totalFoods;
    }

    public String getFood() {
        return Food;
    }

    public String getCostumer() {
        return Costumer;
    }

    public String displayFood() {
        return String.format("Food: %s by %s, Average Rating: %.2f, Level: %s",
                Food, Costumer, getAverageRating(), getPopularityLevel());
    }

    public String toString() {
        return displayFood();
    }
}
