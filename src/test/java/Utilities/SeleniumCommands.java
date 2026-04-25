package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumCommands extends BaseClass
{
    public void Rclick(WebElement ele)
    {
        ele.click();
    }
    public void TypeInto(String s , WebElement ele)
    {
        ele.sendKeys(s);
    }
}
