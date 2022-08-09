
/**
 * This class allows th euser to create a class
 * 
 * @author (Trevor and Tyler) 
 * @version (v1 5/23/14)
 */
public class pickstuff extends Options
{
    //method that allows users to create their own class
    public static void pickStats() throws Exception
    {
        //type in a name for the class and svaing the variable as name
        System.out.println("Type a name for the class: ");
        name = sc.next();

        //telling the user the restraints on the class
        System.out.println("You have 20 skill points, align where you like: In order from strength, defense, magic, finesse, vigor.");
        
        //if statement for the actual creating of the class
        if (total>0)
        {
            //a do while loo to make sure that the user only enters numbers 0-20
            //FOR STRENGH
            do
            {
                System.out.println("Total Skill Points Left = " + total);
                System.out.println("Type in stat value for strength: ");
                strengthChoice = sc1.nextInt();
            }
            while (strengthChoice <0 || strengthChoice >20);
            
            //saving the number entered as strengh and subrtacting that number from the total
            strength = strengthChoice;
            total = total - strengthChoice;

            //nested if statement to recheck if the total is grater than zero
            if (total>0)
            {
                //a do while loo to make sure that the user only enters numbers 0-20
                //FOR DEFENSE
                do
                {
                    System.out.println("Total Skill Points Left = " + total);
                    System.out.println("Type in stat value for defense: ");
                    defenseChoice = sc1.nextInt();
                }
                while (defenseChoice <0 || defenseChoice >total);
                
                //saving the number entered as defense and subrtacting that number from the total
                defense = defenseChoice;
                total = total - defenseChoice;

                //nested if statement to recheck if the total is grater than zero
                if (total>0)
                {
                    //a do while loo to make sure that the user only enters numbers 0-20
                    //FOR MAGIC
                    do
                    {
                        System.out.println("Total Skill Points Left = " + total);
                        System.out.println("Type in stat value for magic: ");
                        magicChoice = sc1.nextInt();
                    }
                    while (magicChoice <0 || magicChoice >total);
                    
                    //saving the number entered as magic and subrtacting that number from the total
                    magic = magicChoice;
                    total = total - magicChoice;
                    
                    //nested if statement to recheck if the total is grater than zero
                    if (total>0)
                    {
                        //a do while loo to make sure that the user only enters numbers 0-20
                        //FOR FINESSE
                        do
                        {
                            System.out.println("Total Skill Points Left = " + total);
                            System.out.println("Type in stat value for finesse: ");
                            finesseChoice = sc1.nextInt();
                        }
                        while (finesseChoice <0 || finesseChoice >total);
                        
                        //saving the number entered as finesse and subrtacting that number from the total
                        finesse = finesseChoice;
                        total = total - finesseChoice;
                        
                        //nested if statement to recheck if the total is grater than zero
                        if (total>0)
                        {
                            //a do while loo to make sure that the user only enters numbers 0-20
                            //FOR VIGOR
                            do
                            {
                                System.out.println("Total Skill Points Left = " + total);
                                System.out.println("Type in stat value for vigor: ");
                                vigorChoice = sc1.nextInt();
                            }
                            while (vigorChoice <0 || vigorChoice >total);
                            
                            //saving the number entered as vigor and subrtacting that number from the total
                            vigor = vigorChoice;
                            total = total - vigorChoice;
                        }
                        //each else does pretty much the same thing
                        //if you run out of skill points, i.e. put in 20 for strength, then the rest of the stats are automatically set to zero
                        else
                        {
                        }
                    }
                    else 
                    {
                        System.out.println("Total number of skill points below zero, setting all other skills to zero.");
                        vigor = 0;
                    }
                }
                else
                {
                    System.out.println("Total number of skill points below zero, setting all other skills to zero.");
                    finesse = 0;
                    vigor = 0;
                }
            }
            else
            {                
                System.out.println("Total number of skill points below zero, setting all other skills to zero.");
                magic = 0;
                finesse = 0;
                vigor = 0;
            }
        }
        else
        {
            System.out.println("Total number of skill points below zero, setting all other skills to zero.");
            defense = 0;
            magic = 0;
            finesse = 0;
            vigor = 0;
        }

        //calling the display method
        display1();
    }

    //method created to list stats and calss name
    public static void display1() throws Exception
    {
        System.out.println("Your Class - ");
        System.out.println("Class Name: " + name);
        System.out.println("Strength: " + strength);
        System.out.println("Defense: " + defense);
        System.out.println("Magic: " + magic);
        System.out.println("Finesse: " + finesse);
        System.out.println("Vigor: " + vigor);

    }
}
