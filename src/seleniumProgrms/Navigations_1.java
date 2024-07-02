package seleniumProgrms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations_1 {

	public static void main(String[] args)throws Exception {
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.google.co.in/");
	driver.manage().window().maximize()	;
	Thread.sleep(1000);
	driver.findElement(By.name("q")).sendKeys("chinna");
	Thread.sleep(1000);
	driver.navigate().refresh();
	driver.navigate().to("https://www.facebook.com/");
	Thread.sleep(1000);
	driver.navigate().back();
	Thread.sleep(1000);
	driver.navigate().forward();
	driver.close();
	Thread.sleep(3000);
	driver.quit();
	
	
	}

}
