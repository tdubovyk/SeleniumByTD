import com.codeborne.selenide.Condition;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestUsingSelenide {
    @Test
    public void GoogleSearchTest() {

        open("http://google.com");
        $(By.name("q")).setValue("qa course").pressEnter();
        $(By.xpath("/html/body/div[7]/div/div[10]/div[1]/div[2]/div[2]/div/div/div[6]/div/div[1]/div/a/h3"))
                .shouldHave(Condition.text("Top Quality Assurance Courses - Coursera"));
    }
}