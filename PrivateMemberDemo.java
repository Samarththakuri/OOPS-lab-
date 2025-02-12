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