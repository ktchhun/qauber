import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookPosting {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.facebook.com");
		
		WebElement emailField = driver.findElement(By.id("email"));
		emailField.sendKeys("ktchhun@hotmail.com");
		
		WebElement passwordField = driver.findElement(By.id("pass"));
		passwordField.sendKeys("qatester");
		
		Thread.sleep(2000);
		
		WebElement logInButton = driver.findElement(By.id("loginbutton"));
		logInButton.click();
		
		Thread.sleep(2000);
		
		WebElement postOnWall = driver.findElement(By.xpath("//html/body/div/div[2]/div[1]/div/div[2]/div[2]/div[2]/div/div[3]/div/div/div[2]/div/div/div/form/div[1]/div/div[2]/textarea"));
		postOnWall.sendKeys("Posting Automated Message Using Selenium WebDriver");
		
		WebElement postButton = driver.findElement(By.xpath("//button[contains(.,'Post')]"));
		postButton.click();
		System.out.println("Complete");
		driver.close();
		driver.quit();
	}
}
