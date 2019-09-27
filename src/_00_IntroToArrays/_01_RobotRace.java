package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {

		// 2. create an array of 5 robots.
		Robot[] bot = new Robot[5];

		// 3. use a for loop to initialize the robots.
		for (int i = 0; i < bot.length; i++) {
			bot[i] = new Robot();
			bot[i].setX(200 * i + 50);
			bot[i].setY(550);
			bot[i].setSpeed(10);
		}
		// 4. make each robot start at the bottom of the screen, side by side, facing up

		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
		Boolean rRacing = true;
		while (rRacing) {
			for (int i = 0; i < bot.length; i++) {
				if (bot[i].getY() < 50) {
					rRacing = false;
				}

			}

			Random r = new Random();
			for (int l = 0; l < bot.length; l++) {
				bot[l].move(r.nextInt(50));
			}
		} // 6. use a while loop to repeat step 5 until a robot has reached the top of the
			// screen.

		// 7. declare that robot the winner and throw it a party!

		// 8. try different races with different amounts of robots.

		// 9. make the robots race around a circular track.

	}
}