package library.start;

import library.entity.Book;
import library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

@Component
public class JobExecuter {

    @Autowired
    BookRepository bookRepository;
    
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    private static final int ACTION_NAMBER = 0;
    private static final int AUTHOR_NAMBER = 1;
    private static final int NAME_NAMBER = 2;


    public void run() throws IOException {
        boolean isContinued = true;
        while(isContinued) {
            String comand = reader.readLine();
            String[] elements = comand.split(" ");
            String action = elements[ACTION_NAMBER];
            switch (action) {
                case "add":
                    if(elements.length < 3){
                        System.out.println("Not correct data. Please check if you typed name and author");
                        break;
                    }
                    Book book = createBook(elements[AUTHOR_NAMBER], elements[NAME_NAMBER]);
                    bookRepository.addBook(book);
                    break;
                case "all":
                    bookRepository.getAllBook();
                    break;
                case "edit":
                    if(elements.length < 2){
                        System.out.println("Not correct data. Please check if you typed name");
                        break;
                    }
                    onEdit(elements[AUTHOR_NAMBER]);
                    break;
                case "delete":
                    if(elements.length < 2){
                        System.out.println("Not correct data. Please check if you typed name");
                        break;
                    }
                    onDelete(elements[AUTHOR_NAMBER]);
                    break;
                case "":
                    System.out.println("You didn't choose any action, please use the next action: add, edit, delete, all, end");
                    break;
                case "end":
                    isContinued = false;
                    break;
                default:
                    System.out.println("Action \"" + action + "\" was not recognized! Please use the next action: add, edit, delete, all, end");
            }
        }
    }

    private Book createBook(String author, String name){
        Book book = new Book();
        book.setName(name);
        book.setAuthor(author);
        return book;
    }

    private void onEdit(String bookName) throws IOException {
        List<Book> listOfBook = bookRepository.getAllBookByName(bookName);
        Book book = null;
        if(listOfBook.size() == 0){
            System.out.println("Book " + bookName + " wasn't found");
        }else{
            if(listOfBook.size() == 1){
                book = listOfBook.get(0);
            }else{
                System.out.println("Please choose book wich you want to edit:");
                for(int i = 0 ; i < listOfBook.size(); i++){
                    System.out.println("   " + i + " " + listOfBook.get(i));
                }
                book = listOfBook.get(Integer.parseInt(reader.readLine()));
            }
            System.out.println("Set new name: ");
            String name = reader.readLine();
            System.out.println("Set new author: ");
            String author = reader.readLine();
            book.setAuthor(author);
            book.setName(name);
            bookRepository.editBook(book);
        }
    }

    private void onDelete(String bookName) throws IOException {
        List<Book> listOfBookForDelete = bookRepository.getAllBookByName(bookName);
        Book book = null;
        if(listOfBookForDelete.size() == 0){
            System.out.println("Book " + bookName + " wasn't found");
        }else{
            if(listOfBookForDelete.size() == 1){
                book = listOfBookForDelete.get(0);
            }else{
                System.out.println("Please choose book wich you want to edit:");
                for(int i = 0 ; i < listOfBookForDelete.size(); i++){
                    System.out.println("   " + i + " " + listOfBookForDelete.get(i));
                }
                book = listOfBookForDelete.get(Integer.parseInt(reader.readLine()));
            }
            bookRepository.removeBook(book);
        }
    }
}
