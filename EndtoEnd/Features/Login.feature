Feature: Login
Scenario: Successful Login with valid credentials
Given user launch Chrome browser
When user launch URL "https://admin-demo.nopcommerce.com/login"
And user enters username as "admin@yourstore.com" and password as "ädmin"
And click on login
Then page title should be displayed "Dashboard / nopCommerce administration"
When user click on logout link
Then page titleshould be "Your store. Login" 
And close browser