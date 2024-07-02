package seleniumProgrms;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Practice_alerts {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
//		driver.findElement(By.id("alertBox")).click();
//		Thread.sleep(3000);
//		System.out.println(driver.switchTo().alert().getText());
//		Thread.sleep(1000);
//		driver.switchTo().alert().accept();
//		Thread.sleep(1000);
//		System.out.println(driver.findElement(By.id("output")).getText());
		//confirm Box
//		System.out.println(driver.findElement(By.id("output")).getText());
//		driver.findElement(By.id("confirmBox")).click();
//		Thread.sleep(3000);
//		System.out.println(driver.switchTo().alert().getText());
//		Thread.sleep(1000);
//		driver.switchTo().alert().accept();
//		Thread.sleep(1000);
//		System.out.println(driver.findElement(By.id("output")).getText());
//		driver.findElement(By.id("confirmBox")).click();
//		Thread.sleep(1000);
//		driver.switchTo().alert().dismiss();
//		Thread.sleep(1000);
//		System.out.println(driver.findElement(By.id("output")).getText());
//		
		//Prompt box
		
//		
		  driver.findElement(By.id("promptBox")).click();
		  System.out.println(driver.switchTo().alert().getText());
		 
		  
		 
		  driver.switchTo().alert().sendKeys("chinna");
		  Thread.sleep(1000);
		  driver.switchTo().alert().accept();
		  System.out.println(driver.findElement(By.id("output")).getText());
		  List<WebElement> headerLinks=driver.findElements(By.className("static_page"));
		  
		 System.out.println("no of hearders"+headerLinks.size());
}}
