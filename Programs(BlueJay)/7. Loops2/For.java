
/**
 * Write a description of class For here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner; //imports scanner
public class For

{
    public static void main (String[] args)
    {
        System.out.println('\f'); //clears console
        double UserNum;//variables for user inputed numbers
        double UserNum2;
        double x;//placeholde variables for For loop
        double y;
        Scanner sc = new Scanner(System.in);//making new scanner
        
        System.out.println("Please enter two numbers");//instructing the user
        System.out.print("Your first number: ");
        UserNum = sc.nextDouble();//displaying user's numbers
        System.out.print("Your second number: ");
        UserNum2 = sc.nextDouble();
        
        //first for loop with nested while that codes for the first number being larger and counting down
        for (x=UserNum; UserNum>=UserNum2; UserNum--)
        {
            System.out.println(UserNum);
            while(UserNum>900)
            {
                System.out.println("Please enter two numbers");
                break;
            }
            
        }
        // second for loop with nested while that codes for second number being larger and it counting up
        for (y=UserNum2; UserNum2>=UserNum; UserNum++)
        {
            System.out.println(UserNum);
            while(UserNum>900)
            {
                System.out.println("Please enter two numbers");
                break;
            }
            
        }
    }
}