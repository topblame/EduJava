package chapter10.Interface;

public class MyClass implements MyInterface{

	@Override
	public void x() {
		// TODO Auto-generated method stub
		System.out.println("x()");
	}

	@Override
	public void y() {
		// TODO Auto-generated method stub
		System.out.println("y()");
	}

	@Override
	public void mymethod() {
		// TODO Auto-generated method stub
		System.out.println("mymethod");
		x();
		y();
	}
	

}
