package stepDefinations;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Vindeep {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ArrayList<String> exp_data=new ArrayList<String>();
		exp_data.add("Days");
		exp_data.add("Months");
		exp_data.add("Years");
		System.setProperty("webdriver.chrome.driver", "G:\\Sel_New\\Sel@6.30PM(EST)\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://vindeep.com/Calculators/FDCalc.aspx");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println("Title="+title);
		driver.findElement(By.id("ContentPlaceHolder1_cphCentre_FDAmount")).clear();
		driver.findElement(By.id("ContentPlaceHolder1_cphCentre_FDAmount")).sendKeys("200000");
		driver.findElement(By.id("ContentPlaceHolder1_cphCentre_Period")).clear();
		driver.findElement(By.id("ContentPlaceHolder1_cphCentre_Period")).sendKeys("70");
		//Select item from a listbox--FD Period
		WebElement ele=driver.findElement(By.id("ContentPlaceHolder1_cphCentre_PeriodDropDown"));
		Select focus_Opts=new Select(ele);
		focus_Opts.selectByVisibleText("Days");
		//count number of items in a list box
		List<WebElement> allItems=focus_Opts.getOptions();
		System.out.println("total items="+allItems.size());
		//display items
		for(int i=0;i<allItems.size();i++)
		{
			//actual data
			System.out.println(allItems.get(i).getText());
			if(exp_data.get(i).equals(allItems.get(i).getText()))
			{
				System.out.println("Item Matched...");
			}
			else
			{
				System.out.println("Item not matched...");
			}
		}
		driver.findElement(By.id("ContentPlaceHolder1_cphCentre_InterestRate")).clear();
		driver.findElement(By.id("ContentPlaceHolder1_cphCentre_InterestRate")).sendKeys("5.40");
		//select item from a listbox--Interest Compound Frequency
		driver.findElement(By.name("ctl00$ContentPlaceHolder1$cphCentre$btnFDMAmount")).click();
		Select focus_opts1=new Select(driver.findElement(By.id("ContentPlaceHolder1_cphCentre_FrequencyDropDown")));
		focus_opts1.selectByValue("Half Yearly");
		
		//time
		Thread.sleep(5000);
		String FD_Amount=driver.findElement(By.id("ContentPlaceHolder1_cphCentre_MaturityAmountTextBox")).getAttribute("value");
		System.out.println("FD Amount="+FD_Amount);
		//driver.quit();
	}

}
