/*1. Write a Java program to demonstrate that a 
private member 

of a superclass cannot be accessed directly 


from a derived class */


class Base
{
    private int temp=100;
}
class Child extends Base{
int CallBaseprivate(){
return temp;
}
}
class PrivateMemberDemo{
public static void main(String a[]){
Child obj=new Child();
System.out.println("Trying to access the private memeber of the super class:"+obj.CallBaseprivate());
}
}
/* 
//// Demonstrating that a private member of a superclass 
// cannot be accessed directly from a derived class.

class Base {
    private int temp = 100; // Private member

    // Getter method to access temp indirectly
    public int getTemp() {
        return temp;
    }
}

class Child extends Base {
    // Trying to access temp directly will cause an error
    int CallBasePrivate() {
        // return temp; // This would cause a compilation error
        return getTemp(); // Correct way to access private data
    }
}

public class PrivateMemberDemo {
    public static void main(String[] args) {
        Child obj = new Child();
        System.out.println("Trying to access the private member of the superclass: " + obj.CallBasePrivate());
    }
}
*/