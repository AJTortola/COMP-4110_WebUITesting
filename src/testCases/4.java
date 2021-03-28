package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class uwinTest1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajtor\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.uwindsor.ca/");
		driver.manage().window().maximize();
		driver.findElement(By.className("search-button")).click();
		driver.findElement(By.id("edit-search-keys")).sendKeys("uwinsite");
		driver.findElement(By.id("edit-submit")).click();
		
		String currentPage = driver.getTitle(); //Will get the title of the current page it is on
		String expectedTitle = "UWindsor Search | University of Windsor"; //The expected title of the page
		if(currentPage.equalsIgnoreCase(expectedTitle))//checks if the page title is equal to the expected page title
		{
			System.out.println("Test Successful"); //If equal test was successful
		}
		else
		{
			System.out.println("Test Unsuccessful"); //If not equal test unsuccessful 
		}
	}

}
