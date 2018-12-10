package com.polytech.serenity.pages;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.theverge.com/")
public class TheVergeHomePage extends PageObject {

	@FindBy(css = "html.fonts-loaded body.l-hub-page.hub-front-page div.l-root.l-reskin div.l-header div.chorus-emc__content div.c-masthead.c-masthead--centered header.c-global-header.has-masthead-bg div.l-wrapper div.c-global-header__actions div.c-global-header__search.has-no-sublist button.c-global-header__search-trigger")
	private WebElementFacade searchGlassButton;

	@FindBy(css = "html.fonts-loaded body.l-hub-page.hub-front-page div.l-root.l-reskin div.l-header div.chorus-emc__content div.c-masthead.c-masthead--centered header.c-global-header.has-masthead-bg.is-search-active div.l-wrapper div.p-input-header.c-global-header__search-menu form input.p-input-header__input")
	private WebElementFacade searchBox;

	@FindBy(css = "html.fonts-loaded body.l-hub-page.hub-front-page div.l-root.l-reskin div.l-header div.chorus-emc__content div.c-masthead.c-masthead--centered header.c-global-header.has-masthead-bg.is-search-active div.l-wrapper div.p-input-header.c-global-header__search-menu form input.p-input-header__link.p-button")
	private WebElementFacade searchTextButton;

	@FindBy(css = "li.c-global-header__link:nth-child(7) > a:nth-child(1)")
	private WebElementFacade videoButton;

	public void openSearchTab() {
		searchGlassButton.click();
	}

	public void writesTheWord(String word) {
		openSearchTab();
		searchBox.type(word);
	}

	public void launchSearch() {
		searchTextButton.click();
	}

	public void selectVideoTab() {
		videoButton.click();
	}

	public void selectOption(String option) {
		List<WebElementFacade> buttons = findAll(By.className("c-nav-list__all-link"));
		for(WebElementFacade b : buttons)
			if(b.containsText(option.toUpperCase()))
				b.click();
	}

}
