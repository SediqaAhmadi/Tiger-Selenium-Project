package ActionsVsAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import utilities.Utils;

public class SoftassertionClassExample extends Utils {
	
public static void main(String[] args) {
		
		getBrowser("chrome", "http://tek-school.com/retail/");
		String expectedText = "TEST ENVIRONMENTS";
		
		WebElement environmentText = driver.findElement(By.linkText("TEST ENVIRONMENT"));
		String actualText = environmentText.getText();
		
		SoftAssert object = new SoftAssert();
		object.assertEquals(actualText, expectedText);
		System.out.println("This is soft assert after test!");
		
		hardWait(2000);
		tearDown();
		
		
}
}
