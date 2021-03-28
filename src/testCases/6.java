package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class uwinTest3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajtor\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.uwindsor.ca/");
		driver.manage().window().maximize();
		driver.findElement(By.className("search-button")).click();
		driver.findElement(By.id("edit-search-keys")).sendKeys("uwinsite");
		driver.findElement(By.id("edit-submit")).click();
		driver.findElement(By.linkText("UWinsite Student | Office of the Registrar")).click();

		String currentUrl = driver.getCurrentUrl(); //Will get the current URL of the web page
		String expectedUrl = "https://www.uwindsor.ca/uwin_search/uwinsite"; //The expected URL of the page
		if(currentUrl.equalsIgnoreCase(expectedUrl))//checks if the page URL is equal to the expected page URL
		{
			System.out.println("Test Successful"); //If equal test was successful
		}
		else
		{
			System.out.println("Test Unsuccessful"); //If not equal test unsuccessful 
		}
	}
	

}
