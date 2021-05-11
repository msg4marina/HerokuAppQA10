import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class FramesTest extends BaseTest {
    @Test
    public void frames() {
        driver.get("http://the-internet.herokuapp.com/frames");
        driver.findElement(By.xpath("//a[@href='/iframe']")).click();
        WebDriverWait wait = (WebDriverWait) new WebDriverWait(driver, 10);
        boolean content = driver.findElement(By.xpath("//*[text()='Your content goes here.']")).isDisplayed();
        assertEquals(false, content, "isDisplayed");
    }
}