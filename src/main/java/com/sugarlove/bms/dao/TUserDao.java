package com.sugarlove.bms.dao;

import com.sugarlove.bms.entity.TUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TUserDao {
    int deleteByPrimaryKey(String userId);

    int insert(TUser record);

    int insertSelective(TUser record);

    TUser selectByPrimaryKey(String userId);

    int updateByPrimaryKeySelective(TUser record);

    int updateByPrimaryKey(TUser record);
}