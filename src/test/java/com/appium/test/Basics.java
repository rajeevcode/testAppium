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

        //xpath id className, androidUIautomator
        /*    xpath Syntax
         *    //tagName[@attribute='value']

         *
         */
        driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
        driver.findElementByXPath("(//android.widget.TextView)[4]").click();
        driver.findElementById("android:id/checkbox").click();
        driver.findElementById("android:id/title").click();
//        driver.findElementByXPath("(//android.widget.LinearLayout)[2]").click();
//        driver.findElementByClassName("android.widget.EditText").sendKeys("hello");
//        driver.findElementsByClassName("android.widget.Button").get(1).click();


    }
}
