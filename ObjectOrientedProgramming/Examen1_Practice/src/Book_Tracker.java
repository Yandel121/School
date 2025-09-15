import java.util.ArrayList;
import java.util.Scanner;
public class Book_Tracker {
    private String book_name;
    private String author;
    private static int count;

    public Book_Tracker(String book_name, String author) {
        this.book_name = book_name;
        this.author = author;
        count++;
    }

    public void printBooks() {
        System.out.println(book_name+" " + author);
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Book_Tracker> books = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter the name of the book: ");
            String title = sc.nextLine();
            System.out.println("Enter the author of the book: ");
            String author = sc.nextLine();

            books.add(new Book_Tracker(title, author));

        }

        books.get(0).printBooks();
        books.get(1).printBooks();
        books.get(2).printBooks();
        count();

    }
    public static void count(){
        System.out.println (Book_Tracker.count);
    }
}
