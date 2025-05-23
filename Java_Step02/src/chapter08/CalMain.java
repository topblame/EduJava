package chapter08;

import java.util.Scanner;

public class CalMain {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		CalPlus p = new CalPlus();
//		CalMinus m = new CalMinus();
//		int plus = p.getResult(15, 15);
//		int minus = m.getResult(25, 10);
//		
//		System.out.println("CalPlus : " + plus);
//		System.out.println("CalMinus : " + minus);
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("정수 a를 입력하세요. ");
		int a = s.nextInt();
		System.out.print("정수 b를 입력하세요. ");
		int b = s.nextInt();
		
		Example[] calculators = {new CalPlus(), new CalMinus()};
		for(Example e: calculators) {
			System.out.println(e.getClass().getSimpleName() + ": " + e.getResult(a, b));
		}

		
		//방법 3
		calc(new CalPlus(), a, b); // Example c1 = new CalPlus() -> c1.getResult(a,b)
	
		
	}
	public static int calc(Example c1, int a, int b) {
		return c1.getResult(a, b);
	}

}
