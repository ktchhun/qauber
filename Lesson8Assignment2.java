import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lesson8Assignment2 {

	public static void main(String[] args) throws Exception {
//		System.setProperty("webdriver.chrome.driver", "/Users/ydande/Downloads/chromedriver");
		
		ChromeDriver driver = new ChromeDriver();
		Navigation navigate = driver.navigate();
				
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		
		driver.get("http://testwave.qabidder.net/#/page/login");
		
		WebElement emailTextBox = driver.findElement(By.xpath(".//*[@id='exampleInputEmail1']"));
		emailTextBox.sendKeys("acctest@mailinator.com");
		
		WebElement passTextBox = driver.findElement(By.xpath(".//*[@id='exampleInputPassword1']"));
		passTextBox.sendKeys("123456");
		
		Thread.sleep(5000);
		
		WebElement loginButton = driver.findElement(By.xpath("html/body/div[2]/div/div/div[1]/div[2]/form/button"));
		loginButton.click();
		
//		Included "Thread.sleep" to see navigation
		
		Thread.sleep(5000);

		navigate.back();
		Thread.sleep(5000);

		navigate.forward();
		Thread.sleep(2000);

		navigate.refresh();
		
		Thread.sleep(5000);
		
		driver.close();
		driver.quit();
		
		

	}

}
