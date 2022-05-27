import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/*
 * I declare that this code was written by me. 
 * I do not copy or allow others to copy my code. 
 * I understand that copying code is considered as plagiarism.
 * 
 * Student Name: Joshua
 * Student ID: 21008053
 * Class: C208
 * Date/Time created: 21/10/2021
 */


public class CalTest {

	int a, b;
	Calculator cal =new Calculator();
	
	@Before
	public void setUp() throws Exception {
		a=4321;
		b=1234;
	}
 
	 
	

	@Test
	public void testadd() {
		int actual = cal.add(a, b); 
		int expected = 5555;
		assertEquals (expected, actual);

		
	}
	@Test
	public void testsub() {
		int actual = cal.sub(a, b); 
		int expected = 3087;
		assertEquals (expected, actual);

		
	}
	@Test
	public void testdiv() {
		int actual = cal.div(a, b); 
		int expected = 3;
		assertEquals (expected, actual);

		
	}
	@Test
	public void testmul() {
		int actual = cal.mul(a, b); 
		int expected = 5332114;
		assertEquals (expected, actual);

		
	}
	@After
	public void tearDown() throws Exception {
	}

}
