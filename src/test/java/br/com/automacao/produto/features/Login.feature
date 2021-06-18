#language: pt
@regressaoWeb
Funcionalidade: Validação do Login e Logout do Produto

	Contexto: Validação do Login e logout
		Dado que tenha acessado a url
		E preencher o usuario "111.111.111-11" e senha "12345"


	@login
	Cenário: Validar login no sistema com credenciais válidas
		Quando clicar no botão Acessar
		Então deve visualizar a pagina inicial com "Bem Vindo!"

	@logininvalido
	Cenário: Validar login no sistema com credenciais inválidas
		Quando clicar no botão Acessar
		Então deve retornar mensagem "Não foi possível realizar a identificação com os dados informados."

	@logout
	Cenário: Validar logout no sistema
		Quando clicar no botão Acessar
		Então deve clicar no botão sair
		E deve visualizar a pagina inicial com "Bem Vindo!"