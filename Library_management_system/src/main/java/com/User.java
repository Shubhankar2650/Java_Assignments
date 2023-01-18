package LibraryManagementSystem;

class User extends Books {
	
	private String name;
    private String email;
    private String password;

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    // Books available in the library (show the book whose availability is true)
    void booksAvailable() {
    	
    };

    void rentBook(String Book) {
        try {
       
            throw new invalidBookException("This book is not available in the library");
        } catch (invalidBookException e) {
            System.out.println("invalidBookException occured:" + e);
        }
    };
    void returnBook(String Book) {
        try {
            throw new invalidBookException("This book does not belong to this library.");
        } catch (invalidBookException e) {
            System.out.println("invalidBookException occured:" + e);
        }
    };
}