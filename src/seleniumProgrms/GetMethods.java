package seleniumProgrms;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		//get(url)
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize()	;
		Thread.sleep(2000);
		//getTitle
       System.out.println(driver.getTitle());
       //getcurrenturl
       System.out.println(driver.getCurrentUrl());
       //getpage source
       System.out.println(driver.getPageSource());
       //get windowHandle
       String windowid =driver.getWindowHandle();
       System.out.println(windowid);
       //get windowHandles
       driver.findElement(By.linkText("OrangeHRM, Inc")).click();
       Set<String> windowsid=driver.getWindowHandles();
       System.out.println(windowsid);
       
       Thread.sleep(3000);
       
       driver.close();
       driver.quit();
	}

}
