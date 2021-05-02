import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class NotificationMessagesTest extends BaseTest {

    @Test
    public void clickTheButtonAndWaitTheNotificationMessage (){
        driver.get("http://the-internet.herokuapp.com/notification_message_rendered");
        WebElement m1 = driver.findElement(By.xpath("//a[@href='/notification_message']"));
        m1.click();
        String notification = driver.findElement(By.xpath("(//div)[3]")).getText();
        assertEquals(notification, "Action successful",
              "Bug in code.Notification message:Action successful or Action unsuccessful " +
                      "will be changed after reload of the page");
    }
}