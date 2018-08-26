package testScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import library.BaseTest;

public class Test1 extends BaseTest {
	
	@Test
	public void testGoogle()
	{
			String eTitle = "Google";
			String aTitle = driver.getTitle();
			Assert.assertEquals(aTitle, eTitle);
		
	}

}
