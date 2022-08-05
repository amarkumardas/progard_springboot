package com.example.springbootCurdoperation.controller;

import com.example.springbootCurdoperation.models.Books;
import com.example.springbootCurdoperation.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")//it is used for mapping http request.it can be used at class level
public class BooksController {
    @Autowired//for dependency injection.we want BooksService to be part of this class so it is injected and we can use without creating object
    private BooksService booksService;

    public BooksController(BooksService booksService){
     this.booksService=booksService;
 }

    @PostMapping//it should be always above THE method ie. AT METHOD LEVEL . it is used for creation
    public ResponseEntity<Books> saveBooks(@RequestBody Books books){//ResponseEntity represents Http response including headers,body,status.we will get data in the form of ResponseEntity
        return new ResponseEntity<Books>(booksService.saveBooks(books), HttpStatus.CREATED);//here we are creating and saving data in db
    }                                                               //if it si created the status will be 201 Ok
    @GetMapping
    public List<Books> getAllBooks(){
     return booksService.getAllBooks();
     }

     @GetMapping("{id}")
     public ResponseEntity<Books> getBooksById(@PathVariable("id") int id){
     return new ResponseEntity<Books>(booksService.getBooksById(id),HttpStatus.OK);
     }

     @PutMapping("{id}")//for updation we can also use postmapping which work in same manner
     public ResponseEntity<Books> updateBooks(@PathVariable("id")int id,@RequestBody Books books){
     return new ResponseEntity<Books>(booksService.updateBooks(books,id),HttpStatus.OK);
     }
     @DeleteMapping("{id}")
     public ResponseEntity<String> deleteBooks(@PathVariable("id")int id){
     booksService.deleteBook(id);
     return new ResponseEntity<String>("Books deleted successfully",HttpStatus.OK);
     }


}
