import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.Test;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class firsttest {
    @Test
    public void test() {
        Configuration.browser = "chrome";
        System.setProperty("webdriver.chrome.driver", "files/chromedriver.exe");
        Configuration.startMaximized = true;
        Selenide.open("https://on.ge/");
        $(".input").setValue("ქვიზები").sendKeys(Keys.ENTER);
        sleep(5000);

    }
}
