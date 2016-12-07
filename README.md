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
 ![alt tag](http://url/to/img.png)
 
