package com.sugarlove.bms.service;

import com.sugarlove.bms.entity.TBook;
import com.sugarlove.bms.entity.TUser;

import java.util.List;

public interface BookBorrowHistory {
    // 借书
    void borrowBook(TUser user, List<TBook> books);

    // 还书
    void returnBook(TUser user, List<TBook> books);
}
