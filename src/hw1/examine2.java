package hw1;

public class examine2 {
	public static void main(String[] args) {
		int numEggs = 200;
		int dozenEggs = numEggs / 12;
		int remainingEggs = numEggs % 12;
		System.out.println("There are %d dozen and %d eggs.".formatted(dozenEggs, remainingEggs));
	}

}
