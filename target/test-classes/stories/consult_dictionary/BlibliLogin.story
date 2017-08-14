Meta:

Narrative:
In order to be able to buy in blibli
As a customer
I want to be able to login


Scenario: Go to blibli site and login
Given open home page
When I login to blibli
Then I can see my name in the site

Given already login
When I search for ayam
Then I can see ayam's detail

Given already choose ayam
When I choose to pay with Klik BCA
Then I submit the payment