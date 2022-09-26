package Aut_Practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling2  {

	public static void main (String [] srgs) {

		ExceptionHandling2 obj=new ExceptionHandling2();
		try {
			obj.creatfile();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		try {
//			int x=10;
//			x=x/0;
//			
//		}catch(ArithmeticException e) {
//			
//			throw new RuntimeException("not matched the current data");
//		}

		
		
		
	}

	public void creatfile() throws FileNotFoundException {
		File fileobj=new File("hihh");
		new FileInputStream(fileobj);
	}
}
