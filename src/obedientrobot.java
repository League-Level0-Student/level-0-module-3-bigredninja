import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class obedientrobot {
	public static void main(String[] args) {
		Robot rob = new Robot();
		String was = JOptionPane.showInputDialog("which shape do you want? triangle,square or circle?");
		String wsd = JOptionPane.showInputDialog("which color do you want? red,green,blue?");
		if (wsd.equals("red")) {
			rob.setPenColor(Color.red);
		}
		else if (wsd.equals("green")) {
			rob.setPenColor(Color.green);
		} 
		else if (wsd.equals("blue")){
			rob.setPenColor(Color.BLUE);
		}
		if (was.equals("triangle")) {
			drawTriangle(rob);
		}
		else if (was.equals("circle")) {
			drawCircle(rob);
		} 
		else if (was.equals("square")){
			drawSquare(rob);
		}
		//drawSquare(rob);
		//drawTriangle(rob);
		//drawCircle(rob);
		
	}
	static void drawSquare(Robot rob) {
		rob.penDown();
		rob.setSpeed(1000);
		rob.move(90);
		rob.turn(90);
		rob.move(90);
		rob.turn(90);
		rob.move(90);
		rob.turn(90);
		rob.move(90);
		rob.turn(90);
	}
	static void drawTriangle(Robot rob) {
		rob.penDown();
		rob.setSpeed(1000);
		rob.move(90);
		rob.turn(120);
		rob.move(90);
		rob.turn(120);
		rob.move(90);
		rob.turn(120);
	}
	static void drawCircle(Robot rob) {
		rob.penDown();
		rob.setSpeed(1000);
		for (int i = 0; i <360; i++) {
			rob.move(1);
			rob.turn(1);
		}
	}
}
