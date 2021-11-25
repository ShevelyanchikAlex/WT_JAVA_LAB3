package com.bsuir.alex.archive.client.controller.command;

import com.bsuir.alex.archive.client.controller.command.impl.AddCommand;
import com.bsuir.alex.archive.client.controller.command.impl.ConnectCommand;
import com.bsuir.alex.archive.client.controller.command.impl.EditCommand;
import com.bsuir.alex.archive.client.controller.command.impl.LoginCommand;

import java.util.HashMap;
import java.util.Map;

public class ClientCommandProvider {
    private static final Map<String, Command> clientCommands = new HashMap<>() {
        {
            put("add", new AddCommand());
            put("connect", new ConnectCommand());
            put("edit", new EditCommand());
            put("login", new LoginCommand());
            put("get", new LoginCommand());
        }
    };

    private ClientCommandProvider() {
    }

    public static Command getCommandByName(String name) {
        return clientCommands.get(name);
    }
}
