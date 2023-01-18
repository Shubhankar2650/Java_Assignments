package com.company;

import java.util.Scanner;

public class Books extends Library {
    Book new_book[] = new Book[50];
    public static int count;
    Scanner sc = new Scanner(System.in);


    public void addBook(Book b) {
        for (int i = 0; i < count; i++) {
            if (this.compareBookObjects(b, this.new_book[i]) == 0) {
                return;
            }
        }
        if (count < 50) {
            this.new_book[count] = b;
            count++;
        }
    }

    public int compareBookObjects(Book b1, Book b2) {

        // If book name matches
        if (b1.b_name.equalsIgnoreCase(b2.b_name)) {

            // Printing book exists
            System.out.println(
                    "Book of this Name Already Exists.");
            return 0;
        }


        // if book serial matches
        if (b1.serial_no == b2.serial_no) {

            // Print book exists
            System.out.println(
                    "Book of this Serial No Already Exists.");

            return 0;
        }
        return 1;
    }

    public void searchBySno() {

        // Display message
        System.out.println(
                "\t\t\t\tSEARCH BY SERIAL NUMBER\n");

        // Class data members
        int sNo;
        System.out.println("Enter Serial No of Book:");
        sNo = sc.nextInt();

        int flag = 0;


        for (int i = 0; i < count; i++) {
            if (sNo == new_book[i].serial_no) {
                System.out.println(
                        "S.No\t\tName\t\tAuthor\t\tprice\t\tAvailable Qty");
                System.out.println(
                        new_book[i].serial_no + "\t\t"
                                + new_book[i].b_name + "\t\t"
                                + new_book[i].author_name + "\t\t"
                                + new_book[i].price + "\t\t"
                                + new_book[i].quantity);
                flag++;
                return;
            }
        }

        if (flag == 0)
            System.out.println("No Book for Serial No "
                    + sNo + " Found.");
    }

    public void searchByAuthorName() {

        // Display message
        System.out.println(
                "\t\t\t\tSEARCH BY AUTHOR'S NAME");

        sc.nextLine();

        System.out.println("Enter Author Name:");
        String authorName = sc.nextLine();

        int flag = 0;

        System.out.println(
                "S.No\t\tName\t\tAuthor\t\tprice\t\tAvailable Qty");

        for (int i = 0; i < count; i++) {

            // if author matches any of its book
            if (authorName.equalsIgnoreCase(
                    new_book[i].author_name)) {
                System.out.println(
                        new_book[i].serial_no + "\t\t"
                                + new_book[i].b_name + "\t\t"
                                + new_book[i].author_name + "\t\t"
                                + new_book[i].price + "\t\t"
                                + new_book[i].quantity);
                flag++;
                return;
            }
            if (flag == 0)
                System.out.println("No Books of " + authorName
                        + " Found.");
        }
    }

    public void  displayMenu(){
        System.out.println("********Welcome to Library Management System*******");
        System.out.println("Press 1 to add new books");
        System.out.println("Press 2 to show all books");
        System.out.println("Press 3 to search for books");
        System.out.println("Press 4 to return books");
//        System.out.println("Press 4 to search books");
    }

    public void showAllBooks(){
        System.out.println("*****List of All Books *****");
        System.out.println(
                "S.No\t\tName\t\tAuthor\t\tAvailable Qty\t\tTotal Qty");
        for(int i = 0; i<count;i++){
            System.out.println(
                    new_book[i].serial_no + "\t\t"
                            + new_book[i].b_name + "\t\t"
                            + new_book[i].author_name + "\t\t"
                            + new_book[i].price + "\t\t"
                            + new_book[i].quantity);

        }
    }
}
