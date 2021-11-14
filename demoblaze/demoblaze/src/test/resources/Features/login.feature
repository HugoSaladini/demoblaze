Feature: Teste login

  @T001
  Scenario: Realiza login
    Given user abre o browser
    And user clica em Login
    When user preenche campo de username e password
    And user clica em logar
    Then valida campo de usuario ativo
