#language: pt
@regressaoWeb
Funcionalidade: Validação do Busca Livro

  Contexto: Validação do Busca Livro
    Dado que tenha acessado a url

   @validapaginaprincipal
   Cenário: Validar Pagina Principal
     Quando acessar a pagina principal
     Então deve visualizar a pagina inicial com "Bem Vindo!"


  @buscaLivro
  Esquema do Cenario: Validar Busca do Livro <cenario>
    Quando preencher o nome do livro "<nomelivrobusca>"
    E clicar no botão Buscar
    Então deve exibir o livro com "<nomedolivro>" "<valor>"
  Exemplos:
    | cenario | nomelivrobusca     | nomedolivro                               | valor    |
    | Livro 1 | Fortaleza Digital  | [PRODUTO DE EXEMPLO] - Fortaleza Digital  | R$519,90 |
    | Livro 2 | pipas              | [PRODUTO DE EXEMPLO] - O Caçador de Pipas | R$223,50 |
