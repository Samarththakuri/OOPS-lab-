package telsuko;
class Human{
    private int age;//private can only be acessed in the same class but how to access them ...we do thhis via methods

    private String name;
//using methods as an way to acess age
//yeh hogaya getter
    public int getAge(){
        return age;
    }
// yeh hogaya setter

    public void setAge(int a){
        age=a;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }
  
}


public class encapsulation {
    public static void main(String a[]){
Human obj=new Human();
obj.setAge(19);
obj.setName("Samarth");
System.out.println(obj.getAge()+":"+obj.getName());
    }
}
