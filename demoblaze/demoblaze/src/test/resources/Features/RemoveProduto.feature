Feature: Teste remove produto

  @T003
  Scenario: User remove produto ao carrinho
    Given abre a home
    And user efetua o login
    When user entra na pagina do carrinho
    Then user clica em delete produto
