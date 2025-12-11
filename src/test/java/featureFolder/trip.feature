Feature: Verify the Makemytrip website

  Scenario Outline: Book bus Ticket
    Given user enter Url
    Then select bus Catagory
    And Enter from details "<From>"
    And Enter destination "<To>"
    Then select Date
    Then Click Search Button
    Then Filter the details based on our needs "<pickup point>" "<destination point>"
    And Select any seat
    Then select pickup and Drop point "<board>" "<drop>"
    Then Click Continue button
    Then enter the passenger details "<Name>" "<age>" "<Email>" "<Phone no>"
    Then proceed payment
    Examples:
      | From     | To      | pickup point       | destination point   | Name         | age | Email                | Phone no   | board              | drop                |
      | Chennai  | Erode   | Koyambedu          | Lakshminagar Bypass | Thirumurugan | 26  | muthu65629@gmail.com | 7812815061 | Koyambedu          | Lakshminagar Bypass |
      | Banglore | Chennai | Central Silk Board | Koyambedu           | Murugan      | 27  | muthu65629@gmail.com | 9080803980 | Central Silk Board | Koyambedu           |

