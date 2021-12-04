package com.bsuir.alex.archive.server.controller.command;

import com.bsuir.alex.archive.server.bean.Account;

public interface ServerCommand {
    String execute(String request, Account account);
}
