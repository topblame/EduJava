package chapter10.Interface;

public class MyClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass cl = new MyClass();
		
		X xcl = cl; // X 클래스 타입.
		xcl.x();
		
		System.out.println();
		
		Y ycl = cl; //Y 클래스 타입
		ycl.y();
		System.out.println();
		
		MyInterface icl = cl;
		icl.mymethod();
	}
	

}
