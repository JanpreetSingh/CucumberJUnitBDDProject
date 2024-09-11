$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/resources/features/amazonCareerSearch.feature");
formatter.feature({
  "line": 1,
  "name": "Career Search Functionality Feature",
  "description": "In order to apply for job in Amazon\r\nAs a Guest\r\nI want to search for various careers in Amazon",
  "id": "career-search-functionality-feature",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 8,
      "value": "#Use JSON to pass multiple values for PARAMETERS."
    }
  ],
  "line": 9,
  "name": "Search for job vacancies as a Guest",
  "description": "",
  "id": "career-search-functionality-feature;search-for-job-vacancies-as-a-guest",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 10,
  "name": "open the url \"https://www.amazon.com/\" in the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "click on \"Careers\" link under \"Get to Know Us\" in the bottom section of the page.",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Find jobs page should open.",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user clicks on the search icon",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "Your job application page should open",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "enter the \"\u003cjob\u003e\" title and select appropriate job",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "enter the \"\u003clocation\u003e\" and select approproate location",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "click the search icon",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "a list of related job results should be displayed",
  "keyword": "Then "
});
formatter.examples({
  "line": 20,
  "name": "",
  "description": "",
  "id": "career-search-functionality-feature;search-for-job-vacancies-as-a-guest;",
  "rows": [
    {
      "cells": [
        "job",
        "location"
      ],
      "line": 21,
      "id": "career-search-functionality-feature;search-for-job-vacancies-as-a-guest;;1"
    },
    {
      "cells": [
        "Angular Developer",
        "India"
      ],
      "line": 22,
      "id": "career-search-functionality-feature;search-for-job-vacancies-as-a-guest;;2"
    },
    {
      "cells": [
        "RPA",
        "Manila"
      ],
      "line": 23,
      "id": "career-search-functionality-feature;search-for-job-vacancies-as-a-guest;;3"
    },
    {
      "cells": [
        "Testing",
        "Torronto"
      ],
      "line": 24,
      "id": "career-search-functionality-feature;search-for-job-vacancies-as-a-guest;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 22,
  "name": "Search for job vacancies as a Guest",
  "description": "",
  "id": "career-search-functionality-feature;search-for-job-vacancies-as-a-guest;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 10,
  "name": "open the url \"https://www.amazon.com/\" in the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "click on \"Careers\" link under \"Get to Know Us\" in the bottom section of the page.",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Find jobs page should open.",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user clicks on the search icon",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "Your job application page should open",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "enter the \"Angular Developer\" title and select appropriate job",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "enter the \"India\" and select approproate location",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "click the search icon",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "a list of related job results should be displayed",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 23,
  "name": "Search for job vacancies as a Guest",
  "description": "",
  "id": "career-search-functionality-feature;search-for-job-vacancies-as-a-guest;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 10,
  "name": "open the url \"https://www.amazon.com/\" in the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "click on \"Careers\" link under \"Get to Know Us\" in the bottom section of the page.",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Find jobs page should open.",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user clicks on the search icon",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "Your job application page should open",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "enter the \"RPA\" title and select appropriate job",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "enter the \"Manila\" and select approproate location",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "click the search icon",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "a list of related job results should be displayed",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 24,
  "name": "Search for job vacancies as a Guest",
  "description": "",
  "id": "career-search-functionality-feature;search-for-job-vacancies-as-a-guest;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 10,
  "name": "open the url \"https://www.amazon.com/\" in the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "click on \"Careers\" link under \"Get to Know Us\" in the bottom section of the page.",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Find jobs page should open.",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user clicks on the search icon",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "Your job application page should open",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "enter the \"Testing\" title and select appropriate job",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "enter the \"Torronto\" and select approproate location",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "click the search icon",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "a list of related job results should be displayed",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});