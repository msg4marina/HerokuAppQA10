import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class InputsTest extends BaseTest {
    private Object assertEquals;

    @Test
    public void checkInputFieldToEnterVariousValues() {
        driver.get("http://the-internet.herokuapp.com/inputs");
        WebElement m1 = driver.findElement(By.xpath("//*[contains(@type,'number')]"));
        m1.sendKeys("15");
        m1.sendKeys(Keys.ARROW_DOWN);
        m1.sendKeys(Keys.ARROW_UP);
        m1.sendKeys(Keys.ARROW_UP);
        m1.sendKeys(Keys.ARROW_LEFT);
        m1.sendKeys(Keys.ARROW_RIGHT);
        m1.sendKeys(Keys.F12);
        m1.sendKeys(Keys.ZENKAKU_HANKAKU);
        m1.sendKeys(Keys.HOME);
        m1.clear();
        m1.sendKeys("dssfsf");
        m1.sendKeys("!@!#$@%$^%&");
        m1.sendKeys("       0");
        m1.clear();
        m1.sendKeys("___23");
        m1.clear();
        m1.sendKeys("//54");
        m1.sendKeys("//54");
        m1.clear();
        m1.sendKeys("???.&7");
        m1.clear();
        m1.sendKeys("???,&7");
        m1.clear();
        m1.sendKeys("[[[[[+09u.6]]]]]");
        m1.clear();
        m1.sendKeys("}:7;");
        m1.clear();
        m1.sendKeys("fgdfgdgrgggg54gfffxgjhhh777f");
        m1.clear();
        m1.sendKeys("8>5-6+6=98");
        m1.clear();
        m1.sendKeys("(1+2)/3=1");
        m1.sendKeys("9876543.21");
        m1.clear();
        m1.sendKeys("1E+66757775A555");
        m1.clear();
        m1.sendKeys("mammaMia");
        m1.clear();
        m1.sendKeys("маммамияп!!!вапвпрпьал ганрчааяя?;");
        m1.clear();
        m1.sendKeys(Keys.valueOf("ХДЖХДЖХДЖ"));
    }
}