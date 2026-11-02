package hw1;

public class examine6 {
	public static void main(String[] args) {
		int num = 5;
		char charater = '5';
		String string = "5";
		System.out.println(num + num); //10，因為只是整數相加
//		System.out.println((int)charater);
		System.out.println(num + charater);// char 與 int 相加，會使char以unicode輸出，而char '5'是指53，所以結果為5+53=58 
		System.out.println(num + string);//字串相加，結果為一字串
	}
}
