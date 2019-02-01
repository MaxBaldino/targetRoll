package targetRoll;

import java.util.Scanner;

public class targetRoll {

	public static void Main(String []args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Which number would you like to target?");
		int target = Integer.parseInt(input.nextLine());
		System.out.println("How many times should it roll?");
		int rollCount = Integer.parseInt(input.nextLine());
		int counter = rollCount;
		int targetNum = 0;
		
		while (counter > 1) {
			rollDice(target);
			
			
		}
		
		
	}
	
	public static int rollDice(int target) {
		use Random rand = new Random();
		int num = rand.nextInt(6) + 1;
		
	}
}
