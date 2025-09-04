private String title - book title
private String author - book author
private ArrayList<Integer> ratings - list of ratings (1-5 stars)
private static int totalBooks = 0 - total books created

Book(String title, String author) - initialize title and author, create empty ratings list, increment totalBooks

  public void addRating(int rating) throws IllegalArgumentException
If rating < 1 or rating > 5, throw exception with message "Invalid rating: must be 1-5 stars"
Otherwise, add to ratings list

public double getAverageRating()
Return average of all ratings
Return 0.0 if no ratings exist

  public String getPopularityLevel()
Excellent: 4.5-5.0, Good: 3.5-4.4, Average: 2.5-3.4, Poor: 1.5-2.4, Terrible: 1.0-1.4
Return "No ratings" if no ratings exist
Based on average rating

  public void addMultipleRatings(int... ratings) (Method with varargs)
Add multiple ratings at once
Use try-catch to handle invalid ratings

  public static int getTotalBooks() - return totalBooks
public String getTitle() - return title
public String getAuthor() - return author
public String displayBook()
Return: "Book: [title] by [author], Average Rating: [average], Level: [popularity]"

  
