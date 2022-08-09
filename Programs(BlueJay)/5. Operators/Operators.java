
/**
 * Shows user various demos for different operators
 * 
 * Tyler Williams
 * Version 1, 2/25/14
 */




//Brings scanner into java
import java.util.Scanner;
public class Operators
{
    public static void main (String[] args)
    {
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~All
        double UserNum1; //The first number entered by user
        double UserNum2;//The second number entered by user
        int OpPick; //Operation selected by user
        
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Conditionals
        boolean b; //Boolean for conditionals
        
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Bitwise
        int UserBit1;//Number to be turned into binary
        int UserBit2;//Number to be turned into binary
        int c = 0;//
        
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Arithmetic
        double MathResultAdd;
        double MathResultSub;
        double MathResultMult;
        double MathResultDiv;
        double MathResultMod;
        double MathResultPower;
        double SimpleMath;
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Unary
        double UnaryResult;
        
        
        //Begining of program, prompts the user which demo they would like
        //Making new scanner
        Scanner sc = new Scanner(System.in);
        //Clearing console
        System.out.println('\f');
        //Displaying options
        System.out.println("Firstly what kind of operation do you want to see?");
        System.out.println("1.Addition, Subtraction, Multiplication, Divison and Modulus");
        System.out.println("2.Relational/Equity");
        System.out.println("3.Bitwise/ Bit Shift");
        System.out.println("4.Conditionals");
        System.out.println("5.Unary");
        OpPick = sc.nextInt();
        
    
        //Clears console
        System.out.println('\f');
        
        switch (OpPick)//Each of the demos is put into a switch statment
        {
            case 1: //Arithmetic
            System.out.println("You chose Arithmetic");
            System.out.println("Please choose two numbers:");
            //Prompting user for two numbers
            UserNum1 = sc.nextDouble();
            System.out.println("Your first number: " + UserNum1);
            UserNum2 = sc.nextDouble();
            System.out.println("Your second number: " + UserNum2);
            System.out.println("");
            System.out.println("Your answer: ");
            
            //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Addition
            System.out.print("In Addition: ");
            MathResultAdd = SimpleMath1(UserNum1, UserNum2);
            
            //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Subtraction
            System.out.println("");
            System.out.print("In Subtraction: ");
            MathResultSub = SimpleMath2(UserNum1, UserNum2);
            
            //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Multiplication
            System.out.println("");
            System.out.print("In Multiplication: ");
            MathResultMult = SimpleMath3(UserNum1, UserNum2);
            
            //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Division
            System.out.println("");
            System.out.print("In Division: ");
            MathResultDiv = SimpleMath4(UserNum1, UserNum2);
            
            //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Modulus
            System.out.println("");
            System.out.print("In Modulus: ");
            MathResultMod = SimpleMath5(UserNum1, UserNum2);
            
            //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Powers
            System.out.println("");
            System.out.print("By Powers: ");
            MathResultPower = SimpleMath6(UserNum1, UserNum2);
            break; 
            
       
            case 2://Relational
            System.out.println("You chose Relational/Equity");
            System.out.println("Please choose two numbers");
            UserNum1 = sc.nextDouble();
            //Prompting user for two numbers
            System.out.println("Your first number: " + UserNum1);
            UserNum2 = sc.nextDouble();
            System.out.println("Your second number: " + UserNum2);
            System.out.println("");
            
            //If statements that show the user relationships between the two numbers
            if(UserNum1>UserNum2)
            System.out.println("First is greater");
            else if(UserNum1==UserNum2)
            System.out.println("Your numbers are equal");
            else if(UserNum1!=UserNum2)
            System.out.println("Your numbers are not equal");
            if(UserNum1<UserNum2)
            System.out.println("First number is less");
            else if(UserNum1==UserNum2)
            System.out.println("Your numbers are equal");
            else if(UserNum1!=UserNum2)
            System.out.println("Your numbers are not equal");
            break;
            
            case 3://Bitwise operators
            System.out.println("You chose Bitwise/Bit Shift");
            System.out.println("Please choose two numbers");
            //Prompting user for numbers
            UserBit1 = sc.nextInt();
            System.out.println("Your first number: " + UserBit1);
            UserBit2 = sc.nextInt();
            System.out.println("Your second number: " + UserBit2);
            System.out.println("");
            //Displays the users numbers in binary
            System.out.println("Your first number in binary: "+ Integer.toString(UserBit1,2));
            System.out.println("Your second number in binary: "+ Integer.toString(UserBit2,2));
            System.out.println("");
            
            //Showing the user the operators with their two numbers
            c = UserBit1 & UserBit2;
            System.out.println("&: " + Integer.toString(c,2));
            
            c = UserBit1 | UserBit2;
            System.out.println("|: " + Integer.toString(c,2));
            
            c= UserBit1 ^ UserBit2;
            System.out.println("^: " + Integer.toString(c,2));
            
            c= ~ UserBit1;
            System.out.println("~: " + Integer.toString(c,2));
            
            c= UserBit1 << 2;
            System.out.println("<<: " + Integer.toString(c,2));
            
             c= UserBit1 >> 2;
            System.out.println(">>: " + Integer.toString(c,2));
            
             c= UserBit1 >>> 2;
            System.out.println(">>> " + Integer.toString(c,2));
            break;
            
            case 4://Conditionals
            System.out.println("Conditionals");
            System.out.println("Please choose two numbers");
            UserNum1 = sc.nextDouble();
            //Prompting user for numbers
            System.out.println("Your first number: " + UserNum1);
            UserNum2 = sc.nextDouble();
            System.out.println("Your second number: " + UserNum2);
            System.out.println("");
            //If statment using only condtional operators
            b= UserNum1 > UserNum2 && UserNum2 < UserNum1;
            System.out.println("Is your first number greater than the first?");
            System.out.println(b);
            System.out.println("");
            //Another if statement using only operators.
            b= UserNum1==UserNum2 || UserNum2==UserNum1;
            System.out.println("Are your numbers equal to each other?");
            System.out.println(b);
            break;
            
            case 5://Unary
            System.out.println("Unary Operators");
            System.out.println("Please choose one number");
            UserNum1 = sc.nextDouble();
            //Prompting the user for only one number
            System.out.println("Your first number: " + UserNum1);
            System.out.println("");
            //Using all of the unary operators
            UnaryResult= +UserNum1;
            System.out.println("Your number with unary +: " + UserNum1);
            UnaryResult= ++UserNum1;
            System.out.println("Your number with unary ++: " + UserNum1);
            UnaryResult= -UserNum1;
            System.out.println("Your number with unary -: " + UserNum1);
            UnaryResult= --UserNum1;
            System.out.println("Your number with unary --: " + UserNum1);
            break;
            
            
            
            
            
            
            
       }
   }

 //All the methods needed to use the arithmetic operators 
     public static double SimpleMath1(double UserNum1,double UserNum2)
 {
     //For Addition
    double MathResultAdd;
    MathResultAdd = UserNum1 + UserNum2;
    System.out.println(MathResultAdd);
    return MathResultAdd;
 }
    public static double SimpleMath2(double UserNum1,double UserNum2)
 {
     //For Subtraction
    double MathResultSub;
    MathResultSub = UserNum1 - UserNum2;
    System.out.println(MathResultSub);
    return MathResultSub;
 }
    public static double SimpleMath3(double UserNum1,double UserNum2)
 {
     //For Multiplication
    double MathResultMult;
    MathResultMult = UserNum1 * UserNum2;
    System.out.println(MathResultMult);
    return MathResultMult;
 }
   public static double SimpleMath4(double UserNum1,double UserNum2)
 {
     //For Division
    double MathResultDiv;
    MathResultDiv = UserNum1 / UserNum2;
    System.out.println(MathResultDiv);
    return MathResultDiv;
 }
  public static double SimpleMath5(double UserNum1,double UserNum2)
 {
     //For Modulus 
    double MathResultMod;
    MathResultMod = UserNum1 % UserNum2;
    System.out.println(MathResultMod);
    return MathResultMod;
 }
 public static double SimpleMath6(double UserNum1,double UserNum2)
 {
     //For Powers
    double MathResultPower;
    MathResultPower =Math.pow(UserNum1,UserNum2);
    System.out.println(MathResultPower);
    return MathResultPower;
 }
 
}
