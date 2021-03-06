package com.leeyy.bean;

public class Book {
    private String bookName;
    private String author;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void myInit(){
        System.out.println("the class of book init method..");
    }
    public void myDestroy(){
        System.out.println("the class of book destroy method..");
    }
}
