package library.repository;

import library.entity.Book;
import java.util.List;

public interface BookRepository{

    public Book addBook(Book book);

    public Book removeBook(Book book);

    public Book editBook(Book book);

    public List<Book> getAllBook();

    public List<Book> getAllBookByName(String name);


}
