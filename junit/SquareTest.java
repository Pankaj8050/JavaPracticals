package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class SquareTest {

	@Test
	public void test() {
	   JUnitEx1 testCase = new JUnitEx1();
	   int sq = testCase.square(3);
	   
	   assertEquals(9,sq);
	}

}
