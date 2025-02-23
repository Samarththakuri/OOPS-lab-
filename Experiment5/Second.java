/*2. Design a Java class Employee with attributes name, empid, and salary. Implement a default 
constructor, a parameterized constructor, and methods to return the employee’s name and salary. Add a method increaseSalary(double percentage) to raise the salary by a userspecified percentage. Create a subclass Manager with an additional instance variable department. Develop a test program to validate these functionalities.
 */

class Employee {
    private String name;
    private int empId;
    private double salary;

    public Employee() {
        this.name = "Unknown";
        this.empId = 0;
        this.salary = 0.0;
    }

    public Employee(String name, int empId, double salary) {
        this.name = name;
        this.empId = empId;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }

    public void increaseSalary(double percentage) {
    
            salary += salary * (percentage / 100);
       
    }

  
    public void displayInfo() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
    }
}


class Manager extends Employee {
    private String department;

   
    public Manager(String name, int empId, double salary, String department) {
        super(name, empId, salary);
        this.department = department;
    }

    
  
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }
}




public class Second{
    public static void main(String a[]){
        Employee emp1 = new Employee("Samarth", 500119430, 50000);
        System.out.println("Employee Details:");
        emp1.displayInfo();
    }
}