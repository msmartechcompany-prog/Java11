// Question 2 — Book

// Create a Book class with:

// bookId
// title
// author
// price

// Create overloaded constructors:

// Constructor with only bookId
// Constructor with bookId and title
// Constructor with bookId, title, author, and price

// Create objects using each constructor and display their information.

import java.net.SocketTimeoutException;

class Book{
    int bookId;
    String title;
    String author;
    double price;
    Book(int id){
        bookId=id;
    }
    Book(int bookID, String title){
        this.bookId=bookID;
        this.title=title;

        
    }
    Book(int bookID, String title, String author){
        this.bookId=bookID;
        this.title=title;
        this.author=author;
    }
    void display(){
        System.out.println("Id  of the book is: "+bookId+ " Title of the book is:"+ title+ " Author is:"+author);
    }
}


public class Book_co {
    public static void main(String[] args){
        Book b1=new Book(101);
        Book b2=new Book(102, "Learn to Earn");
        Book b3=new Book(103,"Learn to Earn","Peter Lynch");
        b1.display();
        b2.display();
        b3.display();
    }
    
}
