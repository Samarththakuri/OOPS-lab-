/*
 * Define a Car class with attributes make, model, and year.
Create a parameterized constructor that uses the this keyword to distinguish constructor parameters from the class fields (e.g., this.make = make;). Instantiate a Car object with specific values (e.g., "Tesla", "Model 3", 2025) and display its details, ensuring the correct assignment of attributes using this.

 */
        
class Car{
    String make,model; 
   int year;
 Car(){
     make="unknown";
     model="unknown"; 
     year=0;
 }
  Car(String make,String model,int year){
   this.make=make;
   this.model=model;
   this.year=year;
 }
public void displaydetails(){
    System.out.println("The details of the car are :\n The make :"+make+" \n The model:"+ model+"\nThe year manufacrated: "+year);
}

}



public class Vehicle {

    public static void main(String a[]){
  Car car1=new Car("Tesla", "Model 3", 2025);
  car1.displaydetails();


    }
}