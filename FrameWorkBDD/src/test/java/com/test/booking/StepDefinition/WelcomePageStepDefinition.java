package com.test.booking.StepDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WelcomePageStepDefinition {
	
	WebDriver driver;

	@Given("User is in welcome page of Booking com")
	public void user_is_in_welcome_page_of_booking_com() {
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.booking.com");
		driver.manage().window().maximize();
	}

	@When("user searches for a destination")
	public void user_searches_for_a_destination() {
		driver.findElement(By.id("ss")).sendKeys("Bang");
	}

	@Then("relevant destinations should be suggested")
	public void relevant_destinations_should_be_suggested() {
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
