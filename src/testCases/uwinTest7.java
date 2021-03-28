package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class uwinTest7 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajtor\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.uwindsor.ca/");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='col-md-12'])[2]")));
		WebElement opentabs=driver.findElement(By.xpath("(//div[@class='col-md-12'])[2]"));
				
		for(int i=0;i<opentabs.findElements(By.tagName("a")).size();i++)
		{
			String opentabsagain=Keys.chord(Keys.CONTROL,Keys.ENTER);
			opentabs.findElements(By.tagName("a")).get(i).sendKeys(opentabsagain);
		}
		
		int currentPage = opentabs.findElements(By.tagName("a")).size(); //Will get the number of links on the page
		int expectedTitle = 9; //The expected number of links on the page
		if(currentPage == expectedTitle)//checks if the number of links on the page is equal to the expected number of links
		{
			System.out.println("Test Successful! Number of links in footer: " + opentabs.findElements(By.tagName("a")).size()); //If equal test was successful
		}
		else
		{
			System.out.println("Test Unsuccessful! Actual number of links on this page: " + opentabs.findElements(By.tagName("a")).size()); //If not equal test unsuccessful 
		}
	}

}
