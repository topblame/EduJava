package chapter10.Interface;

public class CompleteCalc2 extends CompleteCalc1{

	@Override
	public int times(int num1, int num2) {
		// TODO Auto-generated method stub
		return (num1 * num2);
	}

	@Override
	public int divide(int num1, int num2) {
		// TODO Auto-generated method stub
		if(num2 != 0) {
			return (num1 / num2);
		}
		else {
			return ERROR;
		}
	}
	public void showInfo() {
		System.out.println("Calc 인터페이스를 구현하였습니다.");
	}

	@Override
	public void description() {
		// TODO Auto-generated method stub
		super.description();
		System.out.println("공학용 계산기 추가합니다.");
	}
	
	
}
