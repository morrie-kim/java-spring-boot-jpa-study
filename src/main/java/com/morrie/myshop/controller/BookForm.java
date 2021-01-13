package com.morrie.myshop.controller;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by morrie kim on 2020/04/09.
 */
@Getter @Setter
public class BookForm {
    private Long id;
    private String name;
    private int price;
    private int stockQuantity;

    private String author;
    private String isbn;
}
