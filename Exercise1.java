
// Exercise 1-Book information
// Create a Book class with the following attributes:
// bookId
// title
// author
// Create a paramitilized constructor to initilize these values.
// Create a method displayInformation()to display the book details
// In main(), create two book Objects using the constructor and display their information.
class Book{
    int bookId;
    String title;
    String author;
Book(int bookId, String topic, String name){
    this.bookId=bookId;
    title=topic;
    author=name;
}
void displayInformation(){
     System.out.println("ID of the book is:"+ bookId);
        System.out.println("Title of the book is:"+title);
        System.out.println("Author of the book is:"+author);

}
}

public class Exercise1 {
    public static void main(String[] args){
        Book book=new Book(1,"Java","Sagar");
                Book book2=new Book(102,"Learn to Earn","Peter Lynch");

        book.displayInformation();
        book2.displayInformation();
       


        
    }
    
}
