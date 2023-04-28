package PopUp;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) {
		
		LocalDateTime ldt = LocalDateTime.now().plusMonths(7);
		String month = ldt.getMonth().toString();
		month=""+month.charAt(0)+month.substring(1, month.length()).toLowerCase();
		int year = ldt.getYear();
		int day = ldt.getDayOfMonth();
		System.out.println(ldt);
		
		
		System.out.println(month);
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("https://www.makemytrip.com/");
		
		driver.findElement(By.xpath("//span[@class=\"ic_circularclose_grey\"]")).click();
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		for(;;) {
			try {
				driver.findElement(By.xpath("//div[text()='"+month+" "+year+"']/../..//p[text()='"+ day +"']")).click();
				break;
			}catch(Exception e) {
				driver.findElement(By.xpath("//span[@aria-label=\"Next Month\"]")).click();
			}
		}

	}

}
