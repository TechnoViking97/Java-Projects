//-----------------------------------------------
// Conversions from Rankine
// Brandon Antil, Tyler Williams, Andrew Davidson
// Version1: 3-26-14
// Java Version: jdk1.7.0_51
//-----------------------------------------------
public class Rankine
{
    public static double OutTemp;
    public static double RanToCel() //Conversion from Rankine to Celsius
    {
        OutTemp = (BeginingMain.StartTemp - 459.67) * 5 / 9;
        return OutTemp;
    }
    public static double RanToFah() //Conversion from Rankine to Fahrenheit
    {
        OutTemp = (BeginingMain.StartTemp - 459.67);
        return OutTemp;
    } 
    public static double RanToKel() //Conversion from Rankine to Kelvin
    {
        OutTemp = BeginingMain.StartTemp * 5 / 9;
        return OutTemp;
    }
}
