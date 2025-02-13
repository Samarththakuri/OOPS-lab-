/* 3. University Management System*/
class Person {
    protected String name;
    protected int age;
    protected String address;
}

class Staff extends Person {
    protected int staffId;
    protected String department;
}

class Professor extends Staff {
    protected String specialization;

    public void conductLecture() {
        System.out.println(name + " is conducting a lecture in " + specialization);
    }
}

class Student extends Person {
    protected int studentId;
    protected String course;
}

class GraduateStudent extends Student {
    protected String researchTopic;

    public void submitThesis() {
        System.out.println(name + " submitted thesis on " + researchTopic);
    }
}

public class Third {
    public static void main(String a[]){

    }
    
}
