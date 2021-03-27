package io.cucumber.danilo;

import org.openqa.selenium.WebElement;
import static org.junit.Assert.assertEquals;
import org.openqa.selenium.By;
import io.cucumber.danilo.Servicos.Configuracao;
import io.cucumber.java.pt.*;

public class CasoDeTesteUmSteps {

	@Dado("que eu estou no site da gama academy")
	public void que_eu_estou_no_site_da_gama_academy() {
		Configuracao.open("https://www.gama.academy/");
	}	

	@Quando("clico na opcao {string}")
	public void clico_na_opcao(String quemsomosString) {
		WebElement quemsomos = Configuracao.browser.findElement(By.cssSelector(".nav-link"));
		quemsomos.click();
	}

	@Entao("deve ver o item do {string}")
	public void deve_ver_o_item_do(String string) {
		WebElement input = Configuracao.browser.findElement(By.cssSelector(".manifesto h1.heading.lado"));
		assertEquals(string, input.getText());
		Configuracao.browser.close();
	}

}
