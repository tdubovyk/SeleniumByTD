// Generated by Selenium IDE
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import java.util.*;
public class Test1Test {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void test1() {
    // Test name: Test1
    // Step # | name | target | value
    // 1 | open | / | 
    driver.get("https://www.google.com.ua/");
    // 2 | setWindowSize | 1000x600 | 
    // driver.manage().window().setSize(new Dimension(1000, 600));
    // 3 | type | name=q | qa course
    driver.findElement(By.name("q")).sendKeys("qa course");
    // 4 | sendKeys | name=q | ${KEY_ENTER}
    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    // 5 | assertText | css=.g:nth-child(2) .LC20lb | изучайте Quality Assurance онлайн | Coursera
    assertThat(driver.findElement(By.xpath("/html/body/div[7]/div/div[10]/div[1]/div[2]/div[2]/div/div/div[6]/div/div[1]/div/a/h3")).getText(), is("Top Quality Assurance Courses - Coursera"));
  }
}
