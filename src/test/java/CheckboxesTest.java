import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;
import java.util.concurrent.TimeUnit;
import static org.testng.Assert.assertEquals;

public class CheckboxesTest extends BaseTest {

    @Test
    public void toCheckFirstNotSelectedElement() {
        driver.get("http://the-internet.herokuapp.com/checkboxes");
        driver.findElement(By.cssSelector("input[type=checkbox]")).click();
        assertEquals("Selected", "Not selected",
                "If you see this message it means that before the CLICK the first element" +
                        " hasn't been selected ." +
                        "Now the element is selected");
        boolean isSelected = driver.findElement(By.cssSelector("input[type=checkbox]")).isSelected();
        assertEquals(true, isSelected, "If you see this message it means that before " +
                "the CLICK the first element hasn't been selected." +
                "Now the element is selected");
    }
    @Test
    public void toCheckSecondSelectedElement() {
        driver.get("http://the-internet.herokuapp.com/checkboxes");
        driver.findElement(By.xpath("(//input)[2]")).click();
        boolean isNotSelected = driver.findElement(By.xpath("(//input)[2]")).isSelected();
        assertEquals (true, "isNotSelected",
                "If you see this message it means that before the CLICK " +
                        "the first element has been selected ." +
                        "Now the element is NOT selected");
    }
}