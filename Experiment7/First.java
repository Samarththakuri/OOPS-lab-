import java.lang.Math;
abstract class Solid{
    abstract double calculateVolume();

    
}
class Cuboid extends Solid{
    private double lenght;
    private double breadth;
    private double height;
    public Cuboid(double lenght,double breadth,double height){
        this.breadth=breadth;
        this.lenght=lenght;
        this.height=height;
    }
    double calculateVolume(){
        return lenght*breadth*height;
    }

}
class Sphere extends Solid{
    private int radius;
    public Sphere(int radius){
        this.radius=radius;
    }
    double calculateVolume(){
        return 1.3*3.14*Math.pow(radius,3);
    }
}

public class First {
    public static void main(String a[]){
        Sphere sph=new Sphere(8);
        sph.calculateVolume();
    }
    
}
