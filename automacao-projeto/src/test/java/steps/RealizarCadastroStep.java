package steps;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import pages.RealizarLoginPage;

public class RealizarCadastroStep {
	WebDriver driver = WebDriverHooks.getDriver();
	
	@Dado("acesso a tela de cadastro")
	public void realizar_pagamento() {

		RealizarLoginPage loginPage = new RealizarLoginPage(driver);
		loginPage.acessarTelaCadastro();

	}
	
	@Dado("preencho os campos de cadastro")
	public void preencher_cadastro() {

		RealizarLoginPage loginPage = new RealizarLoginPage(driver);
		loginPage.preencherCadastro();

	}
	
	@Então("verifico se o cadastro foi realizado com sucesso")
	public void verificar_cadastro_sucesso() {

		RealizarLoginPage loginPage = new RealizarLoginPage(driver);
		loginPage.verCadastroSucesso();

	}


}
