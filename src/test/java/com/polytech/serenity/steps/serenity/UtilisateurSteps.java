package com.polytech.serenity.steps.serenity;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

import com.polytech.serenity.pages.HomePage;
import com.polytech.serenity.pages.InscriptionPage;

import net.thucydides.core.annotations.Step;

public class UtilisateurSteps {

    HomePage homePage;
    InscriptionPage inscriptionPage;

    @Step
    public void saisit_mot(String motCles) {
        homePage.entrer_mots_cles(motCles);
    }

    @Step
    public void lance_la_recherche() {
        homePage.rechercher_mots();
    }

    @Step
    public void doit_voir_la_definition(String definition) {
        assertThat(homePage.rechuperer_definitions(), hasItem(containsString(definition)));
    }

    @Step
    public void est_sur_la_homepage() {
        homePage.open();
    }

    @Step
    public void recherche(String motCle) {
        saisit_mot(motCle);
        lance_la_recherche();
    }
    
    @Step
    public void acceder_a_l_inscription() {
    	homePage.aller_a_linscription();
    }
    
    @Step
    public boolean est_sur_linscription_page() {
    	return inscriptionPage.headingCheck();
    }
}