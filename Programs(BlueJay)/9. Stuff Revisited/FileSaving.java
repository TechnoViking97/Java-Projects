
/**
 * Class for the writing and reading to a file
 * 
 * @author (Trevor and Tyler) 
 * @version (v1 5/23/14)
 */

//importing the things needed for writing and reaeding files
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;

//importing the things needed for buttons
import java.awt.EventQueue;
import javax.swing.JComponent; 
import javax.swing.JFrame;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Dimension;

public class FileSaving
{
    //declaring p1 as a JPanel
    static JPanel p1;

    //creates the file and writes the class information to it
    public static void fileCreating(int strength, int defense, int magic, int finesse, int vigor) throws Exception
    {
        //instantiates the file class and names it newFile
        File newFile = new File("U:text.txt");
        
        //if statement on if the file exists or not
        if (newFile.exists())
        {
            //writing the class data to the file 
            newFile.createNewFile();
            FileWriter fileW = new FileWriter(newFile);
            BufferedWriter buffW = new BufferedWriter(fileW);
            buffW.write("Your stats are: " +
                "Strength: " + strength +
                "\nDefense: " + defense +
                "\nMagic: " + magic +
                "\nFinesse: " + finesse +
                "\nVigor: " + vigor);
            buffW.close();
            
            //printintg out to the user that the stats have been saved
            System.out.println("Stats Saved");
        }
        else
        {
            //if not it creates the file
            try
            {
                newFile.createNewFile();
            }
            catch (Exception e)
            { 
                e.printStackTrace();
            }

            //after the file is created, then it repeats the if file exists in the top of the if statement
            try
            {
                FileWriter fileW = new FileWriter(newFile);
                BufferedWriter buffW = new BufferedWriter(fileW);
                buffW.write("Your stats are: " +
                    "Strength: " + strength +
                    "\nDefense: " + defense +
                    "\nMagic: " + magic +
                    "\nFinesse: " + finesse +
                    "\nVigor: " + vigor);
                buffW.close();
                System.out.println("File written!");
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }

    //method to read the file
    public static void FileReading() throws Exception
    {

        //instantiating the fileReader as file
        FileReader file = new FileReader("U:text.txt");
        BufferedReader reader = new BufferedReader(file);

        String text = "";
        String line = reader.readLine();
        while (line != null)
        {
            text += line;
            line = reader.readLine();
        }
        reader.close();
        System.out.println(text);
    }

}
