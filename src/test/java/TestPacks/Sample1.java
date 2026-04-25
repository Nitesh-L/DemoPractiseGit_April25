package TestPacks;

import PageObjectModel.LoginPage;
import Utilities.BaseClass;
import org.testng.annotations.Test;

import java.io.IOException;

public class Sample1 extends BaseClass
{
    LoginPage l = new LoginPage();
    @Test
    public void Login1() throws IOException {
        OpenBrowser();
        l.ClickloginButton();
        l.EnterUserName();
        l.EnterPassword();
        l.ClickOnLoginButton();
    }

}
