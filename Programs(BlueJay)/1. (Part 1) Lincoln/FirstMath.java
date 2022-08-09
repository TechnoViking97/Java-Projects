
/**
 * Write a description of class FirstMath here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FirstMath
{
   //-----------------------------------------------------------------
   //  Dece an integer variable and do a bit of simple math
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
	int  int_var1;                // Comment in line.  This is defining an integer variable.  Needs to end in semicolon
	int int_var2;                 // Declare variable.  Start variable with acronym describing variable type 
    double dbl_var3;         // int for integer   and dbl_ for double
    double dbl_var4;	//  gpp declare variables in beginning of function and or class depending on scope.

    int_var1 = 15;          //  assign variable a value	
    int_var2 = 1;    //   it is always good to initialize variables.  Initialize them close to top of function. 
    dbl_var3 = 10.0;    //   Assigning variables other values can happen as needed.  But the value of a
    dbl_var4 = 0;         //   non-initialized variable is null.  Null is undefined.  It can produce weird results.


            
	System.out.println("Variable int_var1 is an integer" + int_var1);
	System.out.println("Variable dbl_var3 is a double" + dbl_var3);

           // Do a bit of math – division

           int_var2 = int_var1/ int_var2;  // danger danger – truncation risk.  Why?
           dbl_var4 = int_var1/dbl_var3;  // gpp why?

	System.out.println("variable int_var2 is result of int_var1 divided by dbl_var3" + int_var2);
	System.out.println("variable dbl_var4 is result of int_var1 divided by dbl_var3"+ dbl_var4);
   }
}
