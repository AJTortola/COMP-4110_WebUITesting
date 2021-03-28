package testCases;
//Description: This code will go to uwindsor.ca click on the menu tab and open all of the Quick Links in new tabs. It will verify the expected number of links with the actual number of links.


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class uwinTest1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajtor\\Downloads\\chromedriver_win32\\chromedriver.exe"); //Path where chrome web driver is located
		WebDriver driver = new ChromeDriver(); //Creating a new web driver
		driver.get("http://www.uwindsor.ca/"); //Tells driver to go to uwindsor.ca
		driver.manage().window().maximize(); //Maximizes the window
		WebDriverWait wait = new WebDriverWait(driver, 5); //Create wait to make the driver wait for 5 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='menu-button']"))); //Waits for the visability of the menu button using its xpath. This is so it has enough time to load in and become clickable.
		driver.findElement(By.id("menu-button")).click(); //Find the menu button by its id and click
		WebElement opentabs=driver.findElement(By.xpath("(//div[@class='col-md-3'])[1]")); //Create WebElement opentabs which equals the xpath for the Quicklinks in the menu section. The reason for the [1] in the xpath is because there are multiple sections with that xpath and we want the first one for quicklinks.
		
		for(int i=0;i<opentabs.findElements(By.tagName("a")).size();i++) //This for loop will open all of the links under quick links in new tabs
		{
			String opentabsagain=Keys.chord(Keys.CONTROL,Keys.ENTER);
			opentabs.findElements(By.tagName("a")).get(i).sendKeys(opentabsagain);
		}
		
		int currentLinks = opentabs.findElements(By.tagName("a")).size(); //Will get the number of links under the Quick Links section.
		int expectedLinks = 9; //The expected number of links on the page
		if(currentLinks == expectedLinks)//checks if the number of links on the page is equal to the expected number of links
		{
			System.out.println("Test Successful! Number of Quick Links in Menu: " + opentabs.findElements(By.tagName("a")).size()); //If equal test was successful
		}
		else
		{
			System.out.println("Test Unsuccessful! Actual number of links on this page: " + opentabs.findElements(By.tagName("a")).size()); //If not equal test unsuccessful 
		}
	}

}
