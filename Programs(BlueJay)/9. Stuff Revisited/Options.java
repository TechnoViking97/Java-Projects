
/**
 * This class allows the user to pick from a predefined class then displayes it.
 * 
 * @author (Trevor and Tyler) 
 * @version (v1 5/23/14)
 */

//importing scanner
//this was the class we originall created, so all the declaration of the variables are here
import java.util.Scanner;
public class Options extends FileSaving 
{
    //instantiating the scanner as sc and sc1
    static Scanner sc = new Scanner(System.in);
    static Scanner sc1 = new Scanner(System.in);

    //creating new static string
    static String name;

    //the variables for making choices, i.e 1 for yes or 2 for no
    static int choice2=0;
    static int choice1=0;
    static int choice3=0;
    static int choice4=0;
    static int choice5=0;

    //declaring the variables for each stat
    static int strength=0;
    static int defense=0;
    static int magic=0;
    static int finesse=0;
    static int vigor=0;

    //when creating a class, these are the variables that save the number of skill points allocated to each stat
    static int strengthChoice=0;
    static int defenseChoice=0;
    static int magicChoice=0;
    static int finesseChoice=0;
    static int vigorChoice=0;  

    //total amount of skill points avaliable 
    static int total = 20;

    //method to allow the user to pick from a set of predefined classes
    public static void pickClass() throws Exception
    {
        //if choice is 1 for picking a predefined class instead of creating your own
        if (choice1==1)
        {      
            //do while loop telling you to select one of the four classes, makes sure you can't put in anything but 1 or for
            do
            {
                System.out.println("Select a class: ");
                System.out.println("1 - Hidden");
                System.out.println("2 - Nyte");
                System.out.println("3 - mattDuffy");
                System.out.println("4 - Hacker");
                choice2 = sc1.nextInt();
            }
            while (choice2 <1 || choice2 > 4);

            //switch statement that runs a different method depending on the class you pick
            switch (choice2)
            {
                case 1:
                Hidden();
                break;

                case 2:
                Nyte();
                break;

                case 3:
                mattDuffy();
                break;

                case 4:
                Hacker();
                break;
            }     
        }
        else
        {
            //if you choose to create a class, it instantatites the mainprog class, and calls the pickstats() method with it
            Mainprog in1 = new Mainprog();
            //calls method building in the BuildWall class
            in1.pickStats();
        }
    }

    //method for picking the hidden class
    public static void Hidden() throws Exception
    {
        //what each stat is equal to
        strength = 3;
        defense = 4;
        magic = 3;
        finesse = 6;
        vigor = 5;

        //allowing the user to preview the stats
        System.out.println("Your stats would be: ");
        System.out.println("Strength: " + strength +
            "\nDefense: " + defense +
            "\nMagic: " + magic +
            "\nFinesse: " + finesse +
            "\nVigor: " + vigor);

        //asking the user whether he or she wants to confirm the stats 
        System.out.println("Confirm Stats: Type 1 for yes or 2 for no"); 
        choice3 = sc.nextInt();

        //if yes then, it will ask about file reading and writing, if now then it allows you to pick another stat
        if (choice3 == 1)
        {
            System.out.println("Stats Confirmed");
        }
        else 
        {
            System.out.println("Pick another class");
            pickClass();
        }  
    }

    //method for picking the nyte class
    public static void Nyte() throws Exception
    {
        //what each stat is equal to
        strength = 5;
        defense = 6;
        magic = 0;
        finesse = 3;
        vigor = 6;

        //allowing the user to preview the stats
        System.out.println("Your stats would be: ");
        System.out.println("Strength: " + strength +
            "\nDefense: " + defense +
            "\nMagic: " + magic +
            "\nFinesse: " + finesse +
            "\nVigor: " + vigor);

        //asking the user whether he or she wants to confirm the stats 
        System.out.println("Confirm Stats: Type 1 for yes or 2 for no"); 
        choice3 = sc.nextInt();

        //if yes then, it will ask about file reading and writing, if now then it allows you to pick another stat
        if (choice3 == 1)
        {
            System.out.println("Stats Confirmed");
        }
        else 
        {
            System.out.println("Pick another class");
            pickClass();
        }  
    }

    //method for picking the mattduffy class
    public static void mattDuffy() throws Exception
    {
        //what each stat is equal to
        strength = 4;
        defense = 4;
        magic = 4;
        finesse = 4;
        vigor = 4;      

        //allowing the user to preview the stats
        System.out.println("Your stats would be: ");
        System.out.println("Strength: " + strength +
            "\nDefense: " + defense +
            "\nMagic: " + magic +
            "\nFinesse: " + finesse +
            "\nVigor: " + vigor);

        //asking the user whether he or she wants to confirm the stats 
        System.out.println("Confirm Stats: Type 1 for yes or 2 for no"); 
        choice3 = sc.nextInt();

        //if yes then, it will ask about file reading and writing, if now then it allows you to pick another stat
        if (choice3 == 1)
        {
            System.out.println("Stats Confirmed");
        }
        else 
        {
            System.out.println("Pick another class");
            pickClass();
        }   
    }

    //method for picking the hacker class
    public static void Hacker() throws Exception
    {
        //what each stat is equal to
        strength = 3;
        defense = 3;
        magic = 7;
        finesse = 4;
        vigor = 3;  

        //allowing the user to preview the stats
        System.out.println("Your stats would be: ");
        System.out.println("Strength: " + strength +
            "\nDefense: " + defense +
            "\nMagic: " + magic +
            "\nFinesse: " + finesse +
            "\nVigor: " + vigor);

        //asking the user whether he or she wants to confirm the stats 
        System.out.println("Confirm Stats: Type 1 for yes or 2 for no"); 
        choice3 = sc.nextInt();

        //if yes then, it will ask about file reading and writing, if now then it allows you to pick another stat
        if (choice3 == 1)
        {
            System.out.println("Stats Confirmed");
        }
        else 
        {
            System.out.println("Pick another class");
            pickClass();
        }   
    }
}

    