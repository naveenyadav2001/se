Feature: home page functionality

  #Background: Below common step
    #Given user is launch browser
    #And open url "http://localhost:8888"
    #When enter username "admin" and password "admin"
    #And click on login
    #Then title should be "admin - My Home Page - Home - vtiger CRM 5 - Commercial Open Source CRM"

  @sunil
  Scenario: Validate Marketing functionality
   Given user is launch browser
    And open url "http://localhost:8888"
    When enter username "admin" and password "admin"
    And click on login
    Then title should be "admin - My Home Page - Home - vtiger CRM 5 - Commercial Open Source CRM"
    And mouseOver on markerting
    When click on marketingaccount
    And click on plusBt
    When enter accountname
    And enter discription
    And click on saveBt
    
  @smoke
  Scenario: Validate Sales functionality
    And mouseOver on sales
    When click on salesAccount
    And click on salesplusBt
    When enter salesAccountname "sunil"
    And enter salesDiscription "xyahiiu"
    And click on salesSaveBt
