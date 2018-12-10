package com.polytech.serenity.steps;

import com.polytech.serenity.steps.serenity.UserSteps;
import com.polytech.serenity.steps.serenity.UtilisateurSteps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.fr.Alors;
import cucumber.api.java.fr.Quand;
import net.thucydides.core.annotations.Steps;

/**
 * This class handles search related functionality
 * @author lolivera
 */

public class SearchFixture {
	@Steps
	UserSteps user;
	
	@When("^the user searches for the word \"([^\"]*)\"$")
	public void theUserSearchForTheWord(String word) throws Exception {
		user.openSearchTab();
		user.writesTheWord(word);
		user.launchSearch();
	}
	
	@When("^the user select only streams result$")
	public void theUserSelectOnlyStreamsResult() throws Exception {
	   user.selectStreamsOnly();
	}
	

}
