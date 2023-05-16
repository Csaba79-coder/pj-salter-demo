package com.csaba79coder.pjsalterdemo.util;

import com.csaba79coder.pjsalterdemo.dto.BookDto;
import com.csaba79coder.pjsalterdemo.entity.Book;

public class Mapper {

    public static Book mapBookToBookDto(BookDto bookDto) {
        Book book = new Book();
        book.setTitle(bookDto.getTitle());
        book.setAuthorName(bookDto.getAuthorName());
        book.setPrice(bookDto.getPrice());
        return book;
    }

    // This is a utility class, so it should not be instantiated.
    private Mapper() {
    }
}
