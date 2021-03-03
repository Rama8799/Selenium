$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("MyTest.feature");
formatter.feature({
  "line": 1,
  "name": "Creating an account in facebook",
  "description": "",
  "id": "creating-an-account-in-facebook",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 2,
      "value": "# I want to use this template for my feature file"
    }
  ],
  "line": 5,
  "name": "Filling out the sign up details",
  "description": "",
  "id": "creating-an-account-in-facebook;filling-out-the-sign-up-details",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "Open the google chrome and launch the facebook sign up page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Enter the first name as \"\u003cFirst_name\u003e\" and last name as \"\u003cLast_name\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Enter the email as \"\u003cEmail_id\u003e\" and password as \"\u003cPassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Enter the birth day as \"\u003cBirth_day\u003e\" and month as \"\u003cMonth\u003e\" and year as \"\u003cYear\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Enter the gender as \"\u003cGender\u003e\" and click the sign up button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "You are able to create a Facebook account",
  "keyword": "Then "
});
formatter.examples({
  "comments": [
    {
      "line": 13,
      "value": "#Data table"
    }
  ],
  "line": 14,
  "name": "",
  "description": "",
  "id": "creating-an-account-in-facebook;filling-out-the-sign-up-details;",
  "rows": [
    {
      "cells": [
        "First_name",
        "Last_name",
        "Email_id",
        "Password",
        "Birth_day",
        "Month",
        "Year",
        "Gender"
      ],
      "line": 15,
      "id": "creating-an-account-in-facebook;filling-out-the-sign-up-details;;1"
    },
    {
      "cells": [
        "Samuel",
        "Miller",
        "sammillerjoe12@gmail.com",
        "Pass@123",
        "12",
        "Dec",
        "1989",
        "Male"
      ],
      "line": 16,
      "id": "creating-an-account-in-facebook;filling-out-the-sign-up-details;;2"
    },
    {
      "cells": [
        "Kurt",
        "Wyatt",
        "wyatt23@gmail.com",
        "Pass@@143",
        "23",
        "Oct",
        "2000",
        "Female"
      ],
      "line": 17,
      "id": "creating-an-account-in-facebook;filling-out-the-sign-up-details;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 16,
  "name": "Filling out the sign up details",
  "description": "",
  "id": "creating-an-account-in-facebook;filling-out-the-sign-up-details;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "Open the google chrome and launch the facebook sign up page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Enter the first name as \"Samuel\" and last name as \"Miller\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Enter the email as \"sammillerjoe12@gmail.com\" and password as \"Pass@123\"",
  "matchedColumns": [
    2,
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Enter the birth day as \"12\" and month as \"Dec\" and year as \"1989\"",
  "matchedColumns": [
    4,
    5,
    6
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Enter the gender as \"Male\" and click the sign up button",
  "matchedColumns": [
    7
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "You are able to create a Facebook account",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.launching_facebook_signup_page()"
});
formatter.result({
  "duration": 85070613535,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Samuel",
      "offset": 25
    },
    {
      "val": "Miller",
      "offset": 51
    }
  ],
  "location": "Steps.enter_the_firstname_and_lastname(String,String)"
});
formatter.result({
  "duration": 1209641758,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sammillerjoe12@gmail.com",
      "offset": 20
    },
    {
      "val": "Pass@123",
      "offset": 63
    }
  ],
  "location": "Steps.enter_the_email_and_password(String,String)"
});
formatter.result({
  "duration": 722171470,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12",
      "offset": 24
    },
    {
      "val": "Dec",
      "offset": 42
    },
    {
      "val": "1989",
      "offset": 60
    }
  ],
  "location": "Steps.enter_the_birth_day(String,String,String)"
});
formatter.result({
  "duration": 3378480576,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Male",
      "offset": 21
    }
  ],
  "location": "Steps.enter_the_gender_and_signup(String)"
});
formatter.result({
  "duration": 232398838,
  "status": "passed"
});
formatter.match({
  "location": "Steps.Reset_the_credential()"
});
formatter.result({
  "duration": 5473176437,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Filling out the sign up details",
  "description": "",
  "id": "creating-an-account-in-facebook;filling-out-the-sign-up-details;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "Open the google chrome and launch the facebook sign up page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Enter the first name as \"Kurt\" and last name as \"Wyatt\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Enter the email as \"wyatt23@gmail.com\" and password as \"Pass@@143\"",
  "matchedColumns": [
    2,
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Enter the birth day as \"23\" and month as \"Oct\" and year as \"2000\"",
  "matchedColumns": [
    4,
    5,
    6
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Enter the gender as \"Female\" and click the sign up button",
  "matchedColumns": [
    7
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "You are able to create a Facebook account",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.launching_facebook_signup_page()"
});
formatter.result({
  "duration": 11892394128,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Kurt",
      "offset": 25
    },
    {
      "val": "Wyatt",
      "offset": 49
    }
  ],
  "location": "Steps.enter_the_firstname_and_lastname(String,String)"
});
formatter.result({
  "duration": 249695894,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "wyatt23@gmail.com",
      "offset": 20
    },
    {
      "val": "Pass@@143",
      "offset": 56
    }
  ],
  "location": "Steps.enter_the_email_and_password(String,String)"
});
formatter.result({
  "duration": 590840931,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "23",
      "offset": 24
    },
    {
      "val": "Oct",
      "offset": 42
    },
    {
      "val": "2000",
      "offset": 60
    }
  ],
  "location": "Steps.enter_the_birth_day(String,String,String)"
});
formatter.result({
  "duration": 1455140471,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Female",
      "offset": 21
    }
  ],
  "location": "Steps.enter_the_gender_and_signup(String)"
});
formatter.result({
  "duration": 242372992,
  "status": "passed"
});
formatter.match({
  "location": "Steps.Reset_the_credential()"
});
formatter.result({
  "duration": 4099980862,
  "status": "passed"
});
});