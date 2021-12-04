package com.bsuir.alex.archive.server.controller.impl;

import com.bsuir.alex.archive.server.bean.Account;
import com.bsuir.alex.archive.server.controller.ServerController;
import com.bsuir.alex.archive.server.controller.command.ServerCommand;
import com.bsuir.alex.archive.server.controller.command.ServerCommandProvider;

public class ServerControllerImpl implements ServerController {
    @Override
    public String executeRequest(String request, Account account) {
        String commandName;
        commandName = request.split("\\s+")[0];
        ServerCommand command = ServerCommandProvider.getServerCommandByName(commandName);
        return command.execute(request, account);
    }
}
