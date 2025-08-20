package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class LoginTest extends BaseClass {

    @BeforeMethod
    public void setUp() {
        setup();
    }

    @Test
    public void testLogin() {
        LoginPage login = new LoginPage(driver);
        login.login("standard_user", "secret_sauce");
    }

    @AfterMethod
    public void tearDown() {
        teardown();
    }
}
