import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import static org.openqa.selenium.By.*;
import static org.testng.Assert.assertTrue;

public class DynamicControlsTest extends BaseTest {
    @Test
    public void toFindCheckBox() {
        //Найти чекбокс
        driver.get("http://the-internet.herokuapp.com/dynamic_controls");
        driver.findElement(id("checkbox"));
    }
    @Test
    public void toPressTheButton() {
        //Нажать на кнопку,Дождаться надписи “It’s gone”
        driver.get("http://the-internet.herokuapp.com/dynamic_controls");
        driver.findElement(xpath("//button[contains (text(), 'Remove')]")).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.textToBe(By.id("message"), "It's gone!"));
    }
    @Test
    public void toCheckTheCheckboxAbsence() {
        //Проверить, что чекбокса нет
        driver.get("http://the-internet.herokuapp.com/dynamic_controls");
        driver.findElement(xpath("//button[contains (text(), 'Remove')]")).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id("checkbox"), " A checkbox"));
    }
    @Test
    public void toCheckTheInput() {
        //Найти инпут
        driver.get("http://the-internet.herokuapp.com/dynamic_controls");
        driver.findElement(tagName("input"));
        //Проверить, что он disabled
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.invisibilityOfElementWithText(By.tagName("input"), "disabled"));
        //Нажать на кнопку
        driver.findElement(By.xpath("//button[@onclick='swapInput()']")).click();
        //Дождаться надписи “It's enabled!”
        boolean isDisplayed = driver.findElement(By.xpath("//button[text()='Disable']")).isDisplayed();
        assertTrue(isDisplayed, "It's enabled!");
        WebDriverWait isEnabled = new WebDriverWait(driver, 10);
        isEnabled.until(ExpectedConditions.textToBe(By.id("message"), "It's enabled!"));
    }
}