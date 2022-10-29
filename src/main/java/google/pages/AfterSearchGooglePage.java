package google.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AfterSearchGooglePage {


    protected  List<WebElement> resultSearch;
    protected WebDriver chromeDriver;

    public AfterSearchGooglePage(WebDriver chromeDriver) {
        this.chromeDriver = chromeDriver;
    }

    public List<WebElement> getResultSearch() {
        resultSearch = chromeDriver.findElements(By.xpath("//div[@id='search']//div[@class='yuRUbf']/a//cite"));
        return resultSearch;
    }
}
