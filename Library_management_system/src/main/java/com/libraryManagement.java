package LibraryManagementSystem;

import java.util.Scanner;

public class libraryManagement {
    // method to take input from user
    public static void inputBook() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter book id");
        int bookId = sc.nextInt();
        System.out.println("Enter book name");
        String bookName = sc.next();
        System.out.println("Enter author name");
        String author = sc.next();
        System.out.println("Enter publisher name");
        String publisher = sc.next();
        System.out.println("Enter quantity");
        int quantity = sc.nextInt();
        sc.close();

        Book b = new Book(bookId, bookName, author, publisher, quantity);
    }

    public static void main(String[] args) {
        // take input from user

        inputBook();

        Book b1 = new Book(1, "Java", "James", "Oracle", 10);
        Book b2 = new Book(2, "Python", "Guido", "Oracle", 5);
        Book b3 = new Book(3, "C++", "Bjarne", "Oracle", 15);

        b1.show();
        b2.show();
        b3.show();

        library l = new library();

        l.addBook(b1);
        l.addBook(b2);
        l.addBook(b3);
        l.showAllBooks();

        l.issueBook(1);
        l.issueBook(2);
        l.issueBook(3);

        l.showAllBooks();

        l.depositBook(1);
        l.depositBook(2);
        l.depositBook(3);

        l.showAllBooks();

    }

}
