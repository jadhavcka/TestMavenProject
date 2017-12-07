package com.sbn.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class MySimpleTest {
    String hubURL = "";
    @Test
    public void myTest1() throws MalformedURLException {
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        WebDriver driver = new RemoteWebDriver(new URL(hubURL),capabilities);
        driver.get("http://www.google.com");
        driver.quit();
    }

    @Test
    public void myTest2() throws MalformedURLException {
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        WebDriver driver = new RemoteWebDriver(new URL(hubURL),capabilities);
        driver.get("http://www.bing.com");
        driver.quit();
    }
}
