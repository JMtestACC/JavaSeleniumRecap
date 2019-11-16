package phantomjs;

import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class PhantomJSTest {
    public static void main(String[] args) {

        System.setProperty("phantomjs.binary.path", "C:\\Users\\JanAs\\IdeaProjects\\JavaSeleniumRecap\\lib\\phantomjs\\phantomjs.exe");

        PhantomJSDriver driver = new PhantomJSDriver();

        driver.get("https://www.seleniumhq.org/");
        System.out.println("Title is: " + driver.getTitle());
        driver.quit();

    }
}
