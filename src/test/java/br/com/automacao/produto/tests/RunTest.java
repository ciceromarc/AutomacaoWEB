package br.com.automacao.produto.tests;

import cucumber.api.SnippetType;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/java/br/com/automacao/produto/features/"},
		glue = {"br/com/automacao/produto/steps"},
		tags = {"@buscaLivro"},
		plugin = {"json:target/reports/CucumberReports.json", "pretty"},
		snippets = SnippetType.CAMELCASE,
		monochrome = true
)
public class RunTest {

}
