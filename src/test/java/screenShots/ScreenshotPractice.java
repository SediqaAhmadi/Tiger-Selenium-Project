package screenShots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import utilities.Utils;

public class ScreenshotPractice extends Utils {


		public static void main(String[] args) {
		      getBrowser("chrome","http://tek-school.com/retail/");

		      String screenShots = "Tek- ScreenShot";

		      String path = ".\\screenShots\\";

		      File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		      try {
		          FileUtils.copyFile(file, new File(path + screenShots + ".png"));
		      } catch (IOException e) {

		          e.printStackTrace();
		          
		      }
		      hardWait(6000);
		      tearDown();
		      
		      
		}
	}


