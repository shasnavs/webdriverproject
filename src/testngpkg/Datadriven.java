package testngpkg;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datadriven {
	
	ChromeDriver driver;
	@BeforeTest
	public void Setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	@Test
	public void signup() throws IOException
	{
		FileInputStream fi=new FileInputStream("C:\\Users\\HP\\Downloads\\Untitled spreadsheet.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet s=wb.getSheet("Sheet1");
		int rowcount= s.getLastRowNum();
		for(int i=1; i<=rowcount;i++)
		{
			String username=s.getRow(i).getCell(0).getStringCellValue();
			String password=s.getRow(i).getCell(1).getStringCellValue();
			System.out.println("username="+username+"/n"+"password="+password);
			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(username);
			driver.findElement(By.xpath("//*[@id=\"email\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(password);
			driver.findElement(By.xpath("//*[@type='submit']")).click();
		}
	}

}
