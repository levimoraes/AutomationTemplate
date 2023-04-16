#language: en
#encoding: UTF-8
@TestAutomationDemo
Feature: Create Account

  Background:
    Given are on the application's page

  @login
  Scenario: Happy Path
    And type on Name field
    And click on Cadastrar


