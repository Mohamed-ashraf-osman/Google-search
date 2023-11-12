package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class Google extends BasePage {
    private final By textareaElement = By.name("q");
    private final By logo = By.cssSelector("img[class=\"lnXdpd\"]");
    private final By selenium =By.cssSelector("h3[class=\"LC20lb MBeuO DKV0Md\"]");

    public Google(WebDriver driver) {
        super(driver);
    }

    public String GetPageTitle() {
        return driver.getCurrentUrl();
    }

    public void searchForSelenium() {
        driver.findElement(textareaElement).sendKeys("selenium webdriver" + Keys.ENTER);
    }

    public String GetSearchResult() {
        List<WebElement> elements;
        elements = driver.findElements(selenium);
        if (!elements.isEmpty()) {
            WebElement GetSearchResult = elements.get(0);
            GetSearchResult.getText();
            String actual = GetSearchResult();
            Assert.assertEquals(actual,"selenium"
            );
        }
        return null;
    }



    public boolean VrifyLogo () {
        return driver.findElement(logo).isDisplayed();
}}
