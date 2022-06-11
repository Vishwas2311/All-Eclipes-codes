Feature: Flipkart login Functionality
#
#Scenario: home page degault login
#Given User is on Flipkart login page
#When User login into application using email and passward
#Then Home page is populated
#And search box is displayed


#Negative scenario.
# no need to enter Step file only one is sufficient 
# we have dynamic code also for more ID and PASS 

@SanityTest
Scenario: home page degault login
Given User is on Flipkart login page
When User login into application using "jhon" and passward "123"    
Then Home page is populated                                        
And search box is displayed "False"

# negative with another Step definition file
# here we can enter multiple data in the sign up page using 
# DATA TABLE (piping operator)

@UATTest
Scenario: home page degault login
Given User is on Flipkart login page
When User signup into application using below data
| Vishwas | Shinde | VBS@123 | Vishwasshinde745@gmail.com | PUNE | 8999334546 |

Then Home page is populated
And search box is displayed "True"


#parameterization with number of users
# need Scenario Outline & Examples
# need Pipeline Operator
 @UATTest
Scenario Outline: home page degault login
Given User is on Flipkart login page
When User signup into application using userid <userid> and pass <password>
Then Home page is populated
And search box is displayed "True"

Examples: 
|userid|password|
|user 1| pass 1 |
|user 2| pass 2 |
|user 3| pass 3 |
|user 4| pass 4 |
|user 5| pass 5 |