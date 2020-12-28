Feature: Search Feature

Background: User launches browser & open url
When user Opens "Chrome" browser using exe file "D:\\Prashant\\Automation support\\chromedriver.exe"
When user open url "http://primusbank.qedgetech.com/"
When user Enters "Admin" as Username
When user Enters "Admin" as Password
When User Clicks on Login Button

@SmokeTest
Scenario: Searh Functionality 
When user click on Branches Button webpage navigate on Branches dropdown menu
When user select "INDIA" as country
When user select "GOA" as state
When user select "GOA" as city
When user click on Search Button to find out Branches