package MyOwnPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import utilities.Utils;

public class JsExample extends Utils {
	public static void main(String[] args) {
		
		getBrowser("chorme", "http://tek-school.com/retail/");
		
		WebElement sendText = driver.findElement(By.xpath("//input[@name='search']"));
		highlightelementRedBorder(sendText);
		hardWait(2000);
		sendKeys(sendText, "Monitor");
		
		
		WebElement searchBttn = driver.findElement(By.xpath("//span//button[@type='button']"));
		hardWait(2000);
		clickWithJSE(searchBttn);
		//scrolldownPage();
		scrolldownPage();
		hardWait(5000);
		
		tearDown();
		
	}
	
	public static void scrollDownPage() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("Window.scrollBy(0,500)");
		
	
	
	}

}
