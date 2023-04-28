package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleFrames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.dream11.com/login");
		driver.switchTo().frame(0);
		driver.findElement(By.id("regEmail")).sendKeys("12345566778");
		driver.findElement(By.linkText("GET APP LINK")).click();
	}

}
