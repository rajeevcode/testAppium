package com.appium.test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;
import java.time.Duration;

import static com.appium.test.BaseTest.capabilities;

public class gestures {

    public static void main(String[] args) throws MalformedURLException {

        AndroidDriver<AndroidElement> driver = capabilities();
        driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
        //driver.findElementById("android:id/text1").click();
        //Touch actions
        TouchAction t = new TouchAction(driver);
        t.tap(driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']")).perform();
//        t.tap(driver.findElementByXPath("(//android.widget.TextView)[8]")).perform();
        driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']").click();
        t.press(driver.findElementByXPath("//android.widget.TextView[@text='People Names']"))
                .waitAction(Duration.ofSeconds(3000)).release().perform();


    }

}