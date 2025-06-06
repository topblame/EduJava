package chapter12.string;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StringBufferMain_08 {
	
	public static void main(String[] args) throws ClassNotFoundException{
		StringBuffer buf = new StringBuffer("Nice Day ");
		System.out.println(buf.toString());
		System.out.println(buf.length());
		System.out.println(buf.capacity());
		
		buf.insert(0,  "Hi ");
		System.out.println(buf.toString());
		
		buf.insert(11 ,  "Everybody! ");
		System.out.println(buf.toString());
		
		buf.delete(0,  3);
		System.out.println(buf);
		
		StringBuilder sb= new StringBuilder();
			sb.ensureCapacity(50);
			
			Class sClass = Class.forName("chapter12.string.Student");
			System.out.println(sClass);
			
			Constructor[] cons1 = sClass.getConstructors();
			for(Constructor c : cons1) {
				System.out.println(c);
			}
			Field[] field = sClass.getFields();
			for(Field f : field) {
				System.out.println(f);
			}
			Method[] method1 = sClass.getMethods();
			for(Method m : method1) {
				System.out.println(m);
			}
	}
}
