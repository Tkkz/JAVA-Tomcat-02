package com.hbzz.mapper;

import com.hbzz.domain.Book;

import java.util.List;

/**
 * Created by sssss on 2017/9/19.
 */
public interface BookMapper {

    /**
     * 查询所有图书
     * @return 图书对象集合
     */
    List<Book> findAll();
}
