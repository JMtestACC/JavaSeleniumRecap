package htmlunitdriver;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnitDriverTest {
    public static void main(String[] args) {

        HtmlUnitDriver driver = new HtmlUnitDriver(BrowserVersion.CHROME);
//        HtmlUnitDriver driver = new HtmlUnitDriver();

        driver.get("https://www.seleniumhq.org/");
        System.out.println("Title is: " + driver.getTitle());
        driver.quit();

    }

}
