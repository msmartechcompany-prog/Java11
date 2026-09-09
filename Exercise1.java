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
        book.displayInformation();
       


        
    }
    
}
