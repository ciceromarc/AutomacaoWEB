package br.com.automacao.produto.steps;

import br.com.automacao.produto.pages.BuscaLivroPage;
import br.com.automacao.produto.pages.configuracao.ConfiguracaoPage;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.By;

public class BuscaLivroStep {


    //validaPaginaPrincipal
    @Quando("^acessar a pagina principal$")
    public void acessarAPaginaPrincipal() throws Throwable {
        Thread.sleep(3000);
    }

    //buscaLivro
    @Quando("^preencher o nome do livro \"([^\"]*)\"$")
    public void preencherONomeDoLivro(String nomelivrobusca) throws Throwable {
        BuscaLivroPage.preencherLivro(nomelivrobusca);
    }

    @Quando("^clicar no botão Buscar$")
    public void clicarNoBotãoBuscar() throws Throwable {
        BuscaLivroPage.clicarBotaoBuscar();
    }

    @Então("^deve exibir o livro com \"([^\"]*)\" \"([^\"]*)\"$")
    public void deveExibirOLivroCom(String nomedolivro, String valor) throws Throwable {
        BuscaLivroPage.validaNomeLivro(nomedolivro);
        BuscaLivroPage.validaValorLivro(valor);


    }
}
