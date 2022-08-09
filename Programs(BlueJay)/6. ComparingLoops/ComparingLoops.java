
/**
 * Write a description of class ComparingLoops here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class ComparingLoops

{
    public static void main (String[] args)
    {
        System.out.println('\f');
        Scanner sc = new Scanner(System.in);
        
        
        int CountDown = 60;
         System.out.println("Terrorists have armend a bomb!");
         System.out.println("You need to defuse it!");
         System.out.println("Try to find the series of passwords in order to buy yourself more time!");
         System.out.println("Type Go to begin");
         String UserWord = sc.nextLine();
         
        switch(UserWord)
        {
        case "Go":
        while (CountDown>0)
        {
            System.out.println(CountDown);
           try
           {
            CountDown--;
            Thread.sleep(1000L);
           }
           catch (InterruptedException e)     
           {
           }
            
        }
        
        
       
    }
}
        
 }

