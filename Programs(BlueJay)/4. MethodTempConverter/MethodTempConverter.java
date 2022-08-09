
/**
 * A program made in order to convert different temperatures
 * 
 * Tyler Williams
 * Version 1
 */

  import java.util.Scanner;
  public class MethodTempConverter
{
    public static void main (String[] args)
    {
    
          double StartTemp; // User Input temp
          double OutTemp;  // Converted Temp displayed 
          int TypeTemp;     // Type of conversion user chose
          
           Scanner sc = new Scanner(System.in);   // instance of scanner input class
    
           // Capture what temp conversion method user wants
           System.out.print('\f');
           System.out.println("Please choose desired converstion.");
           System.out.println("1. Celsius to Fahrenheit");
           System.out.println("2. Fahrenheit to Celsius");
           System.out.println("3. Celsius to Kelvin");
           System.out.println("4. Fahrenheit to Kelvin");
           System.out.println("5. Kelvin to Fahrenheit");
           System.out.println("6. Kelvin to Celsius");
           
           System.out.println("7. Celsius to Rankine");
           System.out.println("8. Rankine to Celsius");
           System.out.println("9. Fahrenheit to Rankine");
           System.out.println("10. Rankine to Fahrenheit");
           System.out.println("11. Kelvin to Rankine");
           System.out.println("12. Rankine to Kelvin");
           System.out.print("Your choice: ");
           TypeTemp = sc.nextInt();             // Captures users input choice
         
           // Capture Input Temp
           System.out.println('\f');   // clear console
           System.out.println("Please input temp to convert.");
           System.out.print("Your Temp: ");
           StartTemp = sc.nextDouble();   //User input temp
          
         // Determine what was chosen and call conversion method  
          switch (TypeTemp)
          {
           case 1:            
             OutTemp = celToFahr(StartTemp);
             System.out.println("You chose Celsius to Fahrenheit");
             System.out.println("Celsius: " + StartTemp + " Fahrenheit: " + OutTemp);     
             break;
             
           case 2:
             OutTemp = FahrToCel(StartTemp);
             System.out.println("You chose Fahrenheit to Celsius");
             System.out.println("Fahrenheit: " + StartTemp + " Celsius: " + OutTemp);     
             break;
             
           case 3:  
             OutTemp = CelToKel(StartTemp);
             System.out.println("You chose Celsius To Kelvin");
             System.out.println("Celsisus: " + StartTemp + " Kelvin: " + OutTemp);
             break;
             
           case 4:  
             OutTemp = FahToKel(StartTemp);
             System.out.println("You chose Fahrenheit To Kelvin");
             System.out.println("Fahrenheit: " + StartTemp + " Kelvin: " + OutTemp);
             break; 
             
           case 5:  
             OutTemp = KelToFah(StartTemp);
             System.out.println("You chose Kelvin To Fahrenheit");
             System.out.println("Kelvin: " + StartTemp + " Fahrneheit: " + OutTemp);
             break;
             
           case 6:  
             OutTemp = KelToCel(StartTemp);
             System.out.println("You chose Kelvin To Celsuis");
             System.out.println("Kelvin: " + StartTemp + " Celsius: " + OutTemp);
             break;  
           
           case 7:  
             OutTemp = CelToRan(StartTemp);
             System.out.println("You chose Celsius To Rankine");
             System.out.println("Celsius: " + StartTemp + " Rankine: " + OutTemp);
             break; 
             
           case 8:  
             OutTemp = RanToCel(StartTemp);
             System.out.println("You chose Rankine To Celsuis");
             System.out.println("Rankine: " + StartTemp + " Celsius: " + OutTemp);
             break;
             
           case 9:  
             OutTemp = FahToRan(StartTemp);
             System.out.println("You chose Fahrenheit To Rankine");
             System.out.println("Fahrenheit: " + StartTemp + " Rankine: " + OutTemp);
             break;
             
           case 10:  
             OutTemp = RanToFah(StartTemp);
             System.out.println("You chose Rankine To Fahrenheit");
             System.out.println("Rankine: " + StartTemp + " Fahrneheit: " + OutTemp);
             break;
             
           case 11:  
             OutTemp = KelToRan(StartTemp);
             System.out.println("You chose Kelvin To Rankine");
             System.out.println("Kelvin: " + StartTemp + " Rankine: " + OutTemp);
             break;
             
           case 12:  
             OutTemp = RanToKel(StartTemp);
             System.out.println("You chose Rankine To Kelvin");
             System.out.println("Rankine: " + StartTemp + " Kelvin: " + OutTemp);
             break;  
         }
        
    }
     
    // Various methods containing converstion functions
    public static double celToFahr(double StartTemp)
    {
         double OutTemp;
         OutTemp = StartTemp * (9.0 / 5.0) + 32;
         return OutTemp;
    }
    
    public static double FahrToCel(double StartTemp)
    {
        double OutTemp;
        OutTemp = (StartTemp - 32) * 5 / 9 ;
        return OutTemp;
    }
    public static double CelToKel(double StartTemp)
    {
        double OutTemp;
        OutTemp = StartTemp + 273.15;
        return OutTemp;
    }
    public static double FahToKel(double StartTemp)
    {
        double OutTemp;
        OutTemp = (StartTemp -32) / 1.800 +273.15;
        return OutTemp;
    }
    public static double KelToFah(double StartTemp)
    {
        double OutTemp;
        OutTemp = (StartTemp - 273.15) * 1.800 + 32;
        return OutTemp;
    }
    public static double KelToCel(double StartTemp)
    {
        double OutTemp;
        OutTemp = (StartTemp - 273.15);
        return OutTemp;
    }
    public static double CelToRan(double StartTemp)
    {
        double OutTemp;
        OutTemp = (StartTemp + 273.15) * 9 / 5;
        return OutTemp;
    }
    public static double RanToCel(double StartTemp)
    {
        double OutTemp;
        OutTemp = (StartTemp - 459.67) * 5 / 9;
        return OutTemp;
    }
    public static double FahToRan(double StartTemp)
    {
        double OutTemp;
        OutTemp = (StartTemp + 459.67);
        return OutTemp;
    }
    public static double RanToFah(double StartTemp)
    {
        double OutTemp;
        OutTemp = (StartTemp - 459.67);
        return OutTemp;
    }
    public static double KelToRan(double StartTemp)
    {
        double OutTemp;
        OutTemp = StartTemp * 9 / 5;
        return OutTemp;
    }
    public static double RanToKel(double StartTemp)
    {
        double OutTemp;
        OutTemp = StartTemp * 5 / 9;
        return OutTemp;
    }
 }

