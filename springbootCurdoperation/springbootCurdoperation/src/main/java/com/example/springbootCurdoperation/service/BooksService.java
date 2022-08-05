package com.example.springbootCurdoperation.service;

import com.example.springbootCurdoperation.models.Books;

import java.util.List;
//we dont declare annotation here because JPA automatically provided
public interface BooksService {//if we dont know the implementation just we have requirement specification then go for interface. if we want 100% abstraction then create interface
   Books saveBooks(Books books);

   List<Books> getAllBooks();

   Books getBooksById(int id);

   Books updateBooks(Books books,int id);

   void deleteBook(int id);
}
