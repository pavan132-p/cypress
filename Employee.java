package javaproject;

//public class Employee {
//
//}
class Employee {
    // Private fields for employee details
    private String id;
    private String name;
    private double salary;

    // Constructor to initialize the fields
    public Employee(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee ID : " + id);
        System.out.println("Employee Name : " + name);
        System.out.println("Employee Salary : " + salary);
    }

    // Main method to demonstrate the class
    public static void main(String[] args) {
        // Creating an instance of Employee and initializing the fields
        Employee emp = new Employee("E001", "John Doe", 50000.0);

        // Calling the displayDetails() method to print employee details
        emp.displayDetails();
    }
}