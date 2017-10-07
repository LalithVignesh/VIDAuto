package test.java;

import org.testng.annotations.Test;

/**
 * Created by Nivi on 10/2/2017.
 */

public class TWOTest extends DesiredCaps {

    @Test(groups="sanity")
    public void Sum() throws InterruptedException {
        Thread.sleep(7000);
        System.out.println("TWO A");
        Thread.sleep(3000);

    }
    @Test
    public void Sum1() throws InterruptedException {
        Thread.sleep(7000);
        System.out.println("TWO B");
        Thread.sleep(3000);

    }





}
