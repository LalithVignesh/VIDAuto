package test.java;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class DesiredCaps {


AndroidDriver driver ;
@BeforeTest
public void setUp() throws MalformedURLException {
    File app = new File("E:\\Vidhya\\Vidhya Work\\POEMS SG 2.0.apk");
    DesiredCapabilities caps = new DesiredCapabilities();
    caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi");
    caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "");
    caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "");
    caps.setCapability("app", app.getAbsolutePath());
    driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
}

    @AfterTest
    public void End() {
        driver.quit();
    }
}