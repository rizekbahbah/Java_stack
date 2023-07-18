package com.axsos.renderingallbooks.controllers;

import com.axsos.renderingallbooks.models.Book;
import com.axsos.renderingallbooks.services.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BookController {
    private final BookService bookService;
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/books")
    public String allBooks(Model model){
//      List<Book> books = bookService.allBooks();
        ArrayList<Book> books = new ArrayList<>(bookService.allBooks());
        model.addAttribute("books", books);
        return "allBooks.jsp";
    }

    @GetMapping("books/{id}")
    public String show(@PathVariable("id") Long id, Model model){
        Book book = bookService.findBook(id);
        model.addAttribute("book", book);
        return "show.jsp";
    }
}
