
/**
 * Program that allows user to input a variabe and convert it from and to different temperatures
 * 
 * Tyler Williams
 * Version 1, 1/4/2014
 */
import java.util.Scanner; // Enables scanner class to function
public class VariablesNSuch
{
   public static void main (String[] args) //Declaring a class
   {
       while (1==1) //Putting class into a while loop so users can convert multiple numbers
       {
       Scanner keyboard = new Scanner(System.in); //Declaring scanner class
       System.out.println("enter an interger"); //Instucts the user
       int myint = keyboard.nextInt(); //Declaring myint as integer inputed by user
       
       final int BASE = 32;
       final double CONVERSION_FACTOR = 9.0 / 5.0;//Assigning math functions for the conversions
       
       int celsiusTemp = myint; 
       double fahrenheitTemp; //Allows for first Celsius to Fahrenheit conversion
       
       
       fahrenheitTemp = celsiusTemp * CONVERSION_FACTOR + BASE;//Celsius to Fahrenheit
       double fahrenheitTemp2 = (myint - 32) * 5 / 9;//Fahrenheit to Celsius
       double CelsiusToKelvin = myint + 273.15;//Celsius to Kelvin
       double FahrenheitToKelvin = (myint - 32) / 1.800 + 273.15;//Fahrenheit to Kelvin
       double KelvinToC = myint - 273.15;//Kelvin to Celcius
       double KelvinToF = (myint - 273.15) * 1.800 + 32;//Kelvin to Fahrenheit
       
       System.out.println("Celsius Temperature: " + celsiusTemp);
       System.out.println("Fahrenheit Equivalent: " + fahrenheitTemp);
       System.out.println("Fahrenheit to Celsius: " + fahrenheitTemp2);
       System.out.println("Celsius to Kelvin: " + CelsiusToKelvin);
       System.out.println("Fahrenheit to Kelvin: " + FahrenheitToKelvin);
       System.out.println("Kelvin to Celsius: " + KelvinToC);
       System.out.println("Kelvin to Fahrenheit: " + KelvinToF);
       //Printing results of conversions
       
    }
    }
}
