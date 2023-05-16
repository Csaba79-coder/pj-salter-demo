package com.csaba79coder.pjsalterdemo.controller;

import com.csaba79coder.pjsalterdemo.dto.BookDto;
import com.csaba79coder.pjsalterdemo.entity.Book;
import com.csaba79coder.pjsalterdemo.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:4200") // Angular app port; in case of React, change to 3000
public class BookController {

    private final BookService bookService;

    @RequestMapping(value = "/pj-salter/books",
            method = RequestMethod.GET,
            produces = "application/json")
    public ResponseEntity<List<Book>> displayAllBooks() {
        return ResponseEntity.status(200).body(bookService.findAllBooks());
    }

    @RequestMapping(value = "/pj-salter/books",
            method = RequestMethod.POST,
            produces = "application/json")
    public ResponseEntity<Book> addNewBook(@RequestBody BookDto bookDto) {
        return ResponseEntity.status(201).body(bookService.addNewBook(bookDto));
    }
}
