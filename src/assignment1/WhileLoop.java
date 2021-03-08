package assignment1;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {

		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("How many bottles of soda are on the wall?");
			
		
			
			int bottlesOfSoda = Integer.parseInt(sc.nextLine());

			while (bottlesOfSoda < 0) {
				System.out.println("Please select a number higher than 0\nTry again\n");
				System.out.println("How many bottles of soda are on the wall?");
				bottlesOfSoda = Integer.parseInt(sc.nextLine());

			}

			while (bottlesOfSoda == 0) {
				System.out.println("Please select a number higher than 0\nTry again\n");
				System.out.println("How many bottles of soda are on the wall?");
				bottlesOfSoda = Integer.parseInt(sc.nextLine());

			}

			if (bottlesOfSoda >= 1) {
				while (bottlesOfSoda != 1) {
					System.out.println(bottlesOfSoda + " Bottles of soda on the wall\n" + bottlesOfSoda
							+ " Bottles of soda\nYou take one down pass it around\n" + (bottlesOfSoda - 1)
							+ " Bottles of soda\n");

					bottlesOfSoda--;

				}
				System.out.println(bottlesOfSoda + " Bottle of soda on the wall\n" + bottlesOfSoda
						+ " Bottle of soda\nYou take one down pass it around\nNow there is no more soda on the wall");

			}
			
		}
		catch(Exception e) {
			System.out.println("You must enter an integer");
		}

	}
}
