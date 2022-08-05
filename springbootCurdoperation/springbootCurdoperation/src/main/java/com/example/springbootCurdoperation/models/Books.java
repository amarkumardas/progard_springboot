package com.example.springbootCurdoperation.models;
import lombok.Data;

import javax.persistence.*;

@Data //this is lombok library used to avoid boilerplate code ie.getter and setters
@Entity //to make this class as table of db this annotation is used
@Table(name="BooksDetails")//to set name of table if we dont use this annotation then by default name of table will be class name ie. Books .it is optional annotation
public class Books {//this wiil be treated as table of db
    @Id //it is used to make column as primary key
    @GeneratedValue(strategy = GenerationType.AUTO)//to allow primary key value automatically generated
    private int id;//this column will become primary key
    @Column(nullable = false)//means column cannot be null
    private String bookName;
    @Column(nullable = false)
    private String price;
    @Column(nullable = false)
    private String bookColor;
}
