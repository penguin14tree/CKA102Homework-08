package hw2;

public class Examine5 {
	public static void main(String[] args) {
		int count = 0;
		
		for(int i = 1;i < 50; i++) {
			if(i % 10 != 4 && i / 10 != 4) {
//				count ++; //35
				System.out.print(i);
				System.out.print(" ");
				count ++;
			}
		}
		System.out.println();
		System.out.println("He has %d numbers to choose.".formatted(count));
		
		// 適用更廣大的方法(還寫不出來)(好ㄌ&& ||還是有點卡)
//		for (int number = 1; number < 100; number++) {
//			int temp = number;
//			boolean valid = true;//尚未出現4
//			while (valid && temp != 0) {
//				
//				int remainder = temp % 10;
//				temp /= 10;
//				
//				if (remainder == 4) {
//					valid = false;
//					break;
//				}
//			}
//			if(valid) {
//				count++;
//				System.out.print(number);//沒有4的數字
//				System.out.print(" ");
//			}
//		}
//		System.out.print(count);
		
	}
}
// 4 14 24 34 44 
