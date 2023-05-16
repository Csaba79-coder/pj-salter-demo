package com.csaba79coder.pjsalterdemo.service;

import com.csaba79coder.pjsalterdemo.dto.BookDto;
import com.csaba79coder.pjsalterdemo.entity.Book;
import com.csaba79coder.pjsalterdemo.persistance.BookRepository;
import com.csaba79coder.pjsalterdemo.util.Mapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class BookService {

    private final BookRepository bookRepository;

    public List<Book> findAllBooks() {
        return bookRepository.findAll();
    }

    public Book addNewBook(BookDto bookDto) {
        return bookRepository.save(Mapper.mapBookToBookDto(bookDto));
    }
}
