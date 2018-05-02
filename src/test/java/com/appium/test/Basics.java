package com.appium.test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class Basics extends BaseTest
{
    public static void main(String[] args) throws MalformedURLException {

       AndroidDriver<AndroidElement> driver = capabilities();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

       /*tagname Syntax
       // tagName[@attribute='value']
        */

       driver.findElement(By.xpath("//android.widget.TextView[@text='Preference']")).click();
       driver.findElement(By.xpath("//android.widget.TextView[@text='1. Preferences from XM']")).click();
      // driver.quit();


    }
}
