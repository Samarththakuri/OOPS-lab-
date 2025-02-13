// 4. Abstract Vehicle class
abstract class Vehicle {
    protected String make;
    protected String model;

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public abstract void startEngine();
    public abstract void stopEngine();

    public void serviceInfo() {
        System.out.println("Service required every 10,000 miles.");
    }
}

class Car extends Vehicle {
    public Car(String make, String model) {
        super(make, model);
    }

    public void startEngine() {
        System.out.println("Car engine started.");
    }

    public void stopEngine() {
        System.out.println("Car engine stopped.");
    }
}

public class Fourth {
    public static void main(String a[]){
        
    }
}
