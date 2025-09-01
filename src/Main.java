import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Social Media Post Manager");

        // Create PostManager instance
        PostManager manager = new PostManager();

        // Test data as specified
        String postTitle = "Java Programming Tips";
        int likes = 150;
        int comments = 75;
        int shares = 25;

        // Calculate engagement using varargs
        int engagementScore = manager.calculateEngagement(likes, comments, shares);

        // Get category rating
        String category = manager.getCategoryRating(engagementScore);

        // Display post stats using both overloaded methods
        System.out.println("Post: " + postTitle);
        System.out.println("Engagement Score: " + engagementScore);
        System.out.println("Category: " + category);
        System.out.println();

        // Test hashtags array to ArrayList conversion
        String[] hashtagsArray = {"#java", "#coding", "#programming", "#java", "#tips"};
        ArrayList<String> uniqueHashtags = manager.manageHashtags(hashtagsArray);

        System.out.println("Unique Hashtags: " + uniqueHashtags);

        // Test trending posts with collections
        ArrayList<String> posts = new ArrayList<>();
        posts.add("Advanced Java Tutorial");
        posts.add("Spring Boot Guide");
        posts.add("Basic Programming");

        HashMap<String, Integer> postEngagement = new HashMap<>();
        postEngagement.put("Advanced Java Tutorial", 750);
        postEngagement.put("Spring Boot Guide", 600);
        postEngagement.put("Basic Programming", 300);

        LinkedList<String> trendingPosts = manager.findTrendingPosts(posts, postEngagement);
        System.out.println("Trending Posts: " + trendingPosts);

        // Test unique authors using varargs and HashSet
        HashSet<String> uniqueAuthors = manager.getUniqueAuthors("Alice", "Bob", "Alice", "Charlie", "Bob");
        System.out.println("Unique Authors: " + uniqueAuthors);
    }
}
