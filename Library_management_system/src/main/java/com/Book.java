package LibraryManagementSystem;

import java.util.Scanner;

public class Book {
    int bookId;
    String bookName;
    String author;
    String publisher;
    int quantity;

    public String getName() {
        return bookName;
    }
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter book id");
        bookId = sc.nextInt();
        System.out.println("Enter book name");
        bookName = sc.next();
        System.out.println("Enter author name");
        author = sc.next();
        System.out.println("Enter publisher name");
        publisher = sc.next();
        System.out.println("Enter quantity");
        quantity = sc.nextInt();
        sc.close();
    }

    public void show() {
        System.out.println("Book id: " + bookId);
        System.out.println("Book name: " + bookName);
        System.out.println("Author name: " + author);
        System.out.println("Publisher name: " + publisher);
        System.out.println("Quantity: " + quantity);
    }

    Book(int bookId, String bookName, String author, String publisher, int quantity) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }

    Book() {
    }

    public void issue() {
        if (quantity > 0) {
            quantity--;
        } else {
            System.out.println("Book is not available");
        }
    }

    public void deposit() {
        quantity++;
    }


}
