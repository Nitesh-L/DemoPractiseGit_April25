package PageObjectModel;

import Utilities.BaseClass;
import Utilities.SeleniumCommands;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.bidi.log.Log;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class LoginPage extends BaseClass
{
    SeleniumCommands commands = new SeleniumCommands();

    String loginButton = "//a[text()='Log in']";
    String EnterUserName = "//input[@id='Email']";
    String EnterPassword = "//input[@id='Password']";
    String ClickLoginButton = "//input[@value='Log in']";

    public void ClickloginButton()
    {
        WebElement ele = driver.findElement(By.xpath(loginButton));
        commands.Rclick(ele);
    }
    public void EnterUserName() throws IOException, ParseException {
        WebElement ele = driver.findElement(By.xpath(EnterUserName));
        commands.TypeInto(JsonReader("Email"),ele);
    }
    public void EnterPassword() throws IOException, ParseException {
        WebElement ele = driver.findElement(By.xpath(EnterPassword));
        commands.TypeInto(JsonReader("Password"),ele);
    }
    public void ClickOnLoginButton()
    {
        WebElement ele = driver.findElement(By.xpath(ClickLoginButton));
        commands.Rclick(ele);
    }



}
