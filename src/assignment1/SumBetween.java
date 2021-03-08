package assignment1;

public class SumBetween {

	public static void main(String[] args) {

		int oddSum = 0;
		for (int i = 0; i <= 100; i++) {
			if (isOdd(i)) {
				oddSum += i;

			}
		}

		int evenSum = 0;
		for (int i = 0; i <= 100; i++) {
			if (isEven(i)) {
				evenSum += i;
			}
		}

		if (evenSum > oddSum) {
			System.out.println("The sum of the even numbers between 1 and 100 is " + evenSum
					+ "\nThe sum of the odd numbers between 1 and 100 is " + oddSum);
			System.out.println("\n----------------------------------------------------\n\nThe Even sum [ " + evenSum
					+ " ] is the larger of the two");
		} else if (oddSum > evenSum) {
			System.out.println("The sum of the odd numbers between 1 and 100 is " + oddSum
					+ "\nThe sum of the even numbers between 1 and 100 is " + evenSum);
			System.out.println("\n----------------------------------------------------\n\nThe Odd sum [ " + oddSum
					+ " ] is the larger of the two");
		}
	}

	public static boolean isOdd(int n) {
		if (n % 2 != 0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isEven(int n) {
		if (n % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
}
