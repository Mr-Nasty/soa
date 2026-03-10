/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.library;

/**
 *
 * @author devan
 */
public class Book {
    private long id;
    private String title;
    private String author;
    private String isbn;
    
    public Book(){
        
    }
    
    public Book(long id, String author, String isbn, String title){
        this.id = id;
        this.author = author;
        this.isbn = isbn;
        this.title = title;
    }
    
    public long getId(){
        return id;
    }
    public void setId(long id){
        this.id = id;
    }
    
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    
}
