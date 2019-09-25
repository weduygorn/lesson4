package test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class ParentPage {

   // ChromeDriver webDriver = new ChromeDriver();

    WebDriver webDriver ;


    public ParentPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver , this);
        this.webDriver = webDriver;


    }
}
