package seleniumProgrms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Basic_sele1 {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("chinnari@123gmail.com");		driver.findElement(By.name("pass")).sendKeys("chinnaVas@");
//		driver.findElement(By.name("login")).click();
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("firstname")).sendKeys("chinnaNaidu");
     driver.findElement(By.name("lastname")).sendKeys("paam");
     driver.findElement(By.name("reg_email__")).sendKeys("8712273359");
     driver.findElement(By.name("reg_passwd__")).sendKeys("pasam@1234");
     driver.findElement(By.xpath("//select[@name='birthday_day']")).sendKeys("10");
     driver.findElement(By.xpath("//select[@name='birthday_month']")).sendKeys("Aug");
     driver.findElement(By.name("birthday_year")).sendKeys("1999");
     driver.findElement(By.name("sex")).click();
     driver.findElement(By.linkText("websubmit")).click();
     
	}

}
