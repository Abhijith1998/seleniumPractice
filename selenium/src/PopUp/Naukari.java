package PopUp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukari {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
//		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

//		driver.get("https://www.naukri.com/registration/createAccount?");
//		driver.findElement(By.id("resumeUpload")).sendKeys("C:/Users/abhis/Downloads/ExecutionReport_EXEC1036.pdf");
//		driver.get("https://www.levi.in/sale-1");
//		Thread.sleep(20000);
//		JavascriptExecutor js=(JavascriptExecutor) driver;
//		WebElement addToBag = driver.findElement(By.id("quickviewbutton"));
//		js.executeScript("arguments[0].click()", addToBag);
		FileInputStream fis=new FileInputStream("./testData/Book1.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet("Sheet1");
		int rowNum = sheet.getPhysicalNumberOfRows();
		int colNum = sheet.getRow(0).getPhysicalNumberOfCells();
		
		String[][] data=new String[rowNum-1][colNum];
		for(int i=0;i<rowNum-1;i++) {
			for(int j=0;j<colNum;j++) {
				data[i][j]=sheet.getRow(i+1).getCell(j).toString();
				System.out.println(data[i][j]);
			}
			
		}
		
		
	}
}