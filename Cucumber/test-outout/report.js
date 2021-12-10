$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/WORKSPACE/Cucumber/src/main/java/Features/DealTestdatatable.feature");
formatter.feature({
  "line": 1,
  "name": "Deal Test datatable creation",
  "description": "",
  "id": "deal-test-datatable-creation",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Free CRM Create a new deal scenario",
  "description": "",
  "id": "deal-test-datatable-creation;free-crm-create-a-new-deal-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "title of login page is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enters username and password",
  "rows": [
    {
      "cells": [
        "kirkiran11@gmail.com",
        "Ka05kw4395"
      ],
      "line": 7
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user moves to new deal page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user enters deal details",
  "rows": [
    {
      "cells": [
        "test deal",
        "1000",
        "50",
        "10"
      ],
      "line": 12
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "DealStepDefnition.user_already_on_login_page()"
});
formatter.result({
  "duration": 9807739400,
  "status": "passed"
});
formatter.match({
  "location": "DealStepDefnition.title_of_login_page_is_free_CRM()"
});
formatter.result({
  "duration": 2254347100,
  "status": "passed"
});
formatter.match({
  "location": "DealStepDefnition.user_enters_username_and_password(DataTable)"
});
formatter.result({
  "duration": 5989846200,
  "status": "passed"
});
formatter.match({
  "location": "DealStepDefnition.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 162279300,
  "status": "passed"
});
formatter.match({
  "location": "DealStepDefnition.user_is_on_hopme_page()"
});
formatter.result({
  "duration": 17606600,
  "status": "passed"
});
formatter.match({
  "location": "DealStepDefnition.user_moves_to_new_contact_page()"
});
formatter.result({
  "duration": 30063455600,
  "error_message": "org.openqa.selenium.NoSuchFrameException: No frame element found by name or id mainpanel\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-252HIRL\u0027, ip: \u0027192.168.228.224\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.13\u0027\nDriver info: driver.version: unknown\r\n\tat org.openqa.selenium.remote.RemoteWebDriver$RemoteTargetLocator.frame(RemoteWebDriver.java:885)\r\n\tat StepDefinitions.DealStepDefnition.user_moves_to_new_contact_page(DealStepDefnition.java:70)\r\n\tat ✽.Then user moves to new deal page(D:/WORKSPACE/Cucumber/src/main/java/Features/DealTestdatatable.feature:10)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "DealStepDefnition.user_enters_contacts_details(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DealStepDefnition.close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
});