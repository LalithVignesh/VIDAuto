package test.java;

import io.appium.java_client.AppiumDriver;
import org.testng.annotations.Test;

public class OneTest extends DesiredCaps {

    AppiumDriver dr ;
    @Test(groups="sanity")
    public void Sum() throws InterruptedException {
        Thread.sleep(7000);
        System.out.println("ONE A");
        Thread.sleep(3000);

    }
    @Test
    public void Sum1() throws InterruptedException {
        Thread.sleep(7000);
        System.out.println("ONE B");
        Thread.sleep(3000);

    }


}