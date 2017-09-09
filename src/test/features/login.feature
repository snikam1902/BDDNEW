Feature:Check user navigate to home page
  As a customer
  I can navigate to home page
  So that I can see home page

  @smoke
  Scenario:Customer can see login page

    Given Admin is on home page
    When customer click on login link
    Then  customer  navigate to login page


  Scenario Outline: Customer can see equal count
    Given Admin is on the home page
    When customer search for <keyword>
    Then customer can see equal <count>

    Examples:
      | keyword | count |
      | windows | 1     |
      | laptop  | 2     |