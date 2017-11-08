package JUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testaddNumbers {

	@Test
	public void test() {
	JUnitTest obj = new JUnitTest();
	int result = obj.addNumbers(100, 200);
	assertEquals(300,result);
	}

}