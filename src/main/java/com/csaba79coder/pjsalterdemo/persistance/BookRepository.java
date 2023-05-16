package com.csaba79coder.pjsalterdemo.persistance;

import com.csaba79coder.pjsalterdemo.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    /*@Query("SELECT b FROM Book b WHERE b.authorName = ?1 AND b.price = ?2 ORDER BY b.id DESC ")
    List<Book> findBooksByAuthAndPriceOrdered(String authorName, double price);
    // or - or so not both
    List<Book> findBookByAuthorNameContainingIgnoreCaseAndPriceOrderByIdDesc(String authorName, double price);*/
}
