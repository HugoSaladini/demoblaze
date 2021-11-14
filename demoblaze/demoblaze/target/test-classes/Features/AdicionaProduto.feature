Feature: Teste adiciona produto

  @T002
  Scenario: User adiciona produto ao carrinho
    Given abre a pagina
    And user realiza o login
    When user seleciona o produto
    And user clica em add produto
    Then user valida produto popup de produto adicionado
