package testCases;
//Description: This code will go to uwindsor.ca and search in the search field for uwinsite. It will find and click the UWinsite Student | Office of the Registrar link. 
//It will then find the Sign in to uwinsite button and click it. It will verify the expected title of the log in page with the actual title.

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class uwinTest4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajtor\\Downloads\\chromedriver_win32\\chromedriver.exe"); //Path where chrome web driver is located
		WebDriver driver = new ChromeDriver(); //Creating a new web driver
		driver.get("http://www.uwindsor.ca/"); //Tells driver to go to uwindsor.ca
		driver.manage().window().maximize(); //Maximizes the window
		driver.findElement(By.className("search-button")).click(); //Finds the search button by its class name and clicks it.
		driver.findElement(By.id("edit-search-keys")).sendKeys("uwinsite"); //Inputs uwinsite into the search field by locating it from its id
		driver.findElement(By.id("edit-submit")).click(); //Finds the submit button by its id and clicks it to search.
		driver.findElement(By.linkText("UWinsite Student | Office of the Registrar")).click(); //Finds and clicks the UWinsite Student | Office of the Registrar by link text.
