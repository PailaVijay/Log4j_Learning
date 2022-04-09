package project1;

import org.apache.logging.log4j.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {
private static 	 Logger log= LogManager.getLogger(Amazon.class.getName());

	public static void main(String[] args) {
		// TODO Auto-generated method stub

log.debug("setting chrome driver property");
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijay\\Downloads\\chromedriver_win32 (1)//chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
log.info("window maximized");
log.debug("now click on amazon server");
driver.get("https://jqueryui.com/draggable/");
log.debug("count the frame present in the home page");

System.out.println( driver.findElements(By.tagName("iframe")).size());

try
{
	driver.switchTo().frame(0);
	log.info("successfully jump into frame");
}

catch(Exception e)
{
	log.error("cannot identify te frame");
}







	}

}
