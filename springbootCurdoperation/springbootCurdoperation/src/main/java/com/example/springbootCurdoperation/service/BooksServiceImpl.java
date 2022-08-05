package com.example.springbootCurdoperation.service;

import com.example.springbootCurdoperation.models.Books;
import com.example.springbootCurdoperation.repository.BooksRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service//it is used to annotate this class  to act as a Service.Service class will have business logic.it is DAO
public class BooksServiceImpl implements BooksService{
   @Autowired//for dependency injection.i want BooksRepo to be part of my Books Service so that i can use the methods which is being provided by JPA Repository because BooksRepo extending JPA Repository
   private BooksRepo booksRepo;

   public BooksServiceImpl(BooksRepo booksRepo){
       this.booksRepo=booksRepo;
   }

   @Override
    public Books saveBooks(Books books) {
        return booksRepo.save(books);//booksRepo is memory so saving there.here save is mathod of JPA Repository
    }

    @Override
    public List<Books> getAllBooks() {
        return booksRepo.findAll();//to get all records
    }

    @Override
    public Books getBooksById(int id) {
        return booksRepo.findById(id).orElseThrow();//we can create own exception and throw
    }

    @Override
    public Books updateBooks(Books books, int id) {
         Books existingBooks=booksRepo.findById(id).orElseThrow();
         existingBooks.setBookName(books.getBookName());
         existingBooks.setBookColor(books.getBookColor());
         existingBooks.setPrice(books.getPrice());
         booksRepo.save(existingBooks);
         return existingBooks;
    }

    @Override
    public void deleteBook(int id) {
     booksRepo.findById(id).orElseThrow();//checking for id present or not
     booksRepo.deleteById(id);
    }
}
