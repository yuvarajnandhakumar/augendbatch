@addcustomerfeature
Feature: Telecom site

  #Scenario: Scenario 1
  #Given user enters url
  #When user click on Telecom add customer
  #Then user fills the value
  #
  #Scenario: onedimlist
  #Given user enters url
  #When user click on Telecom add customer
  #Then user fills the value using onedimlist
  #| yuvaraj | n | yuvaraj@gmail.com | guduvanchery | 9996446 |
  #
  #Scenario: onedimmap
  #Given user enters url
  #When user click on Telecom add customer
  #Then user fills the value using onedimmap
  #| fname | naveen           |
  #| lname | a                |
  #| email | amrish@gmail.com |
  #
  #Scenario: twodimlist
  #Given user enters url
  #When user click on Telecom add customer
  #Then user fills the value using twodimlist
  #| yuvaraj | n | yuvaraj@gmail.com | guduvanchery   | 9996446 |
  #| Deepak  | P | deepak@gmail.com  | thirunindravur | 5896569 |
  #
  #Scenario: twodimmap
  #Given user enters url
  #When user click on Telecom add customer
  #Then user fills the value using twodimmap
  #| fname     | lname |
  #| yuvaraj   | N     |
  #| Dinesh    | P     |
  #| Bhuvanesh | Kumar |
  #| Naveen    | A     |
  #| Dhana     | D     |
  Scenario Outline: softcode
    Given user enters url
    When user click on Telecom add customer
    Then user fills the value "<fname>","<lname>","<email>"

    Examples: 
      | fname              | lname | email            |
      | yuvaraj            | n     | yuv@gmail.com    |
      | yuvarajnandhakumar | n     | amrish@gmail.com |
      | yuv@gmail.com      | n     | uyufds           |
