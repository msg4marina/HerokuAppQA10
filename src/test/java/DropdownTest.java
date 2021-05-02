import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DropdownTest extends BaseTest {
    private Object assertEquals;

    @Test
    public void checkInDropDownWhatElementsAreAvailableAndPresent() {

        driver.get("http://the-internet.herokuapp.com/dropdown");
        WebElement testDropDown = driver.findElement(By.id("dropdown"));
        Select dropdown = new Select(testDropDown);
        dropdown.selectByVisibleText("Option 1");
        testDropDown.click();
        String unit1 = driver.findElement(By.xpath("//*[contains(@selected,'selected')]")).getText();
        assertEquals(unit1, "Option 1", "Sorry, the Option 1 is not selected");
        dropdown.selectByVisibleText("Option 2");
        testDropDown.click();
        String unit2 = driver.findElement(By.xpath("//*[contains(@selected,'selected')]")).getText();
        assertEquals(unit2, "Option 2", "Sorry, the Option 1 is not selected");
    }
}