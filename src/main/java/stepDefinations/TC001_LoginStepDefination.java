package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC001_LoginStepDefination {
	WebDriver driver;
	@Given("user is on home page")
	public void user_is_on_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Launch Rediff");
		System.setProperty("webdriver.chrome.driver", "G:\\Sel_New\\Sel@6.30PM(EST)\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
	}
	
	@When("user clicks on Signin check title")
	public void user_clicks_on_signin_check_title() {
	   System.out.println("Check title");
	   driver.findElement(By.linkText("Sign in")).click();
		String title=driver.getTitle();
		System.out.println("Title="+title);
		Assert.assertEquals(title, "Rediffmail");
		System.out.println("Title matched...");
	}
	@When("user enters valid user name and password and clicks on Submit")
	public void user_enters_valid_user_name_and_password_and_clicks_on_submit() {
	    System.out.println("Enter user name and Password");
	    driver.findElement(By.id("login1")).sendKeys("m.arpana1234");
		driver.findElement(By.id("password")).sendKeys("arpana123");
		driver.findElement(By.id("remember")).click();
		driver.findElement(By.name("proceed")).click();
	}
	@Then("check user name is displayed")
	public void check_user_name_is_displayed() {
	    System.out.println("Check user is valid and display message as Successful");
	}
	@Then("Logout")
	public void logout() throws InterruptedException {
		Thread.sleep(10000);
	   System.out.println("Logout..."); 
	   driver.findElement(By.linkText("Logout")).click();
	}
	@When("user enters invalid user name or invalid password and clicks on Submit")
	public void user_enters_invalid_user_name_or_invalid_password_and_clicks_on_submit() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Enter invalid user namd or password");
	}
	@Then("Close the browser")
	public void close_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		System.out.println("close browser..");
		driver.quit();
	}




}
