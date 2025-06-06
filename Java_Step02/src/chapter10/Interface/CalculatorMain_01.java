package chapter10.Interface;

public class CalculatorMain_01 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 5;
		
		Calc calc = new CompleteCalc2();
		
		System.out.println("--------Default method----------");
		calc.description(); // override 재정의된 메서드
		
		System.out.println("-----------static method -------------");
		int[] arr = {1,2, 3, 4, 5};
		System.out.println("1~5 까지의 합. : " + Calc.total(arr));
		System.out.println();
		
		System.out.println("---------interface Method----------");
		System.out.println("num1 + num2 : " +calc.add(num1, num2));
		System.out.println("num1 - num2 : " +calc.substaract(num1, num2));
		System.out.println("num1 * num2 : " +calc.times(num1, num2));
		System.out.println("num1 / num2 : " +calc.divide(num1, num2));
		System.out.println();
		
		System.out.println("------------child Method-------------");
		CompleteCalc2 c2 = new CompleteCalc2();
		c2.showInfo();
	}
}
