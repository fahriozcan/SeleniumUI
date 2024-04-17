package self_tutorial.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import self_tutorial.pages.MainPage;
import self_tutorial.utils.ConfigurationReader;
import self_tutorial.utils.Driver;

public class MainStepDefs {

    MainPage mainPage = new MainPage();

    @When("User launches the main page")
    public void user_launches_the_main_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }
    @Then("User should see the top header")
    public void user_should_see_the_top_header() {
        Assert.assertTrue(mainPage.topHeader.isDisplayed());
    }

}
