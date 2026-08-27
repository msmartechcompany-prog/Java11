// Find the largest of two numbers.
import java.util.Scanner;
public class Question3 {
    public static void largestNumber(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the  first number:");
        double num1=input.nextDouble();
        System.out.println("Enter the Second number:");
        double num2=input.nextDouble();
        if(num1>num2){
            System.out.println(+num1+ " is the largest number.");
        }
        else{
            System.out.println(+num2+ " is the largest number.");
        }
        input.close();
        

    }
}
 