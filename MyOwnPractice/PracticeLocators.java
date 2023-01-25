import java.util.concurrent.TimeUnit;

import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeLocators {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("http://tek-school.com/retail/");
		WebElement text = driver.findElement(By.xpath("//a[text()='TEST ENVIRONMENT']"));
		System.out.println(text.getText());
		Assert.assertEquals(text.getText(), "TEST ENVIRONMENT");
		
		driver.close();
		
	}

}
