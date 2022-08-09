package OurGame;

//Importing java awt package
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
 
import javax.swing.*;

//Declaring Board class and extending the Jpanel while implementing the action listener
public class Board extends JPanel implements ActionListener, Runnable {
	
		//Declaring variables
	
        Dude p; //Variable for character
        public Image img; //Variable for loading an image
        Timer time; //Variable for movement timer
        static int v = 172;
        Thread animator;
        Enemy en; //Variables for enemies
        Enemy en2;

        boolean lost = false;

        boolean a = false;
        boolean done2 = false;
       
        //Displaying text for ammo count
        static Font font = new Font("Stencil", Font.BOLD, 30);
        
        //Adding method for Board that loads all images
        public Board() {
                p = new Dude();
                addKeyListener(new AL());
                setFocusable(true);
                ImageIcon i = new ImageIcon("U:/Background.png");
                img = i.getImage();
                time = new Timer(5, this);
                time.start();
                
                //adding enemies and their spawn locations(in pixels)
                en = new Enemy(950, 125, "U:/enemy.png");
                en2 = new Enemy(1200, 125, "U:/enemy.png");
        }
        
        //Code needed for player firing weapon
        public void actionPerformed(ActionEvent e) {
                System.out.println(p.x);
                ArrayList bullets = Dude.getBullets();
                for (int w = 0; w < bullets.size(); w++)
                {
                        Bullet m = (Bullet) bullets.get(w);
                        if (m.getVisible() == true)
                        m.move();
                        else
                                bullets.remove(w);
                }
               
                p.move();
               
                if (p.x > 400)
                        en.move(p.getdx(), p.getLeft());
                if (p.x> 500)
                        en2.move(p.getdx(), p.getLeft());
                repaint();
        }
 
        public void paint(Graphics g) {
                if (p.dy == 1 && done2 == false) 
                {
                        done2 = true;
                        animator = new Thread(this);
                        animator.start();
                }
                
                super.paint(g);
                Graphics2D g2d = (Graphics2D) g;
 
                if ((p.getX() - 590) % 2400 == 0)// p.getX() == 590 || p.getX() == 2990)...
                        p.nx = 0;
                if ((p.getX() - 1790) % 2400 == 0)// p.getX() == 1790 || p.getX() == 4190)...
                        p.nx2 = 0;
                
                //Code allowing for image looping, once user gets to pixel 590 then the image reloads
                g2d.drawImage(img, 685 - p.getnX2(), 0, null);
                if (p.getX() > 590) 
                {		//Code for image reloading
                        g2d.drawImage(img, 685 - p.getnX(), 0, null);
                }
                //Code for image reloading
                g2d.drawImage(p.getImage(), p.left, v, null);
                
                //Code in case user goes to the left
                if (p.getdx() == -1) 
                {		//Reloads image
                        g2d.drawImage(img, 685 - p.getnX2(), 0, null);
                        g2d.drawImage(p.getImage(), p.left, v, null);
                }
               
                
                
                ArrayList bullets = Dude.getBullets();
                for (int w = 0; w < bullets.size(); w++)
                {
                        Bullet m = (Bullet) bullets.get(w);
                        g2d.drawImage(m.getImage(),m.getX(), m.getY(), null);
                }
                //Drawing text for ammo along with color and font
                g2d.setFont(font);
                g2d.setColor(Color.BLUE);
                //Declaring position of text on screen
                g2d.drawString("Ammo left: " + p.ammo, 500, 20);
                
                //Code for enemies and spawning each of them
                if (p.x > 400)
                        if (en.Alive() == true)
                                g2d.drawImage(en.getImage(), en.getX(), en.getY(), null);
                if (p.x > 500)
                        if (en2.Alive() == true)
                                g2d.drawImage(en2.getImage(), en2.getX(), en2.getY(), null);
        }
        
        private class AL extends KeyAdapter {
                public void keyReleased(KeyEvent e) {
                        p.keyReleased(e);
                }
 
                public void keyPressed(KeyEvent e) {
                        p.keyPressed(e);
                }
        }
 
        boolean h = false;
        boolean done = false;
 
        public void cycle() {
 
                if (h == false)
                        v--;
                if (v == 125)
                        h = true;
                if (h == true && v <= 172) {
                        v++;
                        if (v == 172) {
                                done = true;
                        }
                }
        }
 
        //Code for jumping
        public void run() 
        {
 
                long beforeTime, timeDiff, sleep;
 
                beforeTime = System.currentTimeMillis();
 
                while (done == false) 
                {
 
                        cycle();
 
                        timeDiff = System.currentTimeMillis() - beforeTime;
                        sleep = 10 - timeDiff;
 
                        if (sleep < 0)
                                sleep = 2;
                        try 
                        {
                                Thread.sleep(sleep);
                        } 
                        catch (InterruptedException e) 
                        {
                        	
                        }
 
                        beforeTime = System.currentTimeMillis();
                }
                
                
                done = false;
                h = false;
                done2 = false;
        }
 
}