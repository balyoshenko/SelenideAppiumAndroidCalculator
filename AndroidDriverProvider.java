package utilits;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class AndroidDriverProvider {


public static WebDriver getAndroidDriver() throws MalformedURLException{

   DesiredCapabilities capabilities = new DesiredCapabilities();
   capabilities.setCapability(MobileCapabilityType.VERSION, "4.4.2");
   capabilities.setCapability("automationName", "Appium");
   capabilities.setCapability("platformName", "Android");
   capabilities.setCapability("deviceName", "0123456789ABCDEF");
   capabilities.setCapability(MobileCapabilityType.APP_PACKAGE, "com.android.calculator2"); // This is package name of your app (you can get it from apk info app
   capabilities.setCapability(MobileCapabilityType.APP_ACTIVITY, "com.android.calculator2.Calculator"); // This is Launcher activity of your app (you can get it from apk info app)
   //Create AndroidDriver instance and connect to the Appium server.
   //It will launch the Calculator App in Android Device using the configurations specified in Desired Capabilities

   return new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
 }

}
