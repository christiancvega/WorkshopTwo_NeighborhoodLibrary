package com.ps;


// set up all my variables
public class Book {
    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String checkedOutTo;
//setting uo my constructor for my variables to create books
    public Book(int id, String isbn, String title) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = false;
        this.checkedOutTo ="";
    }
// getters and setters for the private variables we created
    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void checkOut(String name) {
        this.isCheckedOut = true;
        this.checkedOutTo = name;
    }
    public void checkIn() {
        this.isCheckedOut = false;
        this.checkedOutTo = "";
    }
//override so when we request information about the books it's readable
    @Override

    public String toString(){
        return "Book ID: " + id +
        ", ISBN: " + isbn +
        "Title: " + title +
        ", Checked Out: " +  (isCheckedOut ? "Yes, by" + checkedOutTo : "No");
    }
}
