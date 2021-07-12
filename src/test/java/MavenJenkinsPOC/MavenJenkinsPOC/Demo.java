package MavenJenkinsPOC.MavenJenkinsPOC;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Demo {
static WebDriver driver = null;
	
	@Test
	public static void main() throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:/Eclipse_Oxy/Drivers/chromedriver_win32/chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
//		driver.get("https://www.makemytrip.com/");
//		driver.findElement(By.xpath("//label[@for='fromCity']")).click();
//
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text' and @placeholder='From']"))).sendKeys("Kolkata");
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Kolkata')]"))).click();
		try {
			System.out.println("The platform name is: " + System.getProperty("platformName"));
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("Failureeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
		}
		
	}
}
