package chapter08;

public class CalPlus extends Example {
	private static int plus;
	
	@Override
	public int getResult(int n1, int n2) {
		// TODO Auto-generated method stub
			plus = n1 + n2;
			return plus;
	}
	
}
