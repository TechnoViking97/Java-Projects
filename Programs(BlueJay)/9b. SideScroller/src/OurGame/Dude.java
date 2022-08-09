package OurGame;
 
//Importing entire .awt package
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
 
import javax.swing.ImageIcon;
 
//Declaring class dude
public class Dude {
	//Defining variables for dude movement
	
        int x, dx, y,nx,nx2,left, dy;
        
        //Variables to be used in image loading methods
        
        Image still,jump,reverse;
        
       //Variable for player's ammo
        int ammo = 10;
       
        //Loading all images for player character
        //Still image for player
        ImageIcon s = new ImageIcon("U:/dude.png");
        //Image loads when player jumps
        ImageIcon j= new ImageIcon("U:/jump.png");
        //Image loads when palyer turns left
        ImageIcon l = new ImageIcon("U:/left.png");
       
        //Declaring array list for bullets
        static ArrayList bullets;
       
        //Declaring position for dude on JFrame
        public Dude() {
                x = 75;
                left = 150;
                nx = 0;
                nx2= 685;
                y = 172;
                //Loads still picture for palyer character
                still = s.getImage();
                //Puts array list on JFrams
                bullets = new ArrayList();
       
        }
        
        //Method that returns the number of remaining bullets the player has
        public static ArrayList getBullets()
        {
                return bullets;
        }
       //Method for player firing weapon
        public void fire()
        {
        		//If player's ammunition is greater than 0 then allow them to fire
                if (ammo > 0)
                {
                ammo--;
                //The v is from the board class, which corresponds to the character's
                //position when it is jumping, resulting in the bullet being formed
                //at a higher position when the character is at the peak of its jump
                        Bullet z = new Bullet((left + 220), (Board.v + 256/2));
                bullets.add(z);
        }}
        
        //Methods involved for moving player character on screen
        public void move() {
                if (dx != -1){
                        if (left + dx <= 150)
                                left+=dx;
                        else{
                x = x + dx;
               
                nx2= nx2+dx;
                        nx = nx + dx;
        }}
                else
        {
                if (left+dx >0)
                left = left + dx;
        }
                }
 
        public int getX() {
                return x;
        }
       
        public int getLeft(){
                return left;
        }
 
        public int getnX() {
                return nx;
        }
       
        public int getnX2() {
                return nx2;
        }
 
        public int getdx() {
                return dx;
        }
       
        public Image getImage() {
                return still;
        }
        
        //Using key listener to allow player movement on the Fram
        public void keyPressed(KeyEvent e) {
                int key = e.getKeyCode();
                
                //If any of the keys are pressed than move in the intended direction
                if (key == KeyEvent.VK_LEFT)
                {               dx = -1;
                still = l.getImage();           }
               
                if (key == KeyEvent.VK_RIGHT)
                        {dx = 1;
                still = s.getImage();  
                        }
               
                if (key == KeyEvent.VK_SPACE)
                {
                        fire();
                }
               
                if (key == KeyEvent.VK_UP)
                        {dy = 1;
                        still = j.getImage();
                        }  
                }
        //If any of the keys are released then don't move the character at all
        public void keyReleased(KeyEvent e) {
                int key = e.getKeyCode();
 
                if (key == KeyEvent.VK_LEFT)
                        dx = 0;
 
                if (key == KeyEvent.VK_RIGHT)
                        dx = 0;
               
                if (key == KeyEvent.VK_UP)
                        {dy = 0;
                        still = s.getImage();}
                        }
        }