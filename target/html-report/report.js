$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("osa.feature");
formatter.feature({
  "line": 1,
  "name": "As a osa guest try to login",
  "description": "",
  "id": "as-a-osa-guest-try-to-login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "osa login practice",
  "description": "",
  "id": "as-a-osa-guest-try-to-login;osa-login-practice",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "user entering the osa url",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "clicking on Forum button",
  "keyword": "And "
});
formatter.step({
  "line": 5,
  "name": "entering the \u003cusername\u003e and \u003cpassword\u003e",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 6
    },
    {
      "cells": [
        "mahfuz23@gmail.com",
        "12345"
      ],
      "line": 7
    },
    {
      "cells": [
        "roudro",
        "hossain"
      ],
      "line": 8
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "click on login",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "user landed on student page",
  "keyword": "Then "
});
formatter.match({
  "location": "Osa_Steps.user_entering_the_osa_url()"
});
formatter.result({
  "duration": 11018471000,
  "status": "passed"
});
formatter.match({
  "location": "Osa_Steps.clicking_on_Forum_button()"
});
formatter.result({
  "duration": 836824300,
  "status": "passed"
});
formatter.match({
  "location": "Osa_Steps.entering_the_username_and_password(DataTable)"
});
formatter.result({
  "duration": 260007800,
  "status": "passed"
});
formatter.match({
  "location": "Osa_Steps.click_on_login()"
});
formatter.result({
  "duration": 51310000,
  "status": "passed"
});
formatter.match({
  "location": "Osa_Steps.user_landed_on_student_page()"
});
formatter.result({
  "duration": 29700,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 12,
  "name": "",
  "description": "Examples: |||",
  "id": "as-a-osa-guest-try-to-login;",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
});