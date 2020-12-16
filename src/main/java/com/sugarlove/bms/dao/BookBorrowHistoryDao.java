package com.sugarlove.bms.dao;

import com.sugarlove.bms.entity.BookBorrowHistory;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BookBorrowHistoryDao {
    int deleteByPrimaryKey(Integer id);

    int insert(BookBorrowHistory record);

    int insertSelective(BookBorrowHistory record);

    BookBorrowHistory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BookBorrowHistory record);

    int updateByPrimaryKey(BookBorrowHistory record);
}