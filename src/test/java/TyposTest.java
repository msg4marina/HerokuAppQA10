import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TyposTest extends BaseTest {
    @Test
    public void checkIntroducedTypo() {
        driver.get("http://the-internet.herokuapp.com/typos");
        String total = driver.findElement(By.xpath("(//p)[2]")).getText();
        assertEquals(total, "Sometimes you'll see a typo, other times you won't.",
                "This example demonstrates a typo being introduced.It does it randomly on each page load.\n" +
                        "After  4-6 times of page reload it works correct");
    }
}