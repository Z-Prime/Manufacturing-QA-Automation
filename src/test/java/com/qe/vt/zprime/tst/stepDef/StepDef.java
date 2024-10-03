package com.qe.vt.zprime.tst.stepDef;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import com.qe.vt.zprime.constants.Locators;
import com.qe.vt.zprime.constants.Config;
import com.qe.vt.zprime.constants.LocatorTypes;
import com.qe.vt.zprime.constants.LoggerTest;
import com.qe.vt.zprime.element.Element;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef extends Element {

	private static final Logger logger = LogManager.getLogger(LoggerTest.class);
// URL launching

	@Given("User is on the homepage")
	public void user_is_on_the_homepage() {
		initializeWebDriver(Config.BROWSER_TYPE);
		driver.get(Config.BASE_URL);
		driver.manage().window().maximize();
	}

	@Then("User be able to see the home page with Zprime logo")
	public void user_be_able_to_see_the_home_page_with_zprime_logo() {
		logger.atDebug().log("User be able to see the logo image");
		getWebElementWithFluentwait(Locators.ZPRIME_MAINLOGO_XPATH, LocatorTypes.XPATH).isDisplayed();
		logger.atDebug().log("User successfully see the logo image");
	}
//	Leftmenu

	@When("User clicks on left menu bar")
	public void user_clicks_on_left_menu_bar() {
		getWebElementWithFluentwait(Locators.LEFT_MENUBAR_XPATH, LocatorTypes.XPATH).click();
	}

	@Then("User be able to see zprime logo, back arrow, select your page text and entry pionts for dashboards")
	public void user_be_able_to_see_zprime_logo_back_arrow_select_your_page_text_and_entry_pionts_for_parameters() {
		getWebElementWithFluentwait(Locators.ZPRIME_LOGO_XPATH, LocatorTypes.XPATH).isDisplayed();
		WebElement ele = getWebElementWithFluentwait(Locators.SELECT_PAGE_TEXT_XPATH, LocatorTypes.XPATH);
		System.out.println(ele.getText());
		getWebElementWithFluentwait(Locators.LEFT_MENUBAR_BACKARROW_XPATH, LocatorTypes.XPATH).isDisplayed();
	}

	@When("User clicks on back arrow")
	public void user_clicks_on_back_arrow() {
		getWebElementWithFluentwait(Locators.LEFT_MENUBAR_BACKARROW_XPATH, LocatorTypes.XPATH).click();
	}

	@Then("User navigate to the home page")
	public void user_navigate_to_the_home_page() {

	}
//	Quality

	@When("User clicks on quality")
	public void user_clicks_on_quality() {
		getWebElementWithFluentwait(Locators.LEFT_MENUBAR_QUALITY_XPATH, LocatorTypes.XPATH).click();
	}

	@Then("User be able to navigate to the quality dashboard")
	public void user_be_able_to_navigate_to_the_quality_dashboard() {

	}

	@When("User clicks on optoelectronics assembly")
	public void user_clicks_on_optoelectronics_assembly() {
		getWebElementWithFluentwait(Locators.QUALITY_OPTOELECTRONICS_ASSEMBLY_XPATH, LocatorTypes.XPATH).click();
	}

	@Then("User able to navigate to the particular page")
	public void user_able_to_navigate_to_the_particular_page() {

	}

	@When("User clicks on dispenser")
	public void user_clicks_on_dispenser() {
		getWebElementWithFluentwait(Locators.QUALITY_DISPENSER_XPATH, LocatorTypes.XPATH).click();
	}

	@Then("User able to navigae to the dispenser page")
	public void user_able_to_navigae_to_the_dispenser_page() {

	}

	@When("User clicks on optoelectronics assembly and selects all checkboxes of available data")
	public void user_clicks_on_optoelectronics_assembly_and_selects_all_checkboxes_of_available_data() {
		getWebElementWithFluentwait(Locators.QUALITY_OPTOELECTRONICS_ASSEMBLY_XPATH, LocatorTypes.XPATH).click();
		getWebElementWithFluentwait(Locators.QUALITY_OPTO_BEAMWIDTH_CHECKBOX_XPATH, LocatorTypes.XPATH).click();
		getWebElementWithFluentwait(Locators.QUALITY_OPTO_CENTROID_XPATH, LocatorTypes.XPATH).click();
		getWebElementWithFluentwait(Locators.QUALITY_OPTO_SLOW_AXIS_VARIABLE_CHECKBOX_XPATH, LocatorTypes.XPATH)
				.click();
		getWebElementWithFluentwait(Locators.QUALITY_OPTO_FAST_AXIS_VARIABLE_CHECKBOX_XPATH, LocatorTypes.XPATH)
				.click();
	}

	@Then("User able to select the checkboxes")
	public void user_able_to_select_the_checkboxes() {

	}

	@When("User clicks on upload file button")
	public void user_clicks_on_upload_file_button() {
		getWebElementWithFluentwait(Locators.QUALITY_OPTO_UPLOADFILE_XPATH, LocatorTypes.XPATH).click();
	}

	@Then("User able to see upload file window")
	public void user_able_to_see_upload_file_window() {

	}

	@When("User clicks on cancel button")
	public void user_clicks_on_cancel_button() {
		WebElement ele1 = getWebElementWithFluentwait(Locators.QUALITY_OPTO_UPLOADFILE_CANCEL_XPATH,
				LocatorTypes.XPATH);
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click();", ele1);
	}

	@Then("User able to close the upload file window")
	public void user_able_to_close_the_upload_file_window() {

	}

	@When("User clicks on search bar")
	public void user_clicks_on_search_bar() {
		getWebElementWithFluentwait(Locators.QUALITY_SEARCH_BAR_XPATH, LocatorTypes.XPATH).click();
	}

	@Then("User able to see empty image")
	public void user_able_to_see_empty_image() {

	}

	@When("User passes some text")
	public void user_passes_some_text() {
		getWebElementWithFluentwait(Locators.QUALITY_SEARCH_BAR_XPATH, LocatorTypes.XPATH).sendKeys("c");
	}

	@When("User clicks on the recommended total cost option")
	public void user_clicks_on_the_recommended_total_cost_option() {
		WebElement ele2 = getWebElementWithFluentwait(Locators.QUALITY_SEARCH_BAR_TOTALCOST_XPATH, LocatorTypes.XPATH);
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click();", ele2);
	}

	@Then("User able to navigate to total cost page")
	public void user_able_to_navigate_to_total_cost_page() {

	}
	
//	@Performance
	@When("User clicks on performance")
	public void user_clicks_on_performance() {
		getWebElementWithFluentwait(Locators.PERFORMANCE_XPATH, LocatorTypes.XPATH).click();
	}
	@Then("User able to navigate to the performance dashboard")
	public void user_able_to_navigate_to_the_performance_dashboard() {
	    
	}
	@When("User clicks on quality button")
	public void user_clicks_on_quality_button() {
		getWebElementWithFluentwait(Locators.PERFORMANCE_QUALITY_CSS, LocatorTypes.CSSSELECTOR).click();
	}
	@Then("User able to navigate to the quality page")
	public void user_able_to_navigate_to_the_quality_page() {
	    
	}
	@When("User clicks on envoronmental impact button")
	public void user_clicks_on_envoronmental_impact_button() {
		getWebElementWithFluentwait(Locators.PERFORMANCE_ENVIRONMENTALIMPACT_XPATH, LocatorTypes.XPATH).click();
	}
	@Then("User able to navigate to the environmental impact page")
	public void user_able_to_navigate_to_the_environmental_impact_page() {
	    
	}
	@When("User clicks on productivity")
	public void user_clicks_on_productivity() {
		getWebElementWithFluentwait(Locators.PERFORMANCE_PRODUCTIVITY_XPATH, LocatorTypes.XPATH).click();
	}
	@Then("User able to navigate to the productivity page")
	public void user_able_to_navigate_to_the_productivity_page() {
	   
	}
	
//	Cost
	@When("User clicks on cost")
	public void user_clicks_on_cost() {
		getWebElementWithFluentwait(Locators.COSTS_XPATH, LocatorTypes.XPATH).click();
	}
	@Then("User able to navigate to the cost dashboard")
	public void user_able_to_navigate_to_the_cost_dashboard() {
	    
	}
	@When("User clicks on cost breakdown")
	public void user_clicks_on_cost_breakdown() {
		getWebElementWithFluentwait(Locators.COSTS_COSTBREAKDOWN_XPATH, LocatorTypes.XPATH).click();
	}
	@Then("User able to navigate to the cost breakdown page")
	public void user_able_to_navigate_to_the_cost_breakdown_page() {
	    
	}
	@When("User clicks on time factors")
	public void user_clicks_on_time_factors() {
		getWebElementWithFluentwait(Locators.COSTS_TIMEFACTORS_XPATH, LocatorTypes.XPATH).click();
	}
	@Then("User able to navigate to the time factors page")
	public void user_able_to_navigate_to_the_time_factors_page() {
	    
	}
	@When("User clicks on input graphs")
	public void user_clicks_on_input_graphs() {
		getWebElementWithFluentwait(Locators.COSTS_INPUT_GRAPHS_XPATH, LocatorTypes.XPATH).click();
	}
	@Then("User able to navigate to the input graphs page")
	public void user_able_to_navigate_to_the_input_graphs_page() {
	    
	}

}