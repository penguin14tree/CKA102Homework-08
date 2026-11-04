package hw1;

public class Examine4 {
	public static void main(String[] args) {
		final double valuePi = 3.1415;
		double radius = 5;
		double areaCircle = Math.pow(radius, 2.0);
		double circumference = 2 * valuePi * radius;
//		System.out.println(areaCircle);
//		System.out.println(circumference);
		String template = "The circle area is %f and the circumference is %f.";
		String answer = template.formatted(areaCircle, circumference);
		System.out.println(answer);
		
	}

}
