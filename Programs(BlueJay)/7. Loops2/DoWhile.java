
/**
 * Write a description of class For here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner; //Imports Scanner

public class DoWhile

{
    public static void main (String[] args)
    {
        System.out.println('\f'); //Magical line that clears console
        int CountDown=10; //Setting the number of guesses
        String UserWord = new String(); //Defining new string for what the user enters
        String Password = new String("firetruck"); //New string that is the password
        
        
        Scanner sc = new Scanner(System.in); //making new scanner
        
        System.out.println("This word begins with 'f' and ends with 'uck'");
        System.out.println("You have ten guesses!"); //instructing the user and giving hints
        do //do while loop that counts the number of guesses down
        {
            System.out.print("Guess number " + CountDown + " :");
            UserWord = sc.nextLine();
            CountDown--;
        }
        while(!UserWord.equals(Password) && CountDown > 0);
        System.out.println("");//congratulats user
        System.out.println("Amazing Job!!!! You did it!!");
        
   }
}