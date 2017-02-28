import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KokTestingInChrome {
	
	public static void main(String[] args) throws Exception
	{
		ChromeDriver chrome = new ChromeDriver();
		chrome.get("http://testwave.qabidder.net/#/page/register-sa");

//		Submit button does not work when using "implicitlyWait" using "Thread.sleep" with minimum of 5 second does work
//		chrome.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		Thread.sleep(5000);

		WebElement nameTextBox = chrome.findElement(By.xpath("html/body/div[2]/div/div/div[1]/div/div[2]/form/div[1]/input"));
		nameTextBox.sendKeys("John Doe");
		
		WebElement emailTextBox = chrome.findElement(By.xpath("html/body/div[2]/div/div/div[1]/div/div[2]/form/div[2]/input"));
		emailTextBox.sendKeys("JohnDoe10@mailinator.com");

		WebElement passwdTextBox = chrome.findElement(By.xpath(".//*[@id='id-password']"));
		passwdTextBox.sendKeys("123456abc");

		WebElement retypepwTextBox = chrome.findElement(By.xpath("html/body/div[2]/div/div/div[1]/div/div[2]/form/div[4]/input"));
		retypepwTextBox.sendKeys("123456abc");

		WebElement submitButton = chrome.findElement(By.xpath("html/body/div[2]/div/div/div[1]/div/div[2]/form/button"));
		submitButton.click();

		Thread.sleep(5000);
		
		chrome.quit();

	}
	
}