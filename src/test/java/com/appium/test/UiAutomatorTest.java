package com.appium.test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class UiAutomatorTest extends BaseTest
   {

    public static void main(String[] args) throws MalformedURLException {

        AndroidDriver<AndroidElement> driver = capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //driver.findElementByAndroidUIAutomator("attribute(value)")
        driver.findElementByAndroidUIAutomator("text(\"Views\")").click();

        // validate click features for all options
        driver.findElementByAndroidUIAutomator("new UiSelector().clickable(false)").getSize();



    }

}
