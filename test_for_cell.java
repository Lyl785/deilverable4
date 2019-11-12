
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class test_for_cell {
	
	private ByteArrayOutputStream out = new ByteArrayOutputStream();
	
	@Before
	public void setUp() {
		System.setOut(new PrintStream(out));
	}
	
	@After
	public void tearDown() {
		System.setOut(null);
	}
	
	@Test
	public void tsetToStringsX(){	
		Cell k = new Cell();
		k.setAlive(true);
		String abc = k.toString();
		assertEquals("X", abc);
		}
		
	
	@Test 
	public void testToStringsdot(){
		Cell k = new Cell();
		String abc = k.toString();
		assertEquals(".", abc);
		}
	
	@Test 
	public void testToStringConvert(){
		Cell k = new Cell();
		k.setAlive(true);
		String abc = k.toString();
		assertEquals("X", abc);
		k.setAlive(false);
		abc = k.toString();
		assertEquals(".", abc);
	}
	}

