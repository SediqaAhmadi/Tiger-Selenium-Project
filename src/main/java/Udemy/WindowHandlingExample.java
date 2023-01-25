package Udemy;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.Utils;

public class WindowHandlingExample extends Utils{
	
	
	private static String parentWindow;


	public static void main(String[] args) {
		getBrowser("chrome", "http://tek-school.com/retail/");
		parentWindow = driver.getWindowHandle();
		WebElement text1 = driver.findElement(By.linkText("TEST ENVIRONMENT"));
	    System.out.println(text1.getText());
	    WebElement desktop = driver.findElement(By.xpath("//a[text() = Destops']"));
	    Actions action = new Actions (driver);
	    
		action.moveToElement(desktop).perform();
	    WebElement allDesktopsItems = driver.findElement(By.linkText("Show All Desktops"));
	    action.keyDown(Keys.CONTROL).click(allDesktopsItems).keyUp(Keys.CONTROL)
	    .build().perform();
	    
		//child window
	    switchToWindow();
	    WebElement searchField = driver.findElement(By.xpath("//input[@name='search']"));
	    searchField.sendKeys("iphone");
	    WebElement searchBttn = driver.findElement(By.xpath("//span[@class='input-group-btn']//button"));
	    searchBttn.click();
	    
	    hardWait(6000);
	    driver.close();
	    
	 // parent window actions
        hardWait(7000);
        driver.switchTo().window(parentWindow);
        WebElement searchMonitors = driver.findElement(By.xpath("//input[@name='search']"));
        searchMonitors.sendKeys("Monitors");
        WebElement searchBttn2 = driver.findElement(By.xpath("//span[@class='input-group-btn']//button"));
        searchBttn2.click();
        
        hardWait(6000);
        tearDown();
        
	}
	
	
    public static void switchToNewWindow() {
        Set <String> allWindows = driver.getWindowHandles();
        Iterator<String> i = allWindows.iterator();
        while(i.hasNext()) {
            String childWindow = i.next();
            if(!parentWindow.equals(childWindow)) {
                driver.switchTo().window(childWindow);
				
			}
			
		}
	}
}


