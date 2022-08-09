//-----------------------------------------------
// Conversions from Kelvin
// Brandon Antil, Tyler Williams, Andrew Davidson
// Version1: 3-26-14
// Java Version: jdk1.7.0_51
//-----------------------------------------------
public class Kelvin
{
    public static double OutTemp;
    public static double KelToCel() //Conversion from Kelvin to Celsius
    {
        OutTemp = (BeginingMain.StartTemp -273.15);
        return OutTemp;
    }
    public static double KelToFah() //Conversion from Kelvin to Fahrenheit
    {
        OutTemp = (BeginingMain.StartTemp -273.15) * 1.800 + 32;
        return OutTemp;
    }
    public static double KelToRan() //Conversion from Kelvin to Rankine
    {
        OutTemp = BeginingMain.StartTemp * 9 / 5;
        return OutTemp;
    }
}
