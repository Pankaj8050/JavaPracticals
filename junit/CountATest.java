package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class CountATest {

	@Test
	public void test() {
	  JUnitEx1 testCase = new JUnitEx1();
	  int count = testCase.countA("Education");
	  
	  assertEquals(1,count);
	}

}
