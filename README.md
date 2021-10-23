## Firebase Authentication App

### Project Overview
---------------------------------
This Authentication App consists of 4 Pages:
* Home Page
* Login Page
* Register Page
* Dashboard Page/App Owner Page

### Solution Description
----------------------------------
Email and Password based authentication app, which with the help of Google Firebase authenticates user and let them login and and create a new account for themselves.   

When the user registers for the first time, it asks user to enter E-mail ID and Password. It then validates the E-mail id and store it in Google Firebase by allocating it a unique user id. And displays Registration successful message.

If the user lefts the email and password section unfilled then, Empty Credentials message is popped up. And if the password entered is less than 5 characters then, Password too Short message is popped.  

When attempting to log-in, it authenticates the correct Email-id and password from Firebase and grants access to the app with a pop up message Login successfully.

Either user registers or login, he/she is redirected to the dashboard page and there Logout button is available, clicking onto which the user is redirected to the Home Page.

### Technical Description
------------------------------------

Technologies Used:
* XML
* Java

Setup Required:
* Android Studio
* Google Firebase

### Copyright Ownership
---------------------------------------
#### Syead Maaz Ahmed 
  * Computer Science Engineer (5th Sem)
  * Minor Specialization : Cyber security
  * Graduating Year : 2023
