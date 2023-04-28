package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToOpenEmptyBrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String signupPage = driver.getTitle();
		System.out.println(signupPage);
		String windowId = driver.getWindowHandle();
		System.out.println(windowId);
		driver.close();
		System.out.println(driver.getWindowHandle());
		driver.navigate().refresh();
		Thread.sleep(3000);
		System.out.println(driver.getWindowHandle());
		driver.quit();
		WebElement list = driver.findElement(By.id("cars"));
		Select select=new Select(list);
		
	}
}