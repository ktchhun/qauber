import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmailYagna {

	public static void main(String[] args) throws Exception {

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.gmail.com");
		
		WebElement emailTextBox = driver.findElement(By.id("Email"));
		emailTextBox.sendKeys("UserName");
		
		WebElement nextButton = driver.findElement(By.id("next"));
		nextButton.click();
		
		Thread.sleep(3000);
		
		WebElement passTextBox = driver.findElement(By.xpath(".//*[@id='Passwd']"));
		passTextBox.sendKeys("PassWord");

		WebElement signIn = driver.findElement(By.id("signIn"));
		signIn.click();
		
		WebElement composeButton = driver.findElement(By.xpath(".//*[@id=':wq']/div/div"));
		composeButton.click();
		
		WebElement toTextBox = driver.findElement(By.xpath(".//*[@id=':12o']"));
		toTextBox.sendKeys(" yagna.bitspilani@gmail.com");
		
		WebElement subjectTextBox = driver.findElement(By.id(":128"));
		subjectTextBox.sendKeys("This is automated mail by Kok");
		
		WebElement bodyTextBox = driver.findElement(By.id(":13a"));
		bodyTextBox.sendKeys("Hello Yagna,");
		
		WebElement sendButton = driver.findElement(By.id(":11y"));
		sendButton.click();
		
		driver.close();
		driver.quit();
		
	}

}
