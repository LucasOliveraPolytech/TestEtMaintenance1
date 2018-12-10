package com.polytech.serenity.steps;

import static org.junit.Assert.assertTrue;

import com.polytech.serenity.steps.serenity.UtilisateurSteps;

import cucumber.api.java.fr.Alors;
import cucumber.api.java.fr.Quand;
import net.thucydides.core.annotations.Steps;

public class GestionCompteFixture {
	
	@Steps
	private UtilisateurSteps utilisateur;


	@Quand("^il accede a la page d'inscription$")
	public void il_accede_a_la_page_d_inscription() throws Exception {
		utilisateur.acceder_a_l_inscription();
	}
	
	@Alors("^il devrait voir la page de creation des comptes$")
	public void il_devrait_voir_la_page_de_creation_des_comptes() {
		assertTrue(utilisateur.est_sur_linscription_page());
	}

}
