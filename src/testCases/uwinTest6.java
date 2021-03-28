package testCases;
//Description: This code will go to uwindsor.ca and search in the search field for uwinsite. It will find and click the UWinsite Student | Office of the Registrar link and verify if the expected URL of the page match the actual URL of the page.


import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class uwinTest3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajtor\\Downloads\\chromedriver_win32\\chromedriver.exe"); //Path where chrome web driver is located
		WebDriver driver = new ChromeDriver(); //Creating a new web driver
		driver.get("http://www.uwindsor.ca/"); //Tells driver to go to uwindsor.ca
		driver.manage().window().maximize(); //Maximizes the window
		driver.findElement(By.className("search-button")).click(); //Finds the search button by its class name and clicks it.
		driver.findElement(By.id("edit-search-keys")).sendKeys("uwinsite"); //Inputs uwinsite into the search field by locating it from its id
		driver.findElement(By.id("edit-submit")).click(); //Finds the submit button by its id and clicks it to search.
		driver.findElement(By.linkText("UWinsite Student | Office of the Registrar")).click(); //Finds and clicks the UWinsite Student | Office of the Registrar by link text.

		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles()); //This will tell selenium to switch to tab 2 that it opened. This is done so that it can view the elements on the newly opened tab and find them.
		driver.switchTo().window(tabs2.get(1));
		
		String currentUrl = driver.getCurrentUrl(); //Will get the current URL of the web page
		String expectedUrl = "https://www.uwindsor.ca/registrar/uwinsite-student"; //The expected URL of the page
		if(currentUrl.equalsIgnoreCase(expectedUrl))//checks if the page URL is equal to the expected page URL
		{
			System.out.println("Test Successful! Current Page URL: " + currentUrl); //If equal test was successful
		}
		else
		{
			System.out.println("Test Unsuccessful"); //If not equal test unsuccessful 
		}
	}
	

}
