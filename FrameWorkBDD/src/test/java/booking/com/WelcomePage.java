package booking.com;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WelcomePage {
	
	public static void main(String args[]) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.booking.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("ss")).sendKeys("Bang");
		List<WebElement> SugDest = driver.findElements(By.xpath("//ul[@aria-label='List of suggested destinations ']/li/span[2]//span[@class='search_hl_name']"));
		System.out.println(SugDest);
		for(WebElement ele : SugDest)
		{
			System.out.println(ele.getText());
			if(ele.getText().equals("Bangalore"))
			{
				ele.click();
			}
	}
	}
}
