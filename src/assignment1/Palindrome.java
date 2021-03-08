package assignment1;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		String userInput = "";
		String reverse = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string or number to check if it is a palindrome");
		userInput = sc.nextLine();
		int length = userInput.length();
		for (int i = length - 1; i >= 0; i--)
			reverse = reverse + userInput.charAt(i);
		if (userInput.equals(reverse))
			System.out.println(userInput + " string/number is a palindrome.");
		else
			System.out.println(userInput + " string/number is not a palindrome.");

	}

}
