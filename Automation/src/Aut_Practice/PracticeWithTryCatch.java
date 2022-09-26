package Aut_Practice;

import org.openqa.selenium.StaleElementReferenceException;

public class PracticeWithTryCatch{
	public final String x="test";
	private static PracticeWithTryCatch ObjType =null;
	private PracticeWithTryCatch() {
		
	}
	
	public static PracticeWithTryCatch GetObject() {
		
		if (ObjType==null) {
			ObjType=new PracticeWithTryCatch();
		}
		return ObjType;
	}
	
	
	public static void main(String[] args) {
		
		
//		try {
//			int a=10;
//			int b=20;
//			int c1=a+b;
//			System.out.println(c1);
//			int c=10/0;
//			System.out.println(c);
//			try {
//				System.out.println("it is in child try");
//			}catch(Exception e) {
//				System.out.println("it is in child catch");
//			}
//		}catch(StaleElementReferenceException ep) {
//			System.out.println(ep);
//	
//		}catch(ArithmeticException e) {
//			System.out.println(e);
//		}catch(Exception e) {
//			System.out.println(e);
//		}

		
//		try {
//			// we wright code which is rishky
//			System.out.println("we are in try block-1");
//		int x=10;
//		int c=x/2;
//		System.out.println("we are in try block-2");
//		}catch(Exception e) {
//			// we use for recovery
//			System.out.println(e);
//		}finally{
//			// we use it for clean up
//			System.out.println("we are in finally block");
//		}
		
		
		
		
		
		
//		try {
//			System.out.println("we are in try block-1");
//			int x=10;
//			int c=x/0;
//			System.out.println("we are in try block-2");
//		}finally {
//			System.out.println("we are in Finally block");
//		}
		
		
		
	}

}
