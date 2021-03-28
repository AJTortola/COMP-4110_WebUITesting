package testCases;
//Description: This code will go to uwindsor.ca and open all of the links in the footer in new tabs. It will verify the expected number of links with the actual number of links. 

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class uwinTest7 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajtor\\Downloads\\chromedriver_win32\\chromedriver.exe"); //Path where chrome web driver is located
		WebDriver driver = new ChromeDriver(); //Creating a new web driver
		driver.get("http://www.uwindsor.ca/"); //Tells driver to go to uwindsor.ca
		driver.manage().window().maximize(); //Maximizes the window
		WebDriverWait wait = new WebDriverWait(driver, 5); //Create wait to make the driver wait for 5 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='col-md-12'])[2]"))); //Waits for the visability of the Footer links using its xpath. This is so it has enough time to load in and become clickable.
		WebElement opentabs=driver.findElement(By.xpath("(//div[@class='col-md-12'])[2]")); //Create WebElement opentabs which equals the xpath for the Footer Links. The reason for the [2] in the xpath is because there are multiple sections with that xpath and we want the second one which includes the footer links.
				
		for(int i=0;i<opentabs.findElements(By.tagName("a")).size();i++)  //This for loop will open all of the links in the footer in new tabs
		{
			String opentabsagain=Keys.chord(Keys.CONTROL,Keys.ENTER);
			opentabs.findElements(By.tagName("a")).get(i).sendKeys(opentabsagain);
		}
		
		int currentPage = opentabs.findElements(By.tagName("a")).size(); //Will get the number of links in the footer
		int expectedLinks = 9; //The expected number of links in the footer
		if(currentPage == expectedLinks)//checks if the number of links on the page is equal to the expected number of links
		{
			System.out.println("Test Successful! Number of links in footer: " + opentabs.findElements(By.tagName("a")).size()); //If equal test was successful
		}
		else
		{
			System.out.println("Test Unsuccessful! Actual number of links on this page: " + opentabs.findElements(By.tagName("a")).size()); //If not equal test unsuccessful 
		}
	}

}
