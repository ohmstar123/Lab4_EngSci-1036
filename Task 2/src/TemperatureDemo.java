import java.util.Scanner;

public class TemperatureDemo {
    public static void main(String[] args) {

        //Declaring new method for Scanner
        Scanner keyboard = new Scanner(System.in);

        //Ask user for a value for Fahrenheit
        System.out.print("Enter the Fahrenheit temperature: ");
        double f = keyboard.nextDouble();

        //Declaring new method for Temperature
        Temperature t = new Temperature(f);

        //Insert values given by the user back into method
        t.setFahrenheit(f);

        //Output values for Celcius and Kelvin
        System.out.println("Celcius: " + t.getCelsius());
        System.out.println("Kelvin: " + t.getKelvin());
    }
}
