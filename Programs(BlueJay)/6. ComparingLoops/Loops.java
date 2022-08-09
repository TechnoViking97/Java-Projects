
/**
 * Write a description of class Loops here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.text.DecimalFormat;
import java.io.*;
public class Loops

{
    public static void main (String[] args)
    {
        int CountUp1 = 10;
        int CountUp2 = 20;
        int CountDown1 = 100;
        int CountDown2 = 200;
        int UserNum;
        int varSum = 0;
        int varValue = 0;
        int varCount = 0;
        double UserNum2;
        double UserNum3;
        double UserAnswer;
        char   UserChar;
        double TOLERANCE = .01;
       
        System.out.println('\f');
        Scanner sc = new Scanner(System.in);
        System.out.println("Please choose a demo");
        System.out.println("1.Simple Count up and Count down");
        System.out.println("2.Loop adding");
        System.out.println("3.String Comparison");
        System.out.println("4.Double comparion");
        System.out.println("5.Char comparison");
        
        UserNum = sc.nextInt();
        
      switch(UserNum) 
      {
       case 1:
        while(CountDown1 > 0)
        {
         System.out.println("++CountUp1: "+CountUp1 + "CountUp2++: " +CountUp2);
        ++CountUp1;
        CountUp2++;
        System.out.println("++CountUp1: "+CountUp1 +"CountUp2++: "+CountUp2);
        ++CountUp1;
        CountUp2++;
        System.out.println("++CountUp1: "+CountUp1+"CountUp2++: "+CountUp2);
        System.out.println("--CountDown1: "+CountDown1 +"CountDown2--: "+CountDown2);
        --CountDown1;
        CountDown2--;
        System.out.println("--CountDown1: "+CountDown1 +"CountDown2--: "+CountDown2);
        --CountDown1;
        CountDown2--;
        System.out.println("--CountDown1: "+CountDown1 +"CountDown2--: "+CountDown2);
       }
       break;
       
       case 2:
      
       System.out.println("Enter an integer (0 to quit)");
       varValue=sc.nextInt();
       while (varValue !=0)
       {
           varCount++;
           varSum += varValue;
           System.out.println("The sum so far " + varSum);
           
           System.out.println("Enter an integer (0 to quit)");
           varValue=sc.nextInt();
       }
       break;
       
       case 3:
       System.out.println("Please type your gender");
       String UserWord = sc.next();
       while (! UserWord.equals("female") && ! UserWord .equals("male"))
       {
           System.out.println("I doubt that, try again.");
           System.out.println("");
           System.out.println("male or female?");
           UserWord = sc.next();
           
       } 
       System.out.println("Okay good, you're a " + UserWord);
       System.out.println("Now what is your name?");
       String UserName = sc.next();
       
       while (UserWord.length() == 0 )
       {
           System.out.println("That's not right");
           System.out.println("Now what is your name?");
           UserName = sc.next();
       }
       String UserName1 = UserName.substring(0,1).toUpperCase() + UserName.substring(1);
       System.out.println("Okay, "+UserName1);
       System.out.println("It's nice to meet you");
       
       break;
       
       case 4:
       System.out.println("I have an amount of money in my pocket.");
       System.out.println("It's between one cent or .01 and 1.25.");
       System.out.println("Try to guess");
       UserNum2 = sc.nextDouble();
       while (Math.abs(UserNum2 - 1.10) > TOLERANCE)
       {
           
           System.out.println("Nope!");
           System.out.println("Try again");
           UserNum2 = sc.nextDouble();
           
       }
 
       while (Math.abs(UserNum2 - 1.10) < TOLERANCE)
        {
         System.out.println("Your values are equal according to the tolerance");
         break;
        }
       break;
       
       case 5:
       System.out.println("Type a capital letter");
       UserChar = sc.next().charAt(0);
       while (UserChar != 'Z')
       {
           UserChar++;
           System.out.println(UserChar);
       }
       break;
       
    }
 }
}
    
        
   
  


   
     
       
      
      
   

        


    
