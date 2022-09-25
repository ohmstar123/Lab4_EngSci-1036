public class Temperature {

    //Declare variable for temperature
    double ftemp;

    //Constructor Method
    public Temperature(double f)
    {
        ftemp = f;
    }

    //Set value for Fahrenheit
    public void setFahrenheit(double f)
    {
        ftemp = f;
    }


    //Return a value for Celsius
    public double getCelsius()
    {
        return (5.0 / 9.0) * (ftemp - 32);
    }

    //Return a value for Kelvin
    public double getKelvin()
    {
        return ((5.0 / 9.0) * (ftemp - 32)) + 273;
    }

    //Return a value for Fahrenheit
    public double getFahrenheit()
    {
        return ftemp;
    }



}
