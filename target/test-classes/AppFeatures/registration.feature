Feature: User Registration

#DataTable asLists Demo Scenario

Scenario: user registration with different data
  Given User is on registration page
  When User enters following user details
    | Prakash | Junior QA | Prak@gmail.com | 9878687 | Tamil Nadu |
    | Erick | Test Lead | Erick@gmail.com | 654765 | Canada |
    | Sharah | Senior QA | Sharah@gmail.com | 3565776 | Las Vegas |
  Then user registration should be successful  
  
#DataTable asMaps Demo Scenario  

 Scenario: user registration with different data with Columns
  Given User is on registration page
  When User enters following user details with Columns
    | Firstname | Lastname | E-mail | Phone No | City | 
    | Prakash | Junior QA | Prak@gmail.com | 9878687 | Tamil Nadu |
    | Erick | Test Lead | Erick@gmail.com | 654765 | Canada |
    | Sharah | Senior QA | Sharah@gmail.com | 3565776 | Las Vegas |
  Then user registration should be successful   