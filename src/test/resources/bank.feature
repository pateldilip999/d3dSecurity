Feature: New Customer

  Scenario Outline:

    Given I enter url as"http://demo.guru99.com/V1"
    Given I enter user-id as "mngr172353"
    Given I enter password as"YdUnEsu"
    When I click login button
    When I Click on new customer button
    Given enter Customer Name as"<Customer_name>"
    When I click on radio button
    Given I enter Date of Birth"<dateofbirth>"
    And I enter Address as "<address>"
    And I enter City as "<city>"
    And I enter State as "<state>"
    And I enter Pin as "<pin_no>"
    And I enter Telephone number as "<tel_no>"
    And I enter E-mail as "<email>"
    And I click submit button

    Examples:

      | Customer_name | dateofbirth | address             | city   | state     | pin_no | tel_no      | email            |
      |               | 28/04/2017  | 246 harrrow road to | kenton | Middkesex | 325514 | 07825240225 | eamail@yahoo.com |
      | Ramesh        | 28/04/2017  | 246 harrrow road    | kenton | Middkesex | 325514 | 07825240225 | eamail@yahoo.com |
      | John4         | 28/04/2017  | 246 harrrow road    | kenton | Middkesex | 325514 | 07825240225 | eamail@yahoo.com |
      | smith£$       | 28/04/2017  | 246 harrrow road    | kenton | Middkesex | 325514 | 07825240225 | eamail@yahoo.com |




