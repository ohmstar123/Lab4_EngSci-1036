import java.util.Arrays;
import java.util.Scanner;

public class CylinderDemo {
    public static void main(String[] args) {

        //Declaring new method for Scanner
        Scanner keyboard = new Scanner(System.in);

        //Asking input for radius from user
        System.out.print("Enter the radius of a cylinder: ");
        double radius = keyboard.nextDouble();

        //Asking input for height from user
        System.out.print("Enter the height of a cylinder: ");
        double height = keyboard.nextDouble();

        //Declaring new method for Cylinder
        Cylinder c = new Cylinder(radius, height);

        //Insert values given my user back into method
        c.setRadius(radius);
        c.setHeight(height);

        //Output radius, height, volume, curved surface area, and total surface area
        System.out.println("The cylinder's radius is " + c.getRadius());
        System.out.println("The cylinder's height is " + c.getHeight());
        System.out.println("The cylinder's volume is " + c.getVolume());
        System.out.println("The cylinder's curved surface area is " + c.getCurvedSurfaceArea());
        System.out.print("The cylinder's total surface area is " + c.getTotalSurfaceArea());

    }
}
