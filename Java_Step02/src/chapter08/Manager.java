package chapter08;

public class Manager extends Employee_09{
	
	String department;
	
	//생성자 오버로딩
	public Manager(String name, int salary, String department) {
		super(name, salary);
		this.department = department;
	}
	
	
	//work
	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println(name +"관리자가 "+ salary +"만큼 일하고 있습니다.");
	}
	
	public void approveLeave(String employeeName) {
		System.out.println(name + "관리자가" + employeeName + "의 휴가를 승인.");
	}



	
}
