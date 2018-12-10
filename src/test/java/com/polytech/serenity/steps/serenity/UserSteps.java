package com.polytech.serenity.steps.serenity;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import com.polytech.serenity.pages.HomePage;
import com.polytech.serenity.pages.InscriptionPage;
import com.polytech.serenity.pages.SearchResultsPage;
import com.polytech.serenity.pages.TheVergeHomePage;
import com.polytech.serenity.pages.YoutubeChanelPage;

import net.thucydides.core.annotations.Step;


public class UserSteps {
	TheVergeHomePage homePage;
	SearchResultsPage searchResultPage;
	YoutubeChanelPage youtubePage;
	CategoryPage categoryPage;
	
	@Step
	public void isOnTheHomePage() {
		homePage.open();
	}
	
	@Step
	public void openSearchTab() {
		homePage.openSearchTab();
	}
	
	@Step
	public void writesTheWord(String word) {
		homePage.openSearchTab();
		homePage.writesTheWord(word);
	}
	
	@Step
	public void launchSearch() {
		homePage.launchSearch();
	}
	
	@Step
	public void isInTheResultsPageFor(String word) {
		assertTrue(searchResultPage.resultContainsText(word));
	}
	
	@Step
	public void selectStreamsOnly() {
		searchResultPage.resultsStreamsOnly();
	}

	@Step
	public void isInTheResultsPageForStreamsOnly(String word) {
		assertTrue(searchResultPage.streamsOnlySelected());
	}

	@Step
	public void selectVideoTab() {
		homePage.selectVideoTab();
	}
	
	@Step
	public void isInTheYoutubeSite() {
		assertTrue(youtubePage.checkChanelName());
	}

	@Step
	public void selectOption(String option) {
		homePage.selectOption(option);
	}
	
	@Step
	public void isInThePage(String option) {
		assertTrue(categoryPage.headerCheck(option));
	}
	
	
}
