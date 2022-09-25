public class Cylinder {

    //Creating variables
    double radius;
    double height;
    final double PI = 3.14159;

    //Constructor method
    public Cylinder(double r, double h)
    {
        radius = r;
        height = h;
    }

    //Sets value for radius
    public void setRadius(double r)
    {
        radius = r;
    }

    //Sets value for height
    public void setHeight(double h)
    {
        height = h;
    }


    //Returns value for radius
    public double getRadius()
    {
        return radius;
    }

    //Returns value for height
    public double getHeight()
    {
        return height;
    }

    //Returns volume for the cylinder
    public double getVolume()
    {
        return PI * radius * radius * height;
    }

    //Returns curved surface area for the cylinder
    public double getCurvedSurfaceArea()
    {
        return 2 * PI * radius * height;
    }

    //Returns total surface area for the cylinder
    public double getTotalSurfaceArea()
    {
        return 2 * PI * radius * (height + radius);
    }

}
