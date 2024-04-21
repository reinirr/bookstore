package me.neatomaru.bookstore.models;

import lombok.Data;

import java.util.Date;

@Data
public class Book {
    private int id;
    private String title;
    private String author;
    private Date date;
    private String description;
    private String imageUrl;
    private int price;
    private Tag tag;
}
