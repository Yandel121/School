import java.util.ArrayList;
import java.util.Scanner;

// File: Book_Tracker.java
// Author: Yandel Colon Rivera
// Date: 2025-16-9
// Class: COMP 2400 OOP
// Description: Keeps track of the number of books created and outputs a book's information.
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
        System.out.println("Title:"+book_name+" , Author:" + author);
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
        System.out.println ("Books in our library:"+Book_Tracker.count);
    }
}
