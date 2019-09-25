package test.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WorkRegisterPage extends ParentPage {



    @FindBy(xpath =".//input[@id='first_name']" )
    public WebElement firstNameInput;

    @FindBy(xpath = ".//input[@id='last_name']")
    public WebElement lastNameInput;

    @FindBy(xpath = ".//input[@id='email']")
    public WebElement emailInput;

    @FindBy(xpath = ".//input[@id='password']")
    public WebElement passwordInput;

    @FindBy(xpath = ".//input[@class='btn btn-default btn-block']")
    public WebElement registrationButtonButton;

    //.//input[@id='first_name']

    public void fillRegisterForm(String name, String surname, String email, String password ){
        firstNameInput.sendKeys(name);
        lastNameInput.sendKeys(surname);
        emailInput.sendKeys(email);
        passwordInput.sendKeys(password);
        registrationButtonButton.click();

    }

    public WorkRegisterPage(WebDriver webDriver) {
        super(webDriver);
    }










}
