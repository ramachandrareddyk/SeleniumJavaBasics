$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Login Feature",
  "description": "",
  "id": "free-crm-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Free CRM Login Test Scenario",
  "description": "",
  "id": "free-crm-login-feature;free-crm-login-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is already on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of Login page Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Usr enters \"vijayreddy\" and \"Reddy@123\"",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user clicks on login Button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user on Homepage",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDeffination.user_is_already_on_login_page()"
});
formatter.result({
  "duration": 19005897356,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDeffination.title_of_Login_page_Free_CRM()"
});
formatter.result({
  "duration": 30490058,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "vijayreddy",
      "offset": 12
    },
    {
      "val": "Reddy@123",
      "offset": 29
    }
  ],
  "location": "LoginStepDeffination.usr_enters_username_and_password(String,String)"
});
formatter.result({
  "duration": 269015231,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDeffination.user_clicks_on_login_Button()"
});
formatter.result({
  "duration": 5850858901,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDeffination.user_on_Homepage()"
});
formatter.result({
  "duration": 15059427,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDeffination.close_the_browser()"
});
formatter.result({
  "duration": 719122914,
  "status": "passed"
});
});