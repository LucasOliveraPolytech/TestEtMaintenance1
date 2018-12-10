package com.polytech.serenity.pages;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://fr.wiktionary.org/wiki/Wiktionary")
public class HomePage extends PageObject {

    @FindBy(name="search")
    private WebElementFacade searchTerms;

    @FindBy(name="go")
    private WebElementFacade lookupButton;
    
    @FindBy(css="#pt-createaccount > a:nth-child(1)")
    private WebElementFacade inscriptionLink;

    public void entrer_mots_cles(String motCle) {
        searchTerms.type(motCle);
    }

    public void rechercher_mots() {
        lookupButton.click();
    }

    public List<String> rechuperer_definitions() {
        WebElementFacade definitionList = find(By.tagName("ol"));
        return definitionList.findElements(By.tagName("li")).stream()
                             .map( element -> element.getText() )
                             .collect(Collectors.toList());
    }

	public void aller_a_linscription() {
		inscriptionLink.click();		
	}
}