import java.util.*;
public class Third {
    public static void main(String[] args)
    {
        int ch;
        double area=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("choose according to numbers:  ");
        System.out.println("1.Square  ");
        System.out.println("2.Rectangle ");
        System.out.println("3.Circle");
        System.out.println("4.Triangle");
        ch=sc.nextInt();

        if (ch==1) {
            int side;
            System.out.print("enter the side of the  square:  ");
            side=sc.nextInt();
            area=side*side;
        }
        else  if (ch==2) {
            int len,bre;
            System.out.print("enter the len of the  rectangle:  ");
            len=sc.nextInt();
            System.out.print("enter the bre of the  rectangle:  ");

            bre=sc.nextInt();

            area=len*bre;
        }
        else if (ch==3) {
            int radius;
            System.out.print("enter the radius of the  circle:  ");

            radius=sc.nextInt();
            area=3.14*radius*radius;


        }
        else if (ch==4) {
            int base,height;
            System.out.print("enter the base of the  triangle:  ");

            base=sc.nextInt();
            System.out.print("enter the height of the  triangle:  ");
            height=sc.nextInt();
            area=0.5*base*height;

        }
        else
        {
            System.out.println("wrong input");
        }
        System.out.println("area is "+area);
        sc.close();
}
}
