//-----------------------------------------------
// Conversions from Fahrenheit
// Brandon Antil, Tyler Williams, Andrew Davidson
// Version1: 3-26-14
// Java Version: jdk1.7.0_51
//-----------------------------------------------
public class Fahrenheit
{
    public static double OutTemp; 
    public static double FahToCel() //Conversion from Fahrenheit to Celsius
    {
        OutTemp = (BeginingMain.StartTemp - 32) * 5 / 9;
        return OutTemp;
    }
    public static double FahToKel() //Conversion from Fahrenheit to Kelvin
    {
        OutTemp = (BeginingMain.StartTemp - 32) / 1.800 + 273.15;
        return OutTemp;
    }
    public static double FahToRan() //Conversion from Fahrenheit to Rankine
    {
        OutTemp = (BeginingMain.StartTemp + 459.67);
        return OutTemp;
    }
}
