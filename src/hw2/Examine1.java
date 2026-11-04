package hw2;

public class Examine1 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i < 1001; i++) {
			if(i % 2 != 0) {
				continue;
			}
			sum += i;
		}
		System.out.println(sum);
	}

}
