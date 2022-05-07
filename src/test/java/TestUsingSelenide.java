import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestUsingSelenide {
    @Test
    public void GoogleSearchTest() {

        open("http://google.com");
        $(By.name("q")).setValue("qa course").pressEnter();
    }
}
