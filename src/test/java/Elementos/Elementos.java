package Elementos;

import org.openqa.selenium.By;

public class Elementos {

	private By btnAbrirConta = By.cssSelector("body > div.viewport-primary > nav.nav-desktop > div.right > div.nav-item.nav-item-nova-conta > a");
	private By btnAbrirContaParaVoce = By.id("bt1");
	private By campoNome = By.id("nome");
	private By campoTelefone = By.id("telefone");
	private By campoEmail = By.id("email");
	private By campoCpf = By.id("cpf");
	private By btnQueroSerCliente = By.id("btnEnviar");
	private By textoFaltaPouco = By.xpath("//*[@id=\"pu-modalSucesso\"]/div/div[1]/p/span[1]");
	private By abrirContaPJ = By.id("bt2");
	private By abrirContaUnica = By.id("bt3");
	
	public By getAbrirContaUnica() {
		return abrirContaUnica;
	}
	public By getAbrirContaPJ() {
		return abrirContaPJ;
	}
	public By getTextoFaltaPouco() {
		return textoFaltaPouco;
	}
	public By getBtnAbrirConta() {
		return btnAbrirConta;
	}
	public By getBtnAbrirContaParaVoce() {
		return btnAbrirContaParaVoce;
	}
	public By getCampoNome() {
		return campoNome;
	}
	public By getCampoTelefone() {
		return campoTelefone;
	}
	public By getCampoEmail() {
		return campoEmail;
	}
	public By getCampoCpf() {
		return campoCpf;
	}
	public By getBtnQueroSerCliente() {
		return btnQueroSerCliente;
	}
	
	
	
}
