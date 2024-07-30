package com.chandra.Rest_Api_1.restcntroller;

import com.chandra.Rest_Api_1.binding.Book;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@RestController
public class BookController {
    //    @GetMapping("/book/{bid}")
//    public Book getBookid(@PathVariable ("bid") Integer bid) {
//        Book b=new Book(bid,"Java",123.00);
//      return b; // directly return the object
//    }
    @GetMapping("/book/{bid}")
    public ResponseEntity<Book> getBooks(@PathVariable("bid") Integer bid) {
        Book b = new Book(bid, "Java", 123.00);

        return new ResponseEntity<>(b, HttpStatus.OK);// return throgh response entity
    }
    //Using respose method
    @GetMapping("/books")
    public ResponseEntity<List<Book>> getBooks() {
        Book b1 = new Book(501, "java", 250.00);
        Book b2 = new Book(501, "java", 250.00);
        Book b3 = new Book(501, "java", 250.00);
        Book b4 = new Book(501, "java", 250.00);
        Book b5 = new Book(501, "java", 250.00);

        List<Book> books = Arrays.asList(b1, b2, b3, b4, b5);
        return new ResponseEntity<>(books, HttpStatus.OK);
    }

    @PostMapping("/book")
    public ResponseEntity<Book> savebook(@RequestBody Book books){
        System.out.println(books);
           // TO DO :save to DB
        return new ResponseEntity<>(books,HttpStatus.CREATED);
    }
    @PutMapping("/book")
    public ResponseEntity<Book> updateBook(@RequestBody Book book){
        System.out.println(book);

        return new ResponseEntity<>(book,HttpStatus.OK);
    }
    @PutMapping(value = "/book/{id}",consumes = "application/json")
    public ResponseEntity<Book> updateBookId(@PathVariable ("bid") Integer bid, Book book){
        System.out.println(book);
      // to do DB concept
        return new ResponseEntity<>(book,HttpStatus.OK);
    }
    @DeleteMapping(value = "/book/{id}",produces = "application/text/plain")
    public ResponseEntity<String> deleteBook(@PathVariable("id") Integer bid, Book book){
        System.out.println("deleted record "+bid);
        // to do DB concept
        return new ResponseEntity<>("record deleetd",HttpStatus.OK);
    }
}
