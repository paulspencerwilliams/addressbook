@wip
Feature: Search and manage entries in my address book
  As me, I want to be able to add, update, delete and search
  for entries in my address book, so I can easily contact them.

  Scenario: Add and search for the first entry
    Given no entries exist
    When I create "Fred" with phone number 1234
    And I search for "Fred"
    Then I should see the following entries
      | name  | phone |
      | Fred  | 1234  |