import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.io.File;

public class FileUploadTest extends BaseTest {
    @Test
    public void fileUpload() throws Exception {
        driver.get("http://the-internet.herokuapp.com/upload");
        File file = new File("C:/!DOWNLOAD FILES/TMS/БЛОК 2/6.pdf");
        driver.findElement(By.id("file-upload")).sendKeys(file.getAbsolutePath());
        driver.findElement(By.id("file-submit")).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.textToBe(By.tagName("h3"), "File Uploaded!"));
    }
}