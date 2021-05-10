import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NotificationMessagesTest extends BaseTest {

    @Test
    public void clickTheButtonAndWaitTheNotificationMessage (){
        driver.get("http://the-internet.herokuapp.com/notification_message_rendered");
        WebElement button = driver.findElement(By.xpath("//a[@href='/notification_message']"));
        button.click();
        boolean notification = driver.findElement(By.xpath("//div[contains(text(),'Action successful')]")).isDisplayed();
        Assert.assertTrue(notification, "Action successful " +
                "Bug in code.Notification message:Action successful or Action unsuccessful " +
                "will be changed after reload of the page");
    }
}