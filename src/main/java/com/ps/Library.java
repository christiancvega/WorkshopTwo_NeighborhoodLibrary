package com.ps;
import java.util.Scanner;
// setting up my library class to hold books with an array, and also my scanner that we will use for the menu
public class Library {
    private Book[] books;
    private static Scanner scanner = new Scanner(System.in);
    private static int nextEmptyIndex = 0;

    public Library(){
        books = new Book[20];
    }
//setting uo my main method to hold my books inside of
    public static void main(String[] args) {
        Library library = new Library();
        int choice;
//20 book choices, I went with a spooky library theme
        Book book1 = new Book(1, "78925", "Hauntings");
        Book book2 = new Book(2, "78926", "Paranormal");
        Book book3 = new Book(3, "78927", "Cryptids");
        Book book4 = new Book(4, "78928", "Poltergeist");
        Book book5 = new Book(5, "78929", "Monsters");
        Book book6 = new Book(6, "78930", "Unexplained");
        Book book7 = new Book(7, "78931", "Sinister");
        Book book8 = new Book(8, "78932", "Mysteries");
        Book book9 = new Book(9, "78933", "Horrors");
        Book book10 = new Book(10, "78933", "True Crime");
        Book book11 = new Book(11, "78934", "Possession");
        Book book12 = new Book(12, "78935", "Witchcraft");
        Book book13 = new Book(13, "78936", "Wizardry");
        Book book14 = new Book(14, "78937", "Curses");
        Book book15 = new Book(15, "78938", "Revenants");
        Book book16 = new Book(16, "78939", "Demons");
        Book book17 = new Book(17, "78940", "Nightmares");
        Book book18 = new Book(18, "78941", "Shadows");
        Book book19 = new Book(19, "78942", "Phantom");
        Book book20 = new Book(20, "78943", "Occult");
// adding my 20 books to the array that i created
        library.books[0] = book1;
        library.books[1] = book2;
        library.books[2] = book3;
        library.books[3] = book4;
        library.books[4] = book5;
        library.books[5] = book6;
        library.books[6] = book7;
        library.books[7] = book8;
        library.books[8] = book9;
        library.books[9] = book10;
        library.books[10] = book11;
        library.books[11] = book12;
        library.books[12] = book13;
        library.books[13] = book14;
        library.books[14] = book15;
        library.books[15] = book16;
        library.books[16] = book17;
        library.books[17] = book18;
        library.books[18] = book19;
        library.books[19] = book20;

        nextEmptyIndex = 20;
// creating a do while loop to present the main menu to the user as long as they dont choose 4
        do {
            System.out.println("Welcome to the Spooky Library");
            System.out.println("1. List all books");
            System.out.println("2. Check out a book");
            System.out.println("3. Check in a book");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    library.listAllBooks();
                    break;
                case 2:
                    library.checkOutBook();
                    break;
                case 3:
                    library.checkInBook();
                    break;
                case 4:
                    System.out.println("Thank You for visiting the Spooky Library! Goodbye...");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        } while (choice != 4);
    }

// creating if else statements to display all of the books in the library,and if there is no books then say the library is empty
    public void listAllBooks() {
        if (nextEmptyIndex == 0) {
            System.out.println("No books in the library.");
        } else {
            for (int i = 0; i < nextEmptyIndex; i++) {
                System.out.println(books[i]);
            }
        }
    }

// creating a method to check out the books
    public void checkOutBook() {
        System.out.print("Enter the ID of the book to check out: ");
        int id = scanner.nextInt();
        scanner.nextLine();
// this next part was honestly kind of confusing and i did get help from my peers.
        for (int i = 0; i < nextEmptyIndex; i++) {
            if (books[i].getId() == id && !books[i].isCheckedOut()) {
                System.out.print("Enter your name: ");
                String name = scanner.nextLine();
                books[i].checkOut(name);
                System.out.println("You have successfully checked out " + books[i].getTitle());
                return;
            }
        }
        System.out.println("Book not found or already checked out.");
    }

// same thing with the checking in the books, i needed help to get through these methods
    public void checkInBook() {
        System.out.print("Enter the ID of the book to check in: ");
        int id = scanner.nextInt();

        for (int i = 0; i < nextEmptyIndex; i++) {
            if (books[i].getId() == id && books[i].isCheckedOut()) {
                books[i].checkIn();
                System.out.println("You have successfully checked in " + books[i].getTitle());
                return;
            }
        }
        System.out.println("Book not found or not checked out.");
    }
}
