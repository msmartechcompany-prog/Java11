 import java.util.Scanner;
   class Book{
    int id;
    String title;
    String author;

Book(int id, String title, String author){
    this.id=id;
    this.title=title;
    this.author=author;
    
}
void displayInformation(){
     System.out.println("You Entered BookId is:"+id);
    System.out.println("You Entered the tile of the book is:"+title);
    System.out.println("You Entered the author of the book is:"+author);
   
}
}

public class Exercise_fromuser {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("ENter the bookID:");
        int bookId=input.nextInt();
        input.nextLine();
        System.out.println("Enter the title of the book:");
        String title=input.nextLine();
        System.out.println("Enter the Author of that book:");
        String author=input.nextLine();
        Book book=new Book(bookId,title,author);
        book.displayInformation();
        input.close();
       
    }
    
}
