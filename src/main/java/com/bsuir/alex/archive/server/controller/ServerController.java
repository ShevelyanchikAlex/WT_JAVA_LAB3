package com.bsuir.alex.archive.server.controller;

import com.bsuir.alex.archive.server.bean.Account;

public interface ServerController {
    String executeRequest(String request, Account account);
}
