//Packaging entire program

package OurGame;

 //Importing items needed to run JFrame and class

import javax.swing.*;
 
//Declaring class Frame

public class Frame {
	
		//Making method for Frame()
        public Frame(){
                JFrame frame = new JFrame();
                frame.add(new Board());
                frame.setTitle("2-D Test Game");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(1200,560);
                frame.setVisible(true);
                frame.setLocationRelativeTo(null);
        }
        public static void main(String[] args){
        	//Calling Frame in main
                new Frame();
        }
}
