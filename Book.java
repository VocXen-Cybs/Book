package com.mycompany.book;

public class Book {
    String bookTitle;
    String bookAuthor;
    int yearPublication;
    
    public Book(String bookTitle, String bookAuthor, int yearPublication){
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.yearPublication = yearPublication;
}
    
    public void displayDetails(){
         System.out.println("Title: " + bookTitle);
         System.out.println("Author: " + bookAuthor);
         System.out.println("Year Published: " + yearPublication);
    }

public static void main(String[] args) {
    Book myBook = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925);
    myBook.displayDetails();
    }
}

