// Question 1 — Student

// Create a Student class with:

// id
// name
// age

// Create the following overloaded constructors:

// Constructor with no arguments
// Constructor with id and name
// Constructor with id, name, and age

// Create three Student objects using the three different constructors and display their information.
class Student{
    int id;
    String name;
    double age;
    Student(){
        id=101;
        name="Gangan";
        age=12;

    }
    Student(int id, String name){
        this.id=id;
        this.name=name;

    }
    Student(int id,String name,double age){
        this.id=id;
        this.name=name;
        this.age=age;
    }
    void display(){
        System.out.println("Details:"+id+ name+ age);
    }
}

public class SMS{
    public static void main(String[] args){
        Student s1=new Student();
        Student s2=new Student(101,"Suresh");
        Student s3=new Student(102,"Sagar",12);
        s1.display();
        s2.display();
        s3.display();

    }
    
}
