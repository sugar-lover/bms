package com.sugarlove.bms.service;


import com.sugarlove.bms.entity.TBook;
import com.sugarlove.bms.entity.TUser;

import java.util.List;

public interface UserService {
    // 注册
    void register(TUser user);

    // 登录
    void login(TUser user);

    // 借书
    void borrowBook(TUser user, List<TBook> books);

    // 还书
    void returnBook(TUser user, List<TBook> books);

    // 删
    // 改
    // 查

}
