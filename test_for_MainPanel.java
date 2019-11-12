
import static org.junit.Assert.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Before;
import org.junit.Test;



public class test_for_MainPanel {
	


	@Test
	public void testConvertToIntPos() {
		
		try {
			Method method = MainPanel.class.getDeclaredMethod("convertToInt", int.class);
			method.setAccessible(true);
			MainPanel ls = new MainPanel(15);
			Object returnValue = method.invoke(ls, 1);
			int foo = ((Integer) returnValue).intValue();
			assertEquals(1, foo);
					
		}catch(NoSuchMethodException|IllegalAccessException|InvocationTargetException ex) {
			System.err.println("Failure!");
		
	}
}

	
	@Test
	public void testConvertToIntZero() {
		
		try {
			Method method = MainPanel.class.getDeclaredMethod("convertToInt",int.class);
			method.setAccessible(true);
			MainPanel ls = new MainPanel(15);
			Object returnValue = method.invoke(ls, 0);
			int foo = ((Integer) returnValue).intValue();
			assertEquals(0, foo);
					
		}catch(NoSuchMethodException|IllegalAccessException|InvocationTargetException ex) {
			System.err.println("Failure1!");
		
	}
}
	
	@Test //(expected = Exception.class)
	public void testConvertToIntNeg() {
		
		try {
			Method method = MainPanel.class.getDeclaredMethod("convertToInt", int.class);
			method.setAccessible(true);
			MainPanel ls = new MainPanel(15);
			
			method.invoke(ls, -1);
			
					
		}catch(NoSuchMethodException|IllegalAccessException|InvocationTargetException ex) {
			System.err.println("Failure2!");
		
	}
}
	

	
	
	
	
}