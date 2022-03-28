package com.testinium.page;

import com.testinium.methods.Methods;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    Methods methods;
    public LoginPage(){
        methods = new Methods();
    }

    public void login(){
        methods.click(By.cssSelector(".menu-top-button.login>a"));
        methods.waitBySeconds(5);
        methods.sendKeys(By.id("login-email"),"ilaydaevci@outlook.com");
        methods.waitBySeconds(5);
        methods.sendKeys(By.id("login-password"),"Aa.123456");
        methods.waitBySeconds(5);
      //  Assert.assertTrue(methods.isElementClickable(By.cssSelector(".ky-btn.ky-btn-orange.w-100.ky-login-btn")));
        methods.click(By.cssSelector(".ky-btn.ky-btn-orange.w-100.ky-login-btn"));
        methods.waitBySeconds(10);




    }
}
