package com.bsuir.alex.archive.server.dao;

import com.bsuir.alex.archive.server.bean.Account;

public interface AccountDao {
    Account login(String login, String passwordHash) throws DaoException;
}
