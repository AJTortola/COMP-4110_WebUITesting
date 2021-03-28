package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class uwinTest2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajtor\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.uwindsor.ca/");
		driver.manage().window().maximize();
		driver.findElement(By.className("search-button")).click();
		driver.findElement(By.id("edit-search-keys")).sendKeys("uwinsite");
		driver.findElement(By.id("edit-submit")).click();
		
		int currentPage = driver.findElements(By.tagName("a")).size(); //Will get the number of links on the page
		int expectedTitle = 149; //The expected number of links on the page
		if(currentPage == expectedTitle)//checks if the number of links on the page is equal to the expected number of links
		{
			System.out.println("Test Successful! Number of links on this page: " + driver.findElements(By.tagName("a")).size()); //If equal test was successful
		}
		else
		{
			System.out.println("Test Unsuccessful! Actual number of links on this page: " + driver.findElements(By.tagName("a")).size()); //If not equal test unsuccessful 
		}
	}

}
