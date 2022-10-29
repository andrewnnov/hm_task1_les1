package google.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainGooglePage {
    protected WebDriver chromeDriver;
    protected WebElement searchField;
    protected WebElement searchButton;

    public MainGooglePage(WebDriver chromeDriver) {
        this.chromeDriver = chromeDriver;
        this.searchField = chromeDriver.findElement(By.xpath("//input[@name='q']"));
        this.searchButton = chromeDriver.findElement(By.xpath("//div[@class='lJ9FBc']//input[@name='btnK']"));
    }

    public void find(String keySearch) {
        searchField.click();
        searchField.sendKeys(keySearch);
        searchButton.click();
    }
}
