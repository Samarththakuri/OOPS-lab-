package telsuko;
class Human{
    String name;
    int age;
    public Human(){

    }
    public Human(int age){
        this.age=age;

    }
    public Human(String name,int age){
this.name=name;
this.age=age;
    }

}
public class ConstructorExample{
    public static void main(String a[]){
        Human obj1=new Human();
        System.out.println(obj1.name);
    Human obj=new Human("Samarth",10);
   System.out.println(obj.name);
    }
}
