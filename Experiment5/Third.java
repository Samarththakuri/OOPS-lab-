class Person {
    String name;
    int age;
    String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Address: " + address);
    }
}

class Staff extends Person {
    String staffId;
    String department;

    public Staff(String name, int age, String address, String staffId, String department) {
        super(name, age, address);
        this.staffId = staffId;
        this.department = department;
    }

   
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Staff ID: " + staffId + ", Department: " + department);
    }
}

class Professor extends Staff {
    String specialization;

    public Professor(String name, int age, String address, String staffId, String department, String specialization) {
        super(name, age, address, staffId, department);
        this.specialization = specialization;
    }

    public void conductLecture() {
        System.out.println(name + " is conducting a lecture on " + specialization);
    }
}

class Student extends Person {
    String studentId;
    String course;

    public Student(String name, int age, String address, String studentId, String course) {
        super(name, age, address);
        this.studentId = studentId;
        this.course = course;
    }

   
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Student ID: " + studentId + ", Course: " + course);
    }
}

class GraduateStudent extends Student {
    String researchTopic;

    public GraduateStudent(String name, int age, String address, String studentId, String course, String researchTopic) {
        super(name, age, address, studentId, course);
        this.researchTopic = researchTopic;
    }

    public void submitThesis() {
        System.out.println(name + " is submitting a thesis on " + researchTopic);
    }
}

public class Third {
    public static void main(String[] args) {
        Person[] universityPeople = new Person[] {
            new Professor("samarth", 20, "upes", "1234", "Computer Science", "ccvt"),
            new GraduateStudent("shourya", 25, "kandoli", "4321", "Physics", "Quantum Mechanics")
        };

      
            
         
        
    }
}
