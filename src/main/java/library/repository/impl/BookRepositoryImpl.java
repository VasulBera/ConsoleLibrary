package library.repository.impl;

import library.entity.Book;
import library.repository.BookRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.swing.*;
import java.util.Arrays;
import java.util.List;

@Repository
@Transactional
public class BookRepositoryImpl implements BookRepository{

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public Book addBook(Book book) {
       entityManager.persist(book);
        System.out.println(book + " was edded");
       return book;
    }

    @Override
    public Book removeBook(Book book) {
        entityManager.remove(entityManager.contains(book) ? book : entityManager.merge(book));
        System.out.println(book + " was deleted");
        return book;
    }

    @Override
    public Book editBook(Book book) {
        Book mergedBook = entityManager.merge(book);
        System.out.println(book + " was edited");
        return mergedBook;
    }

    @Override
    public List<Book> getAllBook() {
        List<Book> list = entityManager.createNativeQuery("SELECT * FROM books", Book.class).getResultList();
        System.out.println("All our books:");
        for(Book book: list){
            System.out.println("   " + book + ";");
        }
        return list;
    }

    @Override
    public List<Book> getAllBookByName(String name) {
        return entityManager.createQuery("SELECT b FROM Book b WHERE b.name = ?1").setParameter(1, name).getResultList();
    }
}
