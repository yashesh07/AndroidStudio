package lab1;

import java.io.IOException;
import java.util.*;

public class Main {

    static Scanner scan = new Scanner(System.in);
    static FileManager fileManager = new FileManager();

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        System.out.println("\n\n⭐⭐⭐⭐⭐⭐⭐🙂🙂🙂🙂🙂🙂🙂🙂🙂🙂🙂 W-E-L-C-O-M-E 🙂🙂🙂🙂🙂🙂🙂🙂🙂🙂🙂⭐⭐⭐⭐⭐⭐⭐\n\n");

        while(true){
            System.out.println("1. Add a new book 📕");
            System.out.println("2. Search book 📚");
            System.out.println("3. Issue book 📖");
            System.out.println("4. Return book 😊");
            System.out.println("5. Exit 😭");
            System.out.println("\n--------------- Please enter your choice ---------------\n");
            System.out.print("--> ");

            int choice = scan.nextInt();

            switch (choice) {
                case 1 -> addNewBook();
                case 2 -> searchBook();
                case 3 -> issueBook();
                case 4 -> returnBook();
                case 5 -> System.exit(1);
                default -> System.out.println("\n**Invalid choice**");
            }
        }
    }
    
    public static void addNewBook() throws IOException, ClassNotFoundException {
        String bookTitle;
        String publisher;
        String authorName;
        int numberOfCopies;

        scan.nextLine();
        System.out.print("\nEnter book title : ");
        bookTitle = scan.nextLine();

        System.out.print("Enter publisher : ");
        publisher = scan.nextLine();

        System.out.print("Enter author name : ");
        authorName = scan.nextLine();

        System.out.print("Enter number of copies : ");
        numberOfCopies = scan.nextInt();
        System.out.println();

        List<Book> library = new ArrayList<>();
        library = fileManager.loadBooks();

        boolean alreadyAvailable = false;

        for (Book book : library) {
            if (bookTitle.toLowerCase().equals(book.getBookTitle().toLowerCase())
                    && publisher.toLowerCase().equals(book.getPublisher().toLowerCase())
                    && authorName.toLowerCase().equals(book.getAuthorName().toLowerCase())) {
                alreadyAvailable = true;
                book.setTotalCopies(book.getTotalCopies() + numberOfCopies);
                book.setAvailableCopies(book.getAvailableCopies() + numberOfCopies);
                break;
            }
        }

        if(!alreadyAvailable){
            Book book = new Book(generateBookID(), bookTitle, publisher, authorName, numberOfCopies);
            library.add(book);
        }

        fileManager.saveBooks(library);

        System.out.println("Book added successfully 🙌🙌🙌\n\n");

        System.out.println("Press any key to continue ⏩⏩⏩⏩⏩⏩⏩");
        scan.nextLine();
        scan.nextLine();
    }

    public static void searchBook() throws IOException, ClassNotFoundException {
        String bookTitle;

        scan.nextLine();
        System.out.print("\nEnter the title of book or write some keyword to search the books : ");
        bookTitle = scan.nextLine();
        System.out.println();

        List<Book> library = new ArrayList<>();
        library = fileManager.loadBooks();

        List<Book> availableBooks = new ArrayList<>();

        for (Book book : library) {
            if (book.getBookTitle().length()>=bookTitle.length() && bookTitle.toLowerCase().equals(book.getBookTitle().toLowerCase().substring(0, bookTitle.length()))) {
                availableBooks.add(book);
            }
        }

        if(availableBooks.size()==0){
            System.out.println("No books found for the given search. Please try again with different search. 🙏🙏");
        }
        else{
            for (Book book : availableBooks) {
                System.out.println(book.bookDetails());
            }
        }

        System.out.println("\n\nPress any key to continue ⏩⏩⏩⏩⏩⏩⏩");
        scan.nextLine();
    }

    public static void issueBook() throws IOException, ClassNotFoundException {
        String bookID;

        scan.nextLine();
        System.out.print("\nEnter the Book ID of the book that you want to issue : ");
        bookID = scan.nextLine();
        System.out.println();

        List<Book> library = new ArrayList<>();
        library = fileManager.loadBooks();

        boolean isAvailable = false;
        String bookDetails = "";

        for (Book book : library) {
            if (bookID.toLowerCase().equals(book.getBookID().toLowerCase()) && book.getAvailableCopies()>0) {
                isAvailable = true;
                book.setAvailableCopies(book.getAvailableCopies() - 1);
                bookDetails = "Book ID : " + book.getBookID() + " (Please remember the book ID, it will needed while returning the book.)\nBook Title : " + book.getBookTitle() + "\nAuthor name : " + book.getAuthorName() + "\nPublisher : " + book.getPublisher();
                break;
            }
        }

        if(isAvailable){
            System.out.println("\n\nYou issued the following book:\n" + bookDetails);
            System.out.println("\nHave a good day. 😊😊\n\n");
        }
        else{
            System.out.println("Sorry this book is currently not available 🚫. Please try again after some days. 🙏\n");
        }

        fileManager.saveBooks(library);

        System.out.println("Press any key to continue ⏩⏩⏩⏩⏩⏩⏩");
        scan.nextLine();
    }

    public static void returnBook() throws IOException, ClassNotFoundException {
        String bookID;

        scan.nextLine();
        System.out.print("\nEnter the Book ID of the book that you want to return : ");
        bookID = scan.nextLine();
        System.out.println();

        List<Book> library = new ArrayList<>();
        library = fileManager.loadBooks();

        boolean isAvailable = false;
        String bookDetails = "";

        for (Book book : library) {
            if (bookID.toLowerCase().equals(book.getBookID().toLowerCase()) && book.getAvailableCopies()<book.getTotalCopies()) {
                isAvailable = true;
                book.setAvailableCopies(book.getAvailableCopies() + 1);
                bookDetails = "Book ID : " + book.getBookID() + " \nBook Title : " + book.getBookTitle() + "\nAuthor name : " + book.getAuthorName() + "\nPublisher : " + book.getPublisher();
                break;
            }
        }

        if(isAvailable){
            System.out.println("\n\nYou returned the following book:\n" + bookDetails);
            System.out.println("\nHave a good day. 😊😊\n\n");
        }
        else{
            System.out.println("Sorry this book is not belonging to this library or you may have written incorrect book ID 🚫.\n");
        }

        fileManager.saveBooks(library);

        System.out.println("Press any key to continue ⏩⏩⏩⏩⏩⏩⏩");
        scan.nextLine();
    }

    public static String generateBookID(){
        return String.valueOf(System.currentTimeMillis());
    }
}
