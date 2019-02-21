//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot bot = new Robot();
		for (int i = 0; i < 1000; i++) {
			
		
		//3. Ask the user what color they would like the robot to draw
String color = "";//JOptionPane.showInputDialog("what color do you want?Red or blue? ");
		//5. Use an if/else statement to set the pen color that the user requested
		if( color.equals("red")) {
			bot.setPenColor(Color.red);
		}
		else if( color.equals("blue")) {
			bot.setPenColor(Color.blue);
		}		 
        //6. If the user doesn’t enter anything, choose a random color
		else if( color.equals("")) {
			bot.setRandomPenColor();
		}
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		bot.setPenWidth(20);
	    //2. Make the robot draw a shape (this will take more than one line of code)
		bot.penDown(); 
		bot.setSpeed(1000);
		bot.move(100);
		bot.turn(90);
		bot.move(100);
		bot.turn(90);
		bot.move(100);
		bot.turn(90);
		bot.move(100);
		bot.turn(82);
		}
	}
	
	
}
