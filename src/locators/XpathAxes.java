package locators;





import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;

public class XpathAxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://money.rediff.com/gainers");
		driver.manage().window().maximize();
		String text=driver.findElement(By.xpath("//a[contains(text(),'MTNL')]/self::a")).getText();
		System.out.println(text);
		String text1=driver.findElement(By.xpath("//a[contains(text(),'MTNL')]/parent::td")).getText();
		System.out.println(text1);
		//ancestor
		String text2=driver.findElement(By.xpath("//a[contains(text(),'MTNL')]/ancestor::tr")).getText();	
		System.out.println(text2);
		//descendant
		List<WebElement> texts=driver.findElements(By.xpath("//a[contains(text(),'MTNL')]/ancestor::tr/descendant::*"));	
		System.out.println(texts.size());	
		//child
		List<WebElement> t=driver.findElements(By.xpath("//a[contains(text(),'MTNL')]/ancestor::tr/child::td"));	
		System.out.println(t.size());
		driver.close();


	}
}



