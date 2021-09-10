# Autor : Fernando GTRRZ

@stories
Feature: Proyecto choucair
  As a candidate, I got to create a new account on Utest
  @scenario1
  Scenario: Open the Utest.com website and join today
    Given than fernando wants a Utest.com account
    When he fills Utest.com site new account data
      | strName  | strLastName | strEmail            | strBirthMonth | strBirthDay | strBirthYear | strCity                     | strZip | strCountry | strOs | strVersion | strLanguage | strMobile | strModel     | strMOs     | strPass       |
      | Fernando | Gutierrez   | nuevonuevo@nada.com | May           | 27          | 1991         | Envigado Antiquia, Colombia | 050023 | Colombia   | Linux | Debian     | Spanish     | Huawei    | P20 (Huawei) | Android 10 | Choucair2021* |
    Then he create a new account