package seleniumProgrms;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice4 {

	public static void main(String[] args)throws Exception{
	
			
				
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.google.com/");
				Thread.sleep(3000);
				driver.findElement(By.name("q")).sendKeys("chinnari");
				driver.findElement(By.name("q")).submit();
				Thread.sleep(2000);
				driver.navigate().to("https://www.facebook.com/");
				driver.findElement(By.id("email")).sendKeys("test123@gmail.com");
				driver.findElement(By.id("pass")).sendKeys("1234567890");
				Thread.sleep(3000);
				driver.navigate().refresh();
				Thread.sleep(2000);
				driver.navigate().back();
				Thread.sleep(2000);
				driver.navigate().forward();
				Thread.sleep(2000);
				driver.close();
				}

}
