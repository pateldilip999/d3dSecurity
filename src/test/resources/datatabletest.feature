Feature:

#    Scenario:
#
#    Given I enter url as "http://www.d3dsecurity.co.uk"
#    Then I click on register button
#    Given I enter firstname as "test_firstname"
#    Given I enter lastname as "test_lastname"
#    Given I enter email as "email6@yahoo.com"
#    Given I enter password as "password1"
#    Given I enter confirm password as "password1"
#    When I click on registration button
#    Then I should see my account button
#    And I should see url as "https://www.d3dsecurity.co.uk/my-account/"
#    And I should see login text
#        And I should see register text
#        And I should see username field
#        And I should see password field
#        And I should see login button
#        And I should see "lost your password?" link
#        And I should see email address field
#        And I should see register password field
#        And I should see register button

#
#    Scenario:
#      Given I enter url as "http://www.d3dsecurity.co.uk"
#      Then I click on register button
#      Given I enter firstname as ""
#      Given I enter last name as "lastname"
#      Given I enter email as "email1@yaoo.com"
#      Given I enter password as "password"
#      Given I enter confirm password as "password"
#      When I click on register button
#      Then I should see error message "first name is not valid"
#
#      Scenario:
#        Given I enter url as "http://www.d3dsecurity.co.uk"
#        Then I click on register button
#        Given I enter firstname as "firstname "
#        Given I enter last name as ""
#        Given I enter email as "email1@yaoo.com"
#        Given I enter password as "password"
#        Given I enter confirm password as "password"
#        When I click on register button
#        Then I should see error message "lastname is not valid"
#
#        Scenario:
#          Given I enter url as "http://www.d3dsecurity.co.uk"
#          Then I click on register button
#          Given I enter firstname as "firstname"
#          Given I enter last name as "lastname"
#          Given I enter email as "email"
#          Given I enter password as "password"
#          Given I enter confirm password as "password"
#          When I click on register button
#          Then I should see error message "enter valid email"
#
#          Scenario:
#            Given I enter url as "http://www.d3dsecurity.co.uk"
#            Then I click on register button
#            Given I enter firstname as "firstname"
#            Given I enter last name as "lastname"
#            Given I enter email as "email1@yaoo.com"
#            Given I enter password as "1222"
#            Given I enter confirm password as "password"
#            When I click on register button
#            Then I should see error message "password is not valid"
#
#            Scenario:
#              Given I enter url as "http://www.d3dsecurity.co.uk"
#              Then I click on register button
#              Given I enter firstname as "firstname"
#              Given I enter last name as "lastname"
#              Given I enter email as "email1@yaoo.com"
#              Given I enter password as "password"
#              Given I enter confirm password as "password"
#              When I click on register button
#              Then hen I should see error message "confirm password not matching"
#
#
#
              Scenario Outline:
                Given I enter url as "http://www.d3dsecurity.co.uk"
                Then I click on register button
                Given I enter firstname as "<firstname>"
                Given I enter lastname as "<lastname>"
                Given I enter email as "<email1>"
                Given I enter password as "<password>"
                Given I enter confirm password as "<con_password>"
                When I click on register button
                Then  I should see error_message as"<ErrorMessage>"

                Examples:

                |firstname|lastname|email|password|con_password|ErrorMessage|

                | |lastname2|email2|password2|con_password2|File name is not valid |



                

                

