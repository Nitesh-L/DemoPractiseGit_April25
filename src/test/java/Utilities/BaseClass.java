package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

public class BaseClass extends FileReader
{
    public static WebDriver driver ;
    public void OpenBrowser() throws IOException {
        driver = new ChromeDriver();
        driver.navigate().to(ConfidReader("Url"));
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void Quit()
    {
        driver.quit();
    }

}
