Feature: Teste cadastrar usuario

  Scenario: Realiza cadastro de novo ususario
    Given abre a pagina inicial
    And clica em signup
    When coloca username
    And coloca password
    When clica no botao cadastrar
    Then valida popup
