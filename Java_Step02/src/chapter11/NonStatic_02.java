package chapter11;

import javax.swing.JOptionPane;
class Out2{
	//멤버변수
	static int a = 1;
	int b;
	
	public static class In{
		//멤버변수 
		
		
		//생성자 
		
		
		//메서드
		String Infun() {
			return a + "번째 Static 내부 클래스.";
			
		}//Infun
	
	}//in class

}//out

public class NonStatic_02 {
	public static void main(String[] args) {
		//static 클래스는 직접 접근이가능함.
		Out2.In obj1 = new Out2.In();
		String str = obj1.Infun();
		
		JOptionPane.showMessageDialog(null, str + "\n Success");
	}

}
