package junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TestAnnotations {

	@Test
	public void test() {
		System.out.print("Test");
	}
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class");
		
	}
	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
	}
	
	@Before
	public void before() {
		System.out.println("Before");
	}
	
	@After
	public void after() {
		System.out.println("After");
	}
	
	@Ignore
	public void ignore() {
		System.out.println("Ignore");
	}
}
