package JUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testaddStrings {

	@Test
	public void test() {
		JUnitTest obj = new JUnitTest();
		String result = obj.addStrings("ratik", "vig");
		assertEquals("ratikvig",result);
	}

}