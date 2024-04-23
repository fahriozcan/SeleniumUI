package self_tutorial.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import self_tutorial.utils.Driver;

public class W3Page {

    public W3Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (id = "demo")
    public WebElement doubleClickMe;

}
