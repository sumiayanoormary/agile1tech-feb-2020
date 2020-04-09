package seleniumTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownTest {

	public static void main(String[] args) throws InterruptedException {
      
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rznan\\Desktop\\Feb_WS\\libraries\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
	
		
		
		
		WebElement month = driver.findElement(By.name("birthday_month"));
		
		Select monthdd = new Select(month);
		
		monthdd.selectByVisibleText("Oct");
		
		
		
		WebElement day = driver.findElement(By.name("birthday_day"));
		
		Select daydd = new Select(day); 
		Thread.sleep(2000);
		daydd.selectByIndex(20);
		
	
		Thread.sleep(2000);
		driver.quit();

	}

}
