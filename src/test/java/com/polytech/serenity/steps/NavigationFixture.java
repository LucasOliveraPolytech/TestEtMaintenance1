package com.polytech.serenity.steps;

import com.polytech.serenity.steps.serenity.UserSteps;
import com.polytech.serenity.steps.serenity.UtilisateurSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.fr.Soit;
import net.thucydides.core.annotations.Steps;

public class NavigationFixture {

	@Steps
	UserSteps user;
	
	@Given("the user is in the home page")
	public void aUserIsOnTheHomePage() throws Exception {
		user.isOnTheHomePage();
	}
	
	@Then("^the user should be in the results page for \"([^\"]*)\"$")
	public void theUserShouldSeeTheResultsFor(String word) throws Exception {
	    user.isInTheResultsPageFor(word);
	}
	
	@Then("^the user should be in the results page for \"([^\"]*)\" streams$")
	public void theUserShouldBeInTheResultsPageForStreams(String word) throws Exception {
		user.isInTheResultsPageForStreamsOnly(word);
	}
	
	@When("^the user select the video tab$")
	public void theUserSelectsTheVideoTab() throws Exception {
	    user.selectVideoTab();
	}
	
	@Then("^the user should be in the Youtube chanel's site$")
	public void the_user_should_be_in_the_Youtube_chanel_s_site() throws Exception {
	    user.isInTheYoutubeSite();
	}
	
	@When("^the user selects the \"([^\"]*)\" option$")
	public void theUserSelectsTheOption(String option) throws Exception {
	    user.selectOption(option);
	}

	@Then("^the user should see the \"([^\"]*)\" page$")
	public void theUserShouldSeeTheTechPage(String option) throws Exception {
	    user.isInThePage(option);
	}
	
}
