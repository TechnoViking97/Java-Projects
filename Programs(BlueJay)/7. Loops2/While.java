
/**
 * Write a description of class While here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner; //Importing scanner
import java.util.StringTokenizer;// Importing string tokenizer
public class While

{
    public static void main (String[] args)
    {
        String UserSex = new String(); //Putting user's information into two different variables
        String UserName = new String();
        int countTheTokens; //Variables to count tokens
        System.out.println('\f'); //Clears console
        Scanner sc = new Scanner(System.in); //Defining new scannners
        Scanner sc2 = new Scanner(System.in);
        
        System.out.println("Hello there, this is a personal information quiz");//Print lines that instruct the user
        System.out.println("You will need to enter things such as your: ");
        System.out.println("Social Secruity number");
        System.out.println("Credit card numbers");
        System.out.println("Just kidding.");
        System.out.println("What is your gender?");
        UserSex = sc.next();//Lets the user input sex
        //While loop that makes the user enter certain things only
        while (! UserSex.equals("female") && ! UserSex.equals("male") && ! UserSex.equals("Male")&&! UserSex.equals("Female"))
        {
           System.out.println("I doubt that, try again.");
           System.out.println("");
           System.out.println("male or female?");
           UserSex = sc.next();
           
        } 
        System.out.println("Now please enter your first middle and last name");//Intructs user to enter entire name
        System.out.println("Use tilda's instead of spaces, please and thank you");//~ are used as a delimitor
        
        UserName = sc2.nextLine();
        StringTokenizer st=new StringTokenizer(UserName, "~");//Line that allows for delim
        countTheTokens = st.countTokens();
        while(countTheTokens !=3) //Makes the user enter in a first middel AND LAST NAME
        {
            System.out.println("WRONG WRONG WRONG!");
            UserName = sc2.nextLine();
            StringTokenizer st2=new StringTokenizer(UserName, "~");
            countTheTokens = st2.countTokens();
        }
        System.out.println("I like your name ;)");
        System.out.println("");
        System.out.println("This is your name: ");
        System.out.println("");
        StringTokenizer st3=new StringTokenizer(UserName, "~");
        //Displays the user entire name again
        while (st3.hasMoreTokens())
        {
            System.out.println(st3.nextToken("~"));
            
        }
        
        
    }
}

