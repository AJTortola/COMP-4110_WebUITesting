package testCases;
//Description: This code will go to uwindsor.ca and open all of the social media links located in the footer of the page in new tabs.  It will verify the expected number of links with the actual number of links.

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class uwinTest6 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajtor\\Downloads\\chromedriver_win32\\chromedriver.exe"); //Path where chrome web driver is located
		WebDriver driver = new ChromeDriver(); //Creating a new web driver
		driver.get("http://www.uwindsor.ca/"); //Tells driver to go to uwindsor.ca
		driver.manage().window().maximize(); //Maximizes the window
		WebElement opentabs=driver.findElement(By.xpath("//div[@class='container']")); //Create WebElement opentabs which equals the xpath for the Social Media Links. 
		
		
		for(int i=0;i<opentabs.findElements(By.tagName("a")).size();i++) //This for loop will open all of the links in the footer in new tabs
		{
			String opentabsagain=Keys.chord(Keys.CONTROL,Keys.ENTER);
			opentabs.findElements(By.tagName("a")).get(i).sendKeys(opentabsagain);
		}
		
		int currentPage = opentabs.findElements(By.tagName("a")).size(); //Will get the number of social media links on the page
		int expectedTitle = 6; //The expected number of links on the page
		if(currentPage == expectedTitle)//checks if the number of links on the page is equal to the expected number of links
		{
			System.out.println("Test Successful! Number of social media links: " + opentabs.findElements(By.tagName("a")).size()); //If equal test was successful
		}
		else
		{
			System.out.println("Test Unsuccessful! Actual number of links on this page: " + opentabs.findElements(By.tagName("a")).size()); //If not equal test unsuccessful 
		}
	}

}
