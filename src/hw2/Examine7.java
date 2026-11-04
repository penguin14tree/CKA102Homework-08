package hw2;

public class Examine7 {
	public static void main(String[] args) {
		
		int letter = 65;
		for(int i = 1; i < 7; i++ ) {
			for(int j = 1; j <= i; j++) {
				System.out.print((char)letter);
			}
			letter+= 1;
			System.out.println();
		}
	}
}
