$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/AdicionaProduto.feature");
formatter.feature({
  "name": "Teste adiciona produto",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User adiciona produto ao carrinho",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@T002"
    }
  ]
});
formatter.step({
  "name": "abre a pagina",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.AddprodutoSteps.abre_a_pagina()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user realiza o login",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.AddprodutoSteps.user_realiza_o_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user seleciona o produto",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.AddprodutoSteps.user_seleciona_o_produto()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clica em add produto",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.AddprodutoSteps.user_clica_em_add_produto()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user valida produto popup de produto adicionado",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.AddprodutoSteps.user_valida_produto_popup_de_produto_adicionado()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Features/CadastrarUsuario.feature");
formatter.feature({
  "name": "Teste cadastrar usuario",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Realiza cadastro de novo ususario",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "abre a pagina inicial",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.CadastrarUsuarioSteps.abre_a_pagina_inicial()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clica em signup",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.CadastrarUsuarioSteps.clica_em_signup()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "coloca username",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.CadastrarUsuarioSteps.coloca_username()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "coloca password",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.CadastrarUsuarioSteps.coloca_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clica no botao cadastrar",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.CadastrarUsuarioSteps.clica_no_botao_cadastrar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "valida popup",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.CadastrarUsuarioSteps.valida_popup()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Features/GoogleSearch.feature");
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
formatter.uri("file:src/test/resources/Features/RemoveProduto.feature");
formatter.feature({
  "name": "Teste remove produto",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User remove produto ao carrinho",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@T003"
    }
  ]
});
formatter.step({
  "name": "abre a home",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.RemoveProdutoSteps.abre_a_home()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user efetua o login",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.RemoveProdutoSteps.user_efetua_o_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user entra na pagina do carrinho",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.RemoveProdutoSteps.user_entra_na_pagina_do_carrinho()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clica em delete produto",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.RemoveProdutoSteps.user_clica_em_delete_produto()"
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
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@T001"
    }
  ]
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