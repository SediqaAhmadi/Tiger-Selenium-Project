package afterClasspracticeInterviewPreparation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilities.Utils;

public class practice2 extends Utils {
	public static void main(String[] args) {
		

	getBrowser("chrome", "http://tek-school.com/retail/");
	//WebElement desktopLink =
	WebElement showAllItmes = driver.findElement(By.xpath("//a[text()='Show All Desktops']"));
	driver.findElement(By.xpath("//a[text()='Show All Desktops']")).click();
	

	}

		
	}
	

 