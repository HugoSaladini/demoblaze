$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/GoogleSearch.feature");
formatter.feature({
  "name": "Teste pesquisa no google",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Pesquisar no google",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "abre o navegador",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.GoogleSearchSteps.abre_o_navegador()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user valida pagina do google",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.GoogleSearchSteps.user_valida_pagina_do_google()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user interage na area de texto",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.GoogleSearchSteps.user_interage_na_area_de_texto()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clica em pesquisar",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.GoogleSearchSteps.user_clica_em_pesquisar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navega pelo resultado",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.GoogleSearchSteps.user_navega_pelo_resultado()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Features/login.feature");
formatter.feature({
  "name": "Teste login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Realiza login",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user abre o browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.LoginSteps.user_abre_o_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clica em Login",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.LoginSteps.user_clica_em_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user preenche campo de username e password",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.LoginSteps.user_preenche_campo_de_username_e_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clica em logar",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.LoginSteps.user_clica_em_logar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "valida campo de usuario ativo",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.LoginSteps.valida_campo_de_usuario_ativo()"
});
formatter.result({
  "status": "passed"
});
});