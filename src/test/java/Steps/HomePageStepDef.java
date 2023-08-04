package Steps;

import org.testng.Assert;

import BaseLayer.BaseClass;
import PageLayer.HomePage;
import io.cucumber.java.en.When;

public class HomePageStepDef extends BaseClass {

	private static HomePage homePage;

	@When("user is on home page and valiate home page title")
	public void user_is_on_home_page_and_valiate_home_page_title() {
		homePage = new HomePage();
		Assert.assertEquals(homePage.getTitle(), "Cogmento CRM");
	}

	@When("user validate home page url")
	public void user_validate_home_page_url() {
		Assert.assertEquals(homePage.getCurrentUrl().contains("ui"), true);
	}

	@When("validate home page logo")
	public void validate_home_page_logo() {
		Assert.assertTrue(homePage.getLogoStatus());
	}

}
