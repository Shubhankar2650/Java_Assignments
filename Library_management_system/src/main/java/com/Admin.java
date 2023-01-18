package LibraryManagementSystem;

class Admin extends library {
    // call super class constructor
    public Admin() {
        super();
    }
    

    void defaultBooks() {
        Book b1 = new Book(1, "Java", "James Gosling", "Oracle", 10);
        Book b2 = new Book(2, "C++", "Bjarne Stroustrup", "Oracle", 10);
        Book b3 = new Book(3, "Python", "Guido van Rossum", "Oracle", 10);
        Book b4 = new Book(4, "C", "Dennis Ritchie", "Oracle", 10);
        Book b5 = new Book(5, "JavaScript", "Brendan Eich", "Oracle", 10);
        addBook(b1);
        addBook(b2);
        addBook(b3);
        addBook(b4);
        addBook(b5);

    }

    // Shows all books of library along with availability.
    void showAll() {
        showAllBooks();

    }
    public boolean exists(Book book) {
        for (Book b : books) {
            if (b.getName().equalsIgnoreCase(book.getName())) {
                return true;
            }
        }
        return false;
    }

    class invalidBookException extends Exception {
        public invalidBookException(String str) {
            super(str);
        }
    }
;

}
