package com.leeyy.bean2.servlet;

import com.leeyy.bean2.dao.BookDao;
import com.leeyy.bean2.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BookServlet {
    @Autowired
    private BookService bookService;

//    private BookDao bko;

    public void doGet(){
        bookService.save();
    }

    //方法上有autowired
    //方法上的每一个参数会自动赋值
    @Autowired
    public void hahaha(BookDao bookDao){
        System.out.println("spring运行了这个方法。。。" + bookDao);

    }
}
