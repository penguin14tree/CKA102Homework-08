package hw1;

public class examine5 {
	public static void main(String[] args) {
		int principal = 1500000;
		double interestRate = 0.03;
		double principalInterest = principal * (Math.pow((1 + interestRate), 10.0));
		String result = "The principal plus interest totals %f dollars.";
		String answer = result.formatted(principalInterest);
		System.out.println(answer);
	}
}
