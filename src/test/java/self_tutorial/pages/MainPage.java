package self_tutorial.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {

    @FindBy (xpath = "//h1/span[@dir='auto']")
    private WebElement topHeader;

    public WebElement getTopHeader() {
        return topHeader;
    }
}
