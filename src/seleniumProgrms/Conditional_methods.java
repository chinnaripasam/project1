package seleniumProgrms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conditional_methods {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.nopcommerce.com/en");
		driver.manage().window().maximize()	;
		//WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce']"));
		boolean logo=driver.findElement(By.xpath("//img[@alt='nopCommerce']")).isDisplayed();
		System.out.println(logo);
		Thread.sleep(3000);
		//isEnabled
		driver.get("https://www.google.com/");
		boolean search=driver.findElement(By.name("q")).isEnabled();
		System.out.println(search);
		//isSelected
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		WebElement selet=driver.findElement(By.xpath("//input[@id('gender-male']"));
				selet.click();
		
		System.out.println(selet.isSelected());
		
		
	}
	

}
