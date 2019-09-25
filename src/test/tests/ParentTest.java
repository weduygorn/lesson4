package test.tests;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class ParentTest {

    WebDriver webDriver ;
    DesiredCapabilities  capabilities = DesiredCapabilities.chrome();




    @BeforeTest
    @Parameters({"bla"})
    public void beforeTest(@Optional(value = "qwe") String bla) throws MalformedURLException {
       // webDriver  = new ChromeDriver();

        webDriver = new RemoteWebDriver(new URL("http://192.168.145.5:4444/wd/hub"), this.capabilities);

        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        webDriver.manage().window().maximize();
        System.out.println(bla);

    }

    @AfterMethod
    public void waiter() throws InterruptedException {
        Thread.sleep(2000);

    }

    @AfterTest
    public void close() {
        webDriver.quit();
    }

}
