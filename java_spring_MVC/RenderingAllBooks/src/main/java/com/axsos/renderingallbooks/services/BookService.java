package com.axsos.renderingallbooks.services;

import com.axsos.renderingallbooks.models.Book;
import com.axsos.renderingallbooks.repositories.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    // returns all the books
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }
    // creates a book
    public Book createBook(Book b) {
        return bookRepository.save(b);
    }
    // retrieves a book
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }

    //delete a book
    public void deleteBook(Long id){
        bookRepository.deleteById(id);
    }

    //update a book
    public Book updateBook(Book book){
        return bookRepository.save(book);
    }
}
