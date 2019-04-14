$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Manir/eBayBDD/eBayCucumber/src/main/java/feature/Register.feature");
formatter.feature({
  "line": 2,
  "name": "Register Feature",
  "description": "",
  "id": "register-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@FunctionalTest"
    }
  ]
});
formatter.scenario({
  "line": 3,
  "name": "Register Feature test",
  "description": "",
  "id": "register-feature;register-feature-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user in the register page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "put first name",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "put last name",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "provide email address",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "give password",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "click create account button",
  "keyword": "Then "
});
formatter.match({
  "location": "RegisterSteps.user_in_the_register_page()"
});
formatter.result({
  "duration": 8201604104,
  "status": "passed"
});
formatter.match({
  "location": "RegisterSteps.put_first_name()"
});
formatter.result({
  "duration": 631113954,
  "status": "passed"
});
formatter.match({
  "location": "RegisterSteps.put_last_name()"
});
formatter.result({
  "duration": 130518460,
  "status": "passed"
});
formatter.match({
  "location": "RegisterSteps.provide_email_address()"
});
formatter.result({
  "duration": 548597703,
  "status": "passed"
});
formatter.match({
  "location": "RegisterSteps.give_password()"
});
formatter.result({
  "duration": 227134213,
  "status": "passed"
});
formatter.match({
  "location": "RegisterSteps.click_create_account_button()"
});
formatter.result({
  "duration": 31416024803,
  "status": "passed"
});
});