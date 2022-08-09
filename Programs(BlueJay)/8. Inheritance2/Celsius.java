//-----------------------------------------------
// Conversions from Celsius
// Brandon Antil, Tyler Williams, Andrew Davidson
// Version1: 3-26-14
// Java Version: jdk1.7.0_51
//-----------------------------------------------
public class Celsius
{
    public static double OutTemp; 
    public static double CelToFah() //Conversion from Celsius to Fahrenheit
    {
        OutTemp = BeginingMain.StartTemp * (9.0 / 5.0) + 32;
        return OutTemp;
    }
    public static double CelToKel() //Conversion from Celsius to Kelvin
    {
        OutTemp = BeginingMain.StartTemp + 273.15;
        return OutTemp;
    }
    public static double CelToRan() //Conversion from Celsius to Rankine
    {
        OutTemp = (BeginingMain.StartTemp + 273.15) * 9 / 5;
        return OutTemp;
    }
}
