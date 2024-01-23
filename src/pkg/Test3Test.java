package pkg;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.JavascriptExecutor;
import java.util.*;
public class Test3Test {
  private WebDriver driver;
  JavascriptExecutor js;
  @BeforeTest
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    new HashMap<String, Object>();
  }
  @AfterMethod
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void test3() {
    driver.get("https://www.google.com/");
    driver.findElement(By.id("APjFqb")).sendKeys("books ");
    driver.findElement(By.name("btnK")).click();
  }
}
