//-----------------------------------------------
// Improved temperature converter using multiple classes for conversions
// Brandon Antil, Tyler Williams, Andrew Davidson
// Version2: 4-8-14
// Java Version: jdk1.7.0_51
//-----------------------------------------------

import java.util.Scanner; //Imports the Scanner class 
public class BeginingMain
{
    public static double StartTemp; //Creates a public double that will be used in other classes
    public static void main (String[] args)
    {
        int TypeTemp; //Creates an integer for input selection
        int TypeTemp2; //Creates an integer for input selection
        int TypeTemp3 = 0; //Creates an integer for input selection
        int Count = 0; //Creates an integer used for the while loop
        double FinalTemp; //Creates a double that holds the number output of the classes
        Scanner sc = new Scanner(System.in); //Creates a new instance of Scanner
        System.out.println('\f'); //Clears the console
        try{
            do
            {

                System.out.println("What would you like your first temp to be"); //Prompts the user to select a cjoice from the list below
                System.out.println("1.Celsius"); //Choice one
                System.out.println("2.Fahrenheit"); //Choice two
                System.out.println("3.Kelvin"); //Choice three
                System.out.println("4.Rankine"); //Choice four
                System.out.print("Your choice: "); 
                TypeTemp = sc.nextInt(); //Takes the user's input
                ++Count; //Adds one to Count - This is for the do while loop to make the program continuous

                System.out.println('\f'); //clears the console
                System.out.println("Please input temp to convert."); //Prompts the user
                System.out.print("Your Temp: ");
                StartTemp = sc.nextDouble(); //Takes the user's input temperature - Stores it in StartTemp

                switch (TypeTemp) //Each case corresponds to a choice listed above
                //The cases ask which temperature they would like to convert to
                //The cases have another switch statement in them to run the corresponding class of the conversion
                {
                    case 1:
                    System.out.println("Your Temp: " + StartTemp + " Degrees Celsisus"); //Shows the user their input
                    System.out.println("What would you like to convert to?"); //Prompts the user
                    System.out.println("1.Fahrenheit"); //Choice one
                    System.out.println("2.Kelvin"); //Choice two
                    System.out.println("3.Rankine"); //Choice three
                    TypeTemp2 = sc.nextInt(); //Takes the user's input

                    switch (TypeTemp2) //Second switch mentioned from above - Selects the corresponding class to run for the choosen conversion
                    {
                        case 1:
                        System.out.println("To Fahrenheit");
                        FinalTemp = Celsius.CelToFah(); //Sets FinalTemp to the output of the CelToFah class
                        System.out.println(FinalTemp); //Prints the output
                        break; 
                        case 2:
                        System.out.println("To Kelvin");
                        FinalTemp = Celsius.CelToKel(); //Sets FinalTemp to the output of the CelToKel class
                        System.out.println(FinalTemp); //Prints the output
                        break;
                        case 3:
                        System.out.println("To Rankine");
                        FinalTemp = Celsius.CelToRan(); //Sets FinalTemp to the output of the CelToRan class
                        System.out.println(FinalTemp); //Prints the output
                        break;
                    }
                    break;

                    case 2:
                    System.out.println("Your Temp: " + StartTemp + " Degrees Fahrenheit"); //Shows the user their input
                    System.out.println("What would you like to convert to?"); //Prompts the user
                    System.out.println("1.Celsius"); //Choice one
                    System.out.println("2.Kelvin"); //Choice two
                    System.out.println("3.Rankine"); //Choice three
                    TypeTemp2 = sc.nextInt(); //Takes the user's input

                    switch (TypeTemp2)
                    {
                        case 1:
                        System.out.println("To Celsius");
                        FinalTemp = Fahrenheit.FahToCel(); //Sets FinalTemp to the output of the FahToCel class
                        System.out.println(FinalTemp); //Prints the output
                        break;
                        case 2:
                        System.out.println("To Kelvin");
                        FinalTemp = Fahrenheit.FahToKel(); //Sets FinalTemp to the output of the FahToKel class
                        System.out.println(FinalTemp); //Prints the output
                        break;
                        case 3:
                        System.out.println("To Rankine");
                        FinalTemp = Fahrenheit.FahToRan(); //Sets FinalTemp to the output of the FahToRan class
                        System.out.println(FinalTemp); //Prints the output
                        break;
                    }
                    break;
                    case 3:
                    System.out.println("Your Temp: " + StartTemp + " Degrees Kelvin"); //Shows the user their input
                    System.out.println("What would you like to convert to?"); //Prompts the user
                    System.out.println("1.Celsius"); //Choice one
                    System.out.println("2.Fahrenheit"); //Choice two
                    System.out.println("3.Rankine"); //Choice three
                    TypeTemp2 = sc.nextInt(); //Takes the user's input

                    switch (TypeTemp2)
                    {
                        case 1:
                        System.out.println("To Celsius");
                        FinalTemp = Kelvin.KelToCel(); //Sets FinalTemp to the output of the KelToCel class
                        System.out.println(FinalTemp); //Prints the output
                        break;
                        case 2:
                        System.out.println("To Fahrenheit");
                        FinalTemp = Kelvin.KelToFah(); //Sets FinalTemp to the output of the KelToFah class
                        System.out.println(FinalTemp); //Prints the output
                        break;
                        case 3:
                        System.out.println("To Rankine");
                        FinalTemp = Kelvin.KelToRan(); //Sets FinalTemp to the output of the KelToRan class
                        System.out.println(FinalTemp); //Prints the output
                        break;
                    }
                    break;

                    case 4:
                    System.out.println("Your Temp: " + StartTemp + " Degrees Rankine"); //Shows the user their input
                    System.out.println("What would you like to convert to?"); //Prompts the user
                    System.out.println("1.Celsius"); //Choice one
                    System.out.println("2.Fahrenheit"); //Choice two
                    System.out.println("3.Kelvin"); //Choice three
                    TypeTemp2 = sc.nextInt(); //Takes the user's input

                    switch (TypeTemp2)
                    {
                        case 1:
                        System.out.println("To Celsius");
                        FinalTemp = Rankine.RanToCel(); //Sets FinalTemp to the output of the RanToCel class
                        System.out.println(FinalTemp); //Prints the output
                        break;
                        case 2:
                        System.out.println("To Fahrenheit");
                        FinalTemp = Rankine.RanToFah(); //Sets FinalTemp to the output of the RanToFah class
                        System.out.println(FinalTemp); //Prints the output
                        break;
                        case 3:
                        System.out.println("To Kelvin");
                        FinalTemp = Rankine.RanToKel(); //Sets FinalTemp to the output of the RanToKel class
                        System.out.println(FinalTemp); //Prints the output
                        break;
                    }
                    break;
                }
                System.out.println("Do you want to convert again?"); //Asks the user if they want to convert another temperature
                //This will continue the loop or stop the loop depending on the choice choosen
                System.out.println("1. Yes"); //Choice one
                System.out.println("2. No"); //Choice two
                TypeTemp3 = sc.nextInt(); //Takes the user's input
            }
            while(TypeTemp3 == 1 || Count == 0); //While to continue to another conversion or stop the loop/program
            //TypeTemp3 is taken from the question above
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}