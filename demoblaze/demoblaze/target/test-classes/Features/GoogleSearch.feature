Feature: Teste pesquisa no google

  Scenario: Pesquisar no google
    Given abre o navegador
    And user valida pagina do google
    When user interage na area de texto
    And user clica em pesquisar
    Then user navega pelo resultado
