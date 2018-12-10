package com.polytech.serenity.steps.serenity;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;


public class CategoryPage extends PageObject{
	
	@FindBy(css = ".p-page-title")
	private WebElementFacade header;
	
	public boolean headerCheck(String option) {
		return header.containsText(option.toUpperCase());
	}
}
