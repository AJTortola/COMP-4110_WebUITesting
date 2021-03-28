package testCases;
//Description: This code will go to uwindsor.ca and search in the search field for uwinsite. It will find and click the UWinsite Student | Office of the Registrar link. 
//It will then find the Sign in to uwinsite button and click it. Then it will enter the username and password in the corresponding fields. Purposely getting a password error will find password reset and click it.


import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class uwinTest5 {

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
		
		
		
		WebDriverWait wait = new WebDriverWait(driver, 5); //Waits for the visibility of the Sign in to Uwinsite button using its xpath. This is so it has enough time to load in and become clickable.
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='hybrid-button login-uwinsite']")));
		driver.findElement(By.xpath("//div[@class='hybrid-button login-uwinsite']")).click(); //Finds and clicks the uwinsite log in button by its xpath
