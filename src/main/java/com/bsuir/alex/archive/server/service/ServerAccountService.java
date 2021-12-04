package com.bsuir.alex.archive.server.service;

import com.bsuir.alex.archive.server.bean.Account;

public interface ServerAccountService {
    Account login(String login, String password) throws ServerServiceException;
}
