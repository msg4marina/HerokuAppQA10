import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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
    }

    @Test
    public void toCheckSecondSelectedElement() {
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        driver.get("http://the-internet.herokuapp.com/checkboxes");
        List<WebElement> checkBoxElements = driver.findElements(By.cssSelector("checkbox"));
        for (WebElement e : checkBoxElements) {
            if (e.getText().contains(" checkbox 2")) {
                e.click();
            }
        }
        assertEquals("Not selected", "Selected",
                "If you see this message it means that before the CLICK " +
                        "the second element has been selected .Now the element is not selected");
    }
}