# language: pt

  @BuscaValida
  Funcionalidade: Validando uma busca válida no site Agibank
    Cenario: Busca valida site Agibank
      Dado que estou no site Agibank
      Quando clico na lupa de pesquisa
      E digito no campo de busca "Comece sua carreira em tecnologia com o Agi!"
      E clico no botao pesquisar
      Entao deve aparecer o blog "Comece sua carreira em tecnologia"