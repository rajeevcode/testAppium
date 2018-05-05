package com.appium.test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.touch.TouchActions;

import java.net.MalformedURLException;
import java.time.Duration;
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
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" +
                ".scrollIntoView(new UiSelector().textContains(\"Views\").instance(0))");
        TouchAction t = new TouchAction(driver);
        t.press(driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']")))
                .waitAction(Duration.ofSeconds(10)).release().perform();
        //driver.findElementById("android:id/title").click();
        AndroidElement element = driver.findElementByXPath("(//android.widget.LinearLayout)[2]");
        TouchActions action = new TouchActions(driver);
        action.longPress(element);
        action.click();


       // driver.findElementByXPath("(//android.widget.LinearLayout)[2]").
//        driver.findElementByClassName("android.widget.EditText").sendKeys("hello");
//        driver.findElementsByClassName("android.widget.Button").get(1).click();


    }
}
