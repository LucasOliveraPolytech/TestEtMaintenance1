package com.polytech.serenity.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class InscriptionPage extends PageObject {
	
	@FindBy(id="firstHeading")
    private WebElementFacade inscriptionHeading;
	
	public boolean headingCheck() {
		return inscriptionHeading.containsText("Créer un compte");
	}
}
