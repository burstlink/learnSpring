package com.leeyy.bean2.service;

import com.leeyy.bean2.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service("boookService")
@Scope(value = "prototype")
public class BookService {
    @Autowired
    private BookDao bookDao;
    public void save(){
        System.out.println("BookService 调用 bookdao中的save方法");
        bookDao.save();
    }
}
