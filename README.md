# ConsoleLibrary
Console Library application was created for managing books from console

1. For using this application you must have SQL Server 2012 or later, and also you have to type your credential for you DB: username and password in database.properties
  
2. Availble the next action:
     - add - for add book to the DB;
     - all - for showing all books that we have in DB;
     - edit - for edit book;
     - delete - for delete book;
     - end - for finishing application;

 
 If you will type wrong command, such as: "ads" or "edt" or somthing else you will see message about it:
 "Action "ads" was not recognized! Please use the next action: add, edit, delete, all, end"
 
 If you forget type name or author of the book wich you want to add to DB, you will get a message:
 "Not correct data. Please check if you typed name and author"
 
 If you will delete or edit book that no in DB you will get message:
 "Book "Gaspar" wasn't found"
 
 The last command to close application is "end", after that it will print the next message: "BYE BYE!"
 
 
 Step by step guid:
 
 When you start application you will find the next message:
 ![1](https://cloud.githubusercontent.com/assets/17764981/20968339/b930c7ea-bc8c-11e6-8c81-a8f7edf14ea3.jpg)
 
 Exaple of using "all" command:
 ![2](https://cloud.githubusercontent.com/assets/17764981/20968380/faa86eda-bc8c-11e6-9ab6-b91c7f45fa49.jpg)
 
  Exaple of using "add" command (we add book with name = "Kobzar" and author = "Shevchenko"):
  ![3](https://cloud.githubusercontent.com/assets/17764981/20968413/2773b1a4-bc8d-11e6-9f9d-4fe3d12cc08c.jpg)
 
 Example of editing book. We have 2 books in DB: Shevchenko "Kobzar" and ShevchenkoSecond "Kobzar", and we want to change book  ShevchenkoSecond "Kobzar" into ShevchenkoEdit "Kobzar":
 
  ![4](https://cloud.githubusercontent.com/assets/17764981/20968492/774784d0-bc8d-11e6-8126-721f59fe54ff.jpg)

 Example of delete book:                                                                                     
  ![5](https://cloud.githubusercontent.com/assets/17764981/20968586/c2241de2-bc8d-11e6-8297-e3e164f42928.jpg)

 Example of empty command:                                                                                 
  ![6](https://cloud.githubusercontent.com/assets/17764981/20968594/cbec05b0-bc8d-11e6-8388-addf769bc2c2.jpg)

 Example of wrong command:                                                                                    
  ![7](https://cloud.githubusercontent.com/assets/17764981/20968595/ccf9a9c6-bc8d-11e6-8876-a63b606684aa.jpg)

 Example of wrong data (missing name of author of book):                                                     
  ![8](https://cloud.githubusercontent.com/assets/17764981/20968597/ce753752-bc8d-11e6-847d-15dfd712a989.jpg)

 Example when you want to delete or edit book with is not in DB:                                                
  ![9](https://cloud.githubusercontent.com/assets/17764981/20968600/d021f900-bc8d-11e6-9041-459d513098f9.jpg)

 Example "end" command:                                                                                         
  ![10](https://cloud.githubusercontent.com/assets/17764981/20968602/d1702336-bc8d-11e6-8001-c388e4b6027e.jpg)

 
