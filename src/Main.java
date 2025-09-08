public class Main {
    public static void main(String[] args) {

        Food Food1 = new Food("Burger", "Alice Johnson");
        Food Food2 = new Food("Fries", "Bob Smith");
        Food Food3 = new Food("Pizza", "Charlie Brown");

        try {
            Food1.addRating(4);
            Food1.addMultipleRatings(5, 4, 3, 5);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            Food2.addRating(6);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            Food3.addMultipleRatings(3, 4, 2, 6);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(Food1);
        System.out.println(Food2);
        System.out.println(Food3);
        System.out.println("Total Food created: " + Food.getTotalFood());
        Food highestRatedFood = HighestRatedFood(Food1, Food2, Food3);
        System.out.println("Highest Rated Food: " + highestRatedFood.displayFood());
    }

    public static Food HighestRatedFood(Food... Foods) {
        Food highestRatedFood = Foods[0];
        for (Food Food : Foods) {
            if (Food.getAverageRating() > highestRatedFood.getAverageRating()) {
                highestRatedFood = Food;
            }
        }
        return highestRatedFood;
    }
}
