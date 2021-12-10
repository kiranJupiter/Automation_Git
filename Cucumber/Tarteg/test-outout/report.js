$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/WORKSPACE/Cucumber/src/main/java/Features/Multiple_Scenarios.feature");
formatter.feature({
  "line": 1,
  "name": "Title of your feature",
  "description": "",
  "id": "title-of-your-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 10,
  "name": "to see rerun",
  "description": "",
  "id": "title-of-your-feature;to-see-rerun",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "yet another action",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I validate the outcomes",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "check more outcomes",
  "keyword": "And "
});
formatter.match({
  "location": "Multiple_scenario.yet_another_action()"
});
formatter.result({
  "duration": 437269700,
  "status": "passed"
});
formatter.match({
  "location": "Multiple_scenario.i_validate_the_outcomes()"
});
formatter.result({
  "duration": 545500,
  "status": "passed"
});
formatter.match({
  "location": "Multiple_scenario.check_more_outcomes()"
});
