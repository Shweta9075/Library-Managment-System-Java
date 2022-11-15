package com.books;

public class Books {
    private String name;
    private String author;
    private String bookType;
    private float price;

    Books(String name, String author, String bookType, float price) {
        this.name = name;
        this.author = author;
        this.bookType = bookType;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getBookType() {
        return bookType;
    }

    public float getPrice() {
        return price;
    }

    public String toString() {
        return name + "   " + bookType+"   "+ author + "   " + price;
    }
}
