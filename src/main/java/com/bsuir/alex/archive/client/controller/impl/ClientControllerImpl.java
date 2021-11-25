package com.bsuir.alex.archive.client.controller.impl;

import com.bsuir.alex.archive.client.controller.ClientController;
import com.bsuir.alex.archive.client.controller.command.ClientCommandProvider;
import com.bsuir.alex.archive.client.controller.command.Command;

public class ClientControllerImpl implements ClientController {
    @Override
    public String executeRequest(String request) {
        String commandName;
        commandName = request.split("\\s+")[0];

        Command command = ClientCommandProvider.getCommandByName(commandName);
        if (command == null) {
            return "Invalid command\n";
        } else {
            return command.execute(request);
        }
    }
}
