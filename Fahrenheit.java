// FarenheitToCelsius.java
// Converts a Fahrenheit temperature to celsius
import java.util.Scanner;
public class FahrenheitToCelsius
{
    public static void main (String[] args)
    {
        double fahrenheit;
        double celsius;
        final double BASE = 32.0;
        final double NUMERATOR = 5.0;
        final double DENOMINATOR = 9.0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter degrees in Fahrenheit ");
        fahrenheit = input.nextDouble();
        celsius = (fahrenheit - BASE) * (NUMERATOR / DENOMINATOR);
        System.out.println("Fahrenheit temperature : " + fahrenheit);
        System.out.println("Celsius equivalent: " + celsius);

    }
}