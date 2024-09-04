package com.ajitesh.BookStore.service;
import java.util.List;
import java.util.Optional;
import com.ajitesh.BookStore.domain.Book;

public interface BookService {

    boolean isBookExists(Book book);

    Book save(Book book);

    Optional<Book> findById(String isbn);

    List<Book> listBooks();

    void deleteBookById(String isbn);
}
