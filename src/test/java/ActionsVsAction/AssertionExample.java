package ActionsVsAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import utilities.Utils;

public class AssertionExample  extends Utils {
	
	public static void main(String[] args) {
		
		getBrowser("chrome", "http://tek-school.com/retail/");
		String expectedText = "TEST ENVIRONMENTS";
		
		WebElement environmentText = driver.findElement(By.linkText("TEST ENVIRONMENT"));
		
		String actualText = environmentText.getText();
		// this is a hard assertion. 
		
		Assert.assertEquals(actualText, expectedText);
		System.out.println("the assertion passed " + actualText);
		
		hardWait(2000);
		tearDown();
		
	}

}
