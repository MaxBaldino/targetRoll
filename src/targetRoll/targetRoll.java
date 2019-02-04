package targetRoll;

import java.util.Scanner;
import java.util.Random;


public class targetRoll {

	public static void Main(String []args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Which number would you like to target?");
		int target = Integer.parseInt(input.nextLine());
		System.out.println("How many times should it roll?");
		int rollCount = Integer.parseInt(input.nextLine());
		int counter = rollCount;
		int targetCount = 0;
		
		while (counter > 1) {
			targetCount += rollDice(target);
			counter -= 1;
			
		}
		System.out.println("The number " + target + " was rolled " + targetCount + " times out of " + rollCount + " rolls.");
		
		
	}
	
	public static int rollDice(int target) {
		Random rand = new Random();
		int num = rand.nextInt(6) + 1;
		if num = target {
			return 1;
		}
		else {
			return 0;
		}
		
	}
}
