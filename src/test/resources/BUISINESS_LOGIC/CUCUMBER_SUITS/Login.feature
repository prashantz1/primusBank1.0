Feature: Login Feature

Background: User launches browser & open url
When user Opens "Chrome" browser using exe file "D:\\Prashant\\Automation support\\chromedriver.exe"
When user open url "http://primusbank.qedgetech.com/"


@SmokeTest
Scenario:  Login Functionality
When user Enters "Admin" as Username
When user Enters "Admin" as Password
When User Clicks on Login Button