# language: pt

  @BuscaInvalida
  Funcionalidade: Validando uma busca Inválida com caracteres especiais no site Agibank
    Cenario: Busca invalida site Agibank
      Dado que estou no site Agibank
      Quando clico na lupa de pesquisa
      E digito no campo de busca "C0mece su@ c#rreir@ em t#cnologi@ c0m o Agi!"
      E clico no botao pesquisar
      Entao deve aparecer a mensagem "Nenhum resultado"