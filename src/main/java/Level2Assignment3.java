import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Level2Assignment3 {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("file:///Users/kokchhun/Desktop/Test.html");
		
		driver.findElement(By.linkText("Second Link")).click();
		
		String url = driver.getCurrentUrl();
		boolean compare = url.toLowerCase().contains("google");
		
		if (compare == true)
		{
			System.out.println("PASSED");
		}
		else
		{
			System.out.println("FAILED");
		}		
		driver.quit();
	}

}
