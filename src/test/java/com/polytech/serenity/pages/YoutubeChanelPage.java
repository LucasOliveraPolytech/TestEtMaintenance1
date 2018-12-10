package com.polytech.serenity.pages;


import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;


public class YoutubeChanelPage extends PageObject{
	
	@FindBy(id = "channel-title")
	private WebElementFacade chanelName;

	public boolean checkChanelName() {
		return chanelName.containsText("The Verge");
	}
}
