package br.com.automacao.produto.steps;

import br.com.automacao.produto.pages.LoginPage;
import br.com.automacao.produto.pages.configuracao.ConfiguracaoPage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class LoginStep {

	LoginPage loginPage = new LoginPage();

	@Dado("^que tenha acessado a url$")
	public void queEuTenhaAcessadoAUrl() throws Throwable {
		loginPage.acessarUrl();
	}

	@Dado("^preencher o usuario \"([^\"]*)\" e senha \"([^\"]*)\"$")
	public void preencherOUsuarioESenha(String arg1, String arg2) throws Throwable {

	}

	@Quando("^clicar no botão Acessar$")
	public void clicarNoBotãoAcessar() throws Throwable {

	}

	@Então("^deve visualizar a pagina inicial com \"([^\"]*)\"$")
	public void deveVisualizarAPaginaInicialCom(String mensageminicio) throws Throwable {
		loginPage.validamsgPaginaPrincipal(mensageminicio);
	}

	@Então("^deve retornar mensagem \"([^\"]*)\"$")
	public void deveRetornarMensagem(String arg1) throws Throwable {

	}

	@Então("^deve clicar no botão sair$")
	public void deveClicarNoBotãoSair() throws Throwable {

	}


	@Before
	public void abreNavegador(){
		ConfiguracaoPage.abreNavegador();
	}

	@After
	public void fechaNavegador(){

		ConfiguracaoPage.getDriver().quit();
	}

}