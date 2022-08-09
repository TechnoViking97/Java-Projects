package OurGame;
 //Importing awt package
import java.awt.*;
 
import javax.swing.ImageIcon;
 //Declaring class for bullet
public class Bullet {
		
		//Declaring variables for bullets
        int x,y;
        Image img;
        boolean visible;
       
        //Class for displaying the bullets
        public Bullet(int startX, int startY)
        {
                x = startX;
                y = startY;
                ImageIcon newBullet = new ImageIcon("U:/bullet.png");
                img = newBullet.getImage();
                visible = true;
        }
       
        //Returning each of the bullets variables
        public int getX()
        {
                return x;
        }
        public int getY()
        {
                return y;
        }
        public boolean getVisible()
        {
                return visible;
        }
        public Image getImage()
        {
                return img;
        }
       
        //Code allowing the bullet to continuously move
        public void move()
        {
                x = x + 2;
                if ( x > 1200)
                        visible = false;
        }
       
}