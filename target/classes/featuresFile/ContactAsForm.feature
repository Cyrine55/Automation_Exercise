@Contact
Feature: Contact Us Form
  Utilisateur souhaite assure un contact

  @Contact-As
  Scenario: Contact Us User
    Given User navigates to the application
    And Verify that home page is visible successfully
    When click on 'Contact Us' button
    Then Verify Texxt 'GET IN TOUCH' is visible
    And User enters the details into Contact Us Form fields
      | name    | Cyrine           |
      | email   | yefrni@gmail.com |
      | subject | test QA          |
      | message | message test     |
    And User Upload file
    And Click submit 'Submit' button
    And Click OK button
    Then Verify the success message 'Success! Your details have been submitted successfully.' is visible
    And Click 'Home' button
    Then Verify that landed to home page successfully
