import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 *
 * A simple junit test. Open and url with Firefox browser and get's site title.
 *
 * @author love.nyberg@lovemusic.se
 */
public class testDriver {

	@Test
	public void startSite() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		String url = "https://lovemusic.se";
		driver.get(url);
		String title = driver.getTitle();
		System.out.println("The title of " + url + " is: " + title);
		driver.quit();
	}
}
