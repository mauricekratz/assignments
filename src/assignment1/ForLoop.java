package assignment1;

public class ForLoop {
	public static void main(String[] args) {

		int bottlesOfBeer = 99;
		while (bottlesOfBeer != 0) {
			if (bottlesOfBeer > 1) {

				System.out.println(bottlesOfBeer + " Bottles of beer on the wall\n" + bottlesOfBeer
						+ " Bottles of beer\nYou take one down pass it around " + (bottlesOfBeer - 1)
						+ " Bottles of beer\n");
				bottlesOfBeer--;
			} else if (bottlesOfBeer >= 1) {
				System.out.println(bottlesOfBeer + " Bottle of beer on the way\n" + bottlesOfBeer
						+ " Bottle of beer\nYou take one down pass it around\nThere is no more beer on the wall");
				bottlesOfBeer--;
			}

		}
	}
}
