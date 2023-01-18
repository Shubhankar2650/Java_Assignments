package LibraryManagementSystem;
import java.util.ArrayList;

public class library {
    //constructor
    public library() {
        System.out.println("Library constructor");
    }

    ArrayList<Book> books = new ArrayList<Book>();

    public void addBook(Book b) {
        books.add(b);   
    }

    public void showAllBooks() {
        for (Book b : books) {
            b.show();
        }
    }

    public void issueBook(int bookId) {
        for (Book b : books) {
            if (b.bookId == bookId) {
                b.issue();
                break;
            }
        }
    }

    public void depositBook(int bookId) {
        for (Book b : books) {
            if (b.bookId == bookId) {
                b.deposit();
                break;
            }
        }
    }
}
