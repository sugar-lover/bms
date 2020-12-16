package com.sugarlove.bms.dao;

import com.sugarlove.bms.entity.BookType;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BookTypeDao {
    int deleteByPrimaryKey(String userId);

    int insert(BookType record);

    int insertSelective(BookType record);

    BookType selectByPrimaryKey(String userId);

    int updateByPrimaryKeySelective(BookType record);

    int updateByPrimaryKey(BookType record);
}