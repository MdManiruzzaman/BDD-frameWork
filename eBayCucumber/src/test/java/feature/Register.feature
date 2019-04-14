@FunctionalTest
Feature: Register Feature
Scenario: Register Feature test

Given user in the register page
Then put first name
Then put last name
Then provide email address
Then give password
Then click create account button