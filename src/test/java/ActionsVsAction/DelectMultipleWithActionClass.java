package ActionsVsAction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import utilities.Utils;

public class DelectMultipleWithActionClass extends Utils {
	public static void main(String[] args) {
		
		getBrowser("Chrome", "https://jqueryui.com/selectable/");
		WebElement iframe = driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(iframe);
		
		hardWait(2000);
		
		WebElement itemA = driver.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement itemB = driver.findElement(By.xpath("//li[text()='Item 2']"));
		WebElement itemC = driver.findElement(By.xpath("//li[text()='Item 3']"));
		WebElement itemD = driver.findElement(By.xpath("//li[text()='Item 4']"));
		WebElement itemE = driver.findElement(By.xpath("//li[text()='Item 5']"));
		WebElement itemF = driver.findElement(By.xpath("//li[text()='Item 6']"));
		WebElement itemG = driver.findElement(By.xpath("//li[text()='Item 7']"));
		
		// actions is a class
		Actions actions = new Actions(driver);
		// this action is an interface
		//this is upcasting
		Action selectAble = actions.keyDown (Keys.CONTROL)
					.click(itemA)
					.click(itemB)
					.click(itemC)
					.click(itemD)
					.click(itemE)
					.click(itemF)
					.click(itemG)
					
					.keyUp(Keys.CONTROL)
					.build();
					selectAble.perform();
					
					hardWait(5000);
					tearDown();

		
	}

		
	}
