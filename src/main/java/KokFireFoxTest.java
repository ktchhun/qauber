import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KokFireFoxTest {

	public static void main(String[] args) throws Exception
	{
		
//		System.setProperty("webdriver.gecko.driver", "/Users/kokchhun/Documents/MyProject/geckodriver");
		WebDriver driver = new FirefoxDriver();

		driver.get("http://testwave.qabidder.net/#/page/register-sa");
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		String webTitle = driver.getTitle();
		System.out.println(webTitle);
		
		String webURL = driver.getCurrentUrl();
		System.out.println(webURL);

		WebElement nameTextBox = driver.findElement(By.xpath("html/body/div[2]/div/div/div[1]/div/div[2]/form/div[1]/input"));
		nameTextBox.sendKeys("John Doe");
		
		
		WebElement emailTextBox = driver.findElement(By.xpath("html/body/div[2]/div/div/div[1]/div/div[2]/form/div[2]/input"));
		emailTextBox.sendKeys("JohnDoe1594@mailinator.com");

		WebElement passwdTextBox = driver.findElement(By.xpath(".//*[@id='id-password']"));
		passwdTextBox.sendKeys("123456abc");

		WebElement retypepwTextBox = driver.findElement(By.xpath("html/body/div[2]/div/div/div[1]/div/div[2]/form/div[4]/input"));
		retypepwTextBox.sendKeys("123456abc");

		Thread.sleep(5000);
	
		WebElement submitButton = driver.findElement(By.xpath("html/body/div[2]/div/div/div[1]/div/div[2]/form/button"));
		submitButton.click();

		Thread.sleep(5000);
		
		driver.quit();
	}

}
