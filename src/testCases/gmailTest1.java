package testCases;
//Description: This tests gmail.com sign in page

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class gmailTest1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajtor\\Downloads\\chromedriver_win32\\chromedriver.exe"); //Path where chrome web driver is located
		WebDriver driver = new ChromeDriver(); //Creating a new web driver
		driver.get("http://www.gmail.com/"); //Tells driver to go to gmail.com
		driver.manage().window().maximize(); //Maximizes the window
		
		WebDriverWait wait = new WebDriverWait(driver, 5); //Waits for the visibility of the Sign in to gmail button using its xpath. This is so it has enough time to load in and become clickable.
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='identifierId']"))); //Waits for the visibility of the email field using its xpath. This is so it has enough time to load in and become clickable.
		driver.findElement(By.id("identifierId")).sendKeys("email"); //Finds the email field by its id and enters the users email.
		driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click(); //Finds the next button by its id and clicks it.
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='whsOnd zHQkBf']"))); //Waits for the visibility of the password field using its xpath. This is so it has enough time to load in and become clickable.
		driver.findElement(By.className("whsOnd zHQkBf")).sendKeys("password"); //Finds the password field by its id and enters the users password.
		driver.findElement(By.xpath("(//div[@class='VfPpkd-RLmnJb'])[1]")).click(); //Finds the next button by its id and clicks it.
		
	}

}
