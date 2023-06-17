Feature: Search by keyword
  Scenario: Searching for a term
    Given Serhiy is researching things on the internet
    When he looks up "Cucumber"
    Then he should see information about "Cucumber1231312"
