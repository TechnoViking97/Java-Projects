
/**
 * This program allows the user to either pick a class or create a class. Then it allows the user to write and read to a file using a button
 * 
 * @author (Trevor and Tyler) 
 * @version (v1 5/23/14)
 */

//importing everything needed for file writing and reading
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;

//importing everything needed for the button
import java.awt.EventQueue;
import javax.swing.JComponent; 
import javax.swing.JFrame;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Dimension;

public class Mainprog extends pickstuff
{    
    public static void main (String[]ars) throws Exception
    {
        System.out.println('\f');

        //asking if the user would rather pick or create a class
        System.out.println("Choose from a predifined (Type '1')class or choose your own stats (Type '2')");
        choice1 = sc.nextInt();

        //calling the pick class method
        pickClass();      
        
        //Asking if you would like to read the data saved to the text file text.txt
        System.out.println("Your class has been saved to the file text.txt in your U drive. Would you like to read it it? \n1 for yes, 2 for no");
        choice5 = sc.nextInt();
        
        //if yes then it calls the File Reading program, no then the program ends
        if(choice5 == 1)
        {
            FileReading();
        }
        else
        {
        }
    }
}

