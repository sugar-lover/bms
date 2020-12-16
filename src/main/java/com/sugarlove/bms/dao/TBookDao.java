package com.sugarlove.bms.dao;

import com.sugarlove.bms.entity.TBook;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TBookDao {
    int deleteByPrimaryKey(String userId);

    int insert(TBook record);

    int insertSelective(TBook record);

    TBook selectByPrimaryKey(String userId);

    int updateByPrimaryKeySelective(TBook record);

    int updateByPrimaryKey(TBook record);
}