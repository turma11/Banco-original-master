@aberturaconta
Feature: Abertura de conta


Background:
 Given que o usuario acesse a url "https://www.original.com.br/"
 And selecionar o botao abrir conta

  @pf
  Scenario Outline: Abertura de conta pessoa fisica pf

 And selecionar o botao abrir conta para voce 
 #When preencher o formulario de abertura de conta
 And preencher o campo com o nome "<nome>"
 And preencher o campo com o email "<email>"
 And preencher o campo com o cpf "<cpf>"
 And preencher o campo  com o telefone "<celular>"
 And selecionar o botao quero ser cliente
 Then  sera exibido o texto falta pouco
 
             Examples:
                      |nome    |email             | cpf            | celular   |
                      |samuel  |teste@teste.com.br|01422214060     |11111111111|
                      |joao    |teste@teste.com.br|27786240071     |11111111111|
  @pj
 Scenario: Abertura de conta pessoa juridica
 And selecionar o botao abrir conta para sua empresa
 And selecionar o botao abrir conta pessoa unica
  