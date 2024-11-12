package com.mycompany.main;
public class Livro {
    //Attributes
    private String title, author, publisher, ISBN;
    private int edition, year;

    //Constructor
    public Livro(String title, String author, String publisher, String ISBN, int edition, int year){
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.ISBN = ISBN;
        this.edition = edition;
        this.year = year;
    }
    
    //methods
    public String getTitle(){
        return title;
    }
    
    public void setTitle(String title){
        this.title = title;
    }
    
    public String getAuthor(){
        return author;
    }
    
    public void setAuthor(String author){
        this.author = author;
    }
    
    public String getPublisher(){
        return publisher;
    }
    
    public void setPublisher(String publisher){
        this.publisher = publisher;
    }

    public String getIsbn(){
        return ISBN;
    }
    
    public void setIsbn(String ISBN){
        this.ISBN = ISBN;
    }
    
    public int getEdition(){
        return edition;
    }
    
    public void setEdition(int edition){
        this.edition = edition;
    }
    
    public int getYear(){
        return year;
    }

    public void setYear(int year){
        this.year = year;
    }
    
    @Override
    public String toString(){
        return "Title: " + title + ", Author: " + author + ", Publisher: " + publisher + ", ISBN: " + ISBN + ", Edition: " + edition + "Year: " + year;
    }






}
