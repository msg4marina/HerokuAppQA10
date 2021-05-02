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
         boolean m1 = driver.findElement(By.cssSelector("input[type=checkbox]")).isSelected();
         assertEquals("selected","m1", "Если Вы видите это сообщение, то это значит, " +
                "что мне не удалось проверить отмечен ли первый элемент или нет");
    }
    @Test
    public void toCheckSecondSelectedElement() {
        driver.get("http://the-internet.herokuapp.com/checkboxes");
        driver.findElement(By.xpath("(//input)[2]")).click();
        boolean m2 = driver.findElement(By.xpath("(//input)[2]")).isSelected();
        assertEquals ("m2", "not selected",
                "Если Вы видите это сообщение, то это значит, " +
                        "что мне не удалось проверить отмечен ли второй элемент или нет");
    }
}