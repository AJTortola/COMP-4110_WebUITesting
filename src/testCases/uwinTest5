package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class uwinTest5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajtor\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://student.uwindsor.ca/");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='i0116']")));
		driver.findElement(By.id("i0116")).sendKeys("email");//This will input your email in the email field. Note email not in code for confidentiality.
		driver.findElement(By.id("idSIButton9")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='i0118']")));
		driver.findElement(By.id("i0118")).sendKeys("password");//This will input your password in the password field. Notr password not in code for confidentiality. 
		driver.findElement(By.id("idSIButton9")).click();
		
	}

}
