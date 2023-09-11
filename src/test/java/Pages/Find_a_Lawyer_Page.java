package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Find_a_Lawyer_Page {
    public static final String PAGE_TITLE = "Lawyer Search";
    public static final String PAGE_URL = "https://publish-p48997-e257700.adobeaemcloud.com/people.html";
    @FindBy(xpath = "//aside//a//span")
    WebElement peopleMenu;

    @FindBy(css = "[placeholder*='Name']")
    WebElement nameField;

    public Find_a_Lawyer_Page(WebDriver driver) {
        PageFactory.initElements(driver, this); // Initialize elements using Page Factory
    }

    public void nameInput (String typeName) {
        nameField.sendKeys(typeName);
    }
    public void clickMenu() {
        peopleMenu.click();
    }
}
