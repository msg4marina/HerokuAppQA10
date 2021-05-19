import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import java.util.HashMap;

public class FileDownloadTest extends BaseTest {
    @Test
    public void fileDownload() {
        HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
        chromePrefs.put("profile.default_content_settings.popups", 0);
        chromePrefs.put("download.default_directory", System.getProperty("user.dir"));

        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", chromePrefs);
        WebDriver driver = new ChromeDriver(options);

        driver.get("http://the-internet.herokuapp.com/download");
        driver.findElement(By.xpath("//a[@href='download/7.pdf']")).click();

        //??? HOW TO CHECK THE DOWNLOADED FILE IN SYSTEM
    }
}
