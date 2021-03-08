package assignment1;

public class IsOdd {
	
public static void main(String[] args) {
		
		for (int i = 100; i <= 199; i++) {
			if(isOdd(i)) {
				System.out.println(i);
			}
		}
	
	}
	
	public static boolean isOdd(int n) {
		if (n%2!=0) {
			return true;
		}else {
			return false;
		}
	}
}

