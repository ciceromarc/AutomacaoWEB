package br.com.automacao.produto.pages;

import br.com.automacao.produto.pages.configuracao.ConfiguracaoPage;
import org.junit.Assert;
import org.openqa.selenium.By;

public class BuscaLivroPage {

    public static void preencherLivro(String nomedolivrobusca) {
        ConfiguracaoPage.driver.findElement(By.id("search")).sendKeys(nomedolivrobusca);

    }

    public static void clicarBotaoBuscar() throws InterruptedException {
        ConfiguracaoPage.driver.findElement(By.cssSelector("#search_mini_form > div > button > span > span")).click();
        Thread.sleep(3000);
    }

    public static void validaNomeLivro(String nomedolivro) {
        String nomelivroconteudo = ConfiguracaoPage.driver.findElement(By.cssSelector("div.category-products > ul > li > h2 > a")).getText();
        System.out.println("Nome do Livro: "+nomelivroconteudo);
        Assert.assertEquals(nomedolivro, nomelivroconteudo);
    }

    public static void validaValorLivro(String valor) {
        String valorconteudo = ConfiguracaoPage.driver.findElement(By.cssSelector("span[class=regular-price]")).getText();
        System.out.println("Valor do Livro: "+valorconteudo);
        Assert.assertEquals(valor, valorconteudo);
    }
}
