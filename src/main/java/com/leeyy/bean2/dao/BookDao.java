package com.leeyy.bean2.dao;

import org.springframework.stereotype.Repository;

@Repository
public class BookDao {
    public void save(){
        System.out.println("Book被保存了");
    }
}
