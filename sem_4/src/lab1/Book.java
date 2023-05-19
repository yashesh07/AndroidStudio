package lab1;

import java.io.Serial;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Book implements Serializable {
    @Serial
    private static final long serialVersionUID = 6529685098267757690L;
    private final String bookID;
    private final String bookTitle;
    private final String publisher;
    private final String authorName;
    private int totalCopies;
    private int availableCopies;

    public Book(String bookID, String bookTitle, String publisher, String authorName, int numberOfCopies) {
        this.bookID = bookID;
        this.bookTitle = bookTitle;
        this.publisher = publisher;
        this.authorName = authorName;
        this.totalCopies = numberOfCopies;
        this.availableCopies = numberOfCopies;
    }

    public String getBookID() {
        return bookID;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getAuthorName() {
        return authorName;
    }

    public int getTotalCopies() {
        return totalCopies;
    }

    public void setTotalCopies(int totalCopies) {
        this.totalCopies = totalCopies;
    }

    public int getAvailableCopies() {
        return availableCopies;
    }

    public void setAvailableCopies(int availableCopies) {
        this.availableCopies = availableCopies;
    }

    public String bookDetails() {
        return "\n\nBook ID : " + this.bookID +
                "\nBook Title : " + this.bookTitle +
                "\nPublisher : " + this.publisher +
                "\nAuthor : " + this.authorName +
                "\nNumber of available copies : " + this.availableCopies;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookID='" + bookID + '\'' +
                ", bookTitle='" + bookTitle + '\'' +
                ", publisher='" + publisher + '\'' +
                ", authorName='" + authorName + '\'' +
                ", totalCopies='" + totalCopies + '\'' +
                ", availableCopies='" + availableCopies + '\'' +
                '}';
    }
}
