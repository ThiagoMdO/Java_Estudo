package academy.devdojo.maratonajava.javacore.CompassUol.dominio;
import academy.devdojo.maratonajava.javacore.CompassUol.dominio.Review;
import java.util.ArrayList;

public class Book2 {
    private int id;
    private String name;
    private String author;
    private ArrayList<Review> review = new ArrayList<>();

    public Book2(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public void addReview(Review review) {
        this.review.add(review);
    }

    public String toString() {
        return String.format("id = %d, name = %s, author = %s, Review = [%s]",
                id, name, author, review);
    }

}
