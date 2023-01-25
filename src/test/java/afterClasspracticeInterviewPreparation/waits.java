package afterClasspracticeInterviewPreparation;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.chainsaw.Main;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.webdriver.WebDriverBrowser;
import utilities.Utils;

public class waits extends Utils {
	
	public static void main(String[] args) {
		getBrowser("chrome", "http://tek-school.com/retail/");
		//WebElement text = 
		driver.findElement(By.xpath("//a[text()='Desktops']")).click();
		driver.findElement(By.xpath("//a[text()='Show All Desktops']")).click();
		
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		try {
			Thread.sleep(1000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(30,TimeUnit.SECONDS)
				.pollingEvery(2,TimeUnit.SECONDS)
				.withMessage("The element did not show withinthe expected time!");
		//wait.until(ExpectedConditions.visibilityOf(text));
		
		//System.out.println("This is the UI text:" + text.getText());
		hardWait(2000);
		tearDown();
			
	}

}
