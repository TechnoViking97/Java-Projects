package OurGame;
//Loading entire awt package
import java.awt.*;
 
import javax.swing.ImageIcon;
 
public class Enemy {
		
		//Variables for each enemy
        Image img;
        int x, y;
        boolean isAlive = true;
       
      
        //Declaring starting positions for enemies
        public Enemy(int startX, int startY, String location)
        {
                x = startX;
                y = startY;
                ImageIcon l = new ImageIcon(location);
                img = l.getImage();
        }
       
        //Returning variables
        public int getX()
        {
                return x;
        }
        public int getY()
        {
                return y;
        }
        public boolean Alive()
        {
                return isAlive;
        }
        public Image getImage()
        {
                return img;
        }
       
        public void move(int dx, int left)
        {
                if (dx == 1 && !((left + dx )< 150))//Added this to only move enemy when character moves forward (not back)
                x = x - dx;
        }
}