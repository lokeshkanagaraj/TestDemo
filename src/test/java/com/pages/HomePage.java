package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.utils.Constants.Title.TEST_SCRIPT_DEMO_AUTOMATION_PRACTICE;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @Override
    public void seePageTitle() {
        assertThat(driver.getTitle(), is(TEST_SCRIPT_DEMO_AUTOMATION_PRACTICE));
    }

    @FindBy(xpath = "//a[@class='cc-btn cc-accept-all cc-btn-no-href']")
    private WebElement acceptAllCookiesButton;

    @FindBy(linkText = "Shop")
    private WebElement shop;

    public void acceptCookies() {
        acceptAllCookiesButton.click();
    }

    public void clickOnShopTab() {
        shop.click();
    }


}
