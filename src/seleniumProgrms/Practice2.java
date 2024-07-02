package seleniumProgrms;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 {
	

	public static void main(String[] args)throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		Thread.sleep(3000);
		driver.findElement(By.id("femalerb")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("englishchbx")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("latinchbx")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("registerbtn")).click();
		System.out.println(driver.findElement(By.id("msg")).getText());
		
		driver.findElement(By.linkText("Click here to navigate to the home page")).click();
	}

}
