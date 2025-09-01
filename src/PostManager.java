import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class PostManager {


    public int calculateEngagement(int... interactions) {
        if (interactions.length == 0) {
            return 0;
        }

        int total = 0;
        for (int interaction : interactions) {
            total += interaction;
        }
        return total;
    }


    public String getCategoryRating(int engagementScore) {
        if (engagementScore >= 1000) {
            return "Viral";
        } else if (engagementScore >= 500) {
            return "Popular";
        } else if (engagementScore >= 100) {
            return "Good";
        } else if (engagementScore >= 50) {
            return "Low";
        } else {
            return "Poor";
        }
    }


    public void displayPostStats(String postTitle, int engagementScore) {
        System.out.println("Post: " + postTitle);
        System.out.println("Engagement Score: " + engagementScore);
    }


    public void displayPostStats(String postTitle, int engagementScore, String category) {
        System.out.println("Post: " + postTitle);
        System.out.println("Engagement Score: " + engagementScore);
        System.out.println("Category: " + category);
    }


    public ArrayList<String> manageHashtags(String[] hashtags) {
        if (hashtags == null) {
            return new ArrayList<>();
        }

        ArrayList<String> uniqueHashtags = new ArrayList<>();

        for (String hashtag : hashtags) {
            if (!uniqueHashtags.contains(hashtag)) {
                uniqueHashtags.add(hashtag);
            }
        }

        return uniqueHashtags;
    }


    public LinkedList<String> findTrendingPosts(ArrayList<String> posts, HashMap<String, Integer> postEngagement) {
        LinkedList<String> trendingPosts = new LinkedList<>();

        if (posts == null || postEngagement == null) {
            return trendingPosts;
        }

        for (String post : posts) {
            Integer engagement = postEngagement.get(post);
            if (engagement != null && engagement > 500) {
                trendingPosts.add(post);
            }
        }

        return trendingPosts;
    }


    public HashSet<String> getUniqueAuthors(String... authors) {
        HashSet<String> uniqueAuthors = new HashSet<>();

        for (String author : authors) {
            if (author != null && !author.trim().isEmpty()) {
                uniqueAuthors.add(author);
            }
        }

        return uniqueAuthors;
    }
}
