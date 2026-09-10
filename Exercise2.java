// Exercise 2-Employee information
// Create an employee class with:
// id 
// name
// salary
// Create a parameterized constructor to initilize all threee values.
// Create a method displayEmployee() to display the employee information.
// create three employee objects in main().
class Employee{
    int id;
    String name;
    double salary;
    Employee(int id, String name, double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    void displayEmployee(){
        System.out.println("Id of the Employees is:"+id);
        System.out.println("Name of the Employees:"+name);
        System.out.println("Salary of the employees is: Rs."+ salary);
    }
}

public class Exercise2 {
    public static void main(String[] args){
        Employee employee=new  Employee(101, "Sagar Senchuri", 20000);
          Employee employee2=new  Employee(102, "Suresh Sunar", 15000);
          Employee employee3=new Employee(103,"Suraj Bhandari", 5000);
          employee.displayEmployee();
          employee2.displayEmployee();
          employee3.displayEmployee();
        

        

        
    }
    
}
