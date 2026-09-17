// Question 3. Create a Book class with:

// bookId
// title
// author
// price

// Create:

// A parameterized constructor
// A copy constructor

// Create one book object and create another book object by copying the first object.

// Display both books.
class Book{
    int bookID;
    String title;
    String author;
    double price;

Book(int id, String bookName, String writer, double p){
    bookID=id;
    title=bookName;
    author=writer;
    price=p;
}
Book(Book b){
    b.bookID=bookID;
    b.title=title;
    b.author=author;
    b.price=price;
}
void display(){
    System.out.println("Id  of the book is:"+bookID+ " Title is:"+title+ " Price is: Rs."+price);
}
}


public class Bookcopy {
    public static void main(String[] args) {
        Book b1=new Book(101,"Learn to Earn","Peter Lynch",1000);
        Book b2;
        b2=b1;
        b1.display();
        b2.display();

    }
    
    
}
