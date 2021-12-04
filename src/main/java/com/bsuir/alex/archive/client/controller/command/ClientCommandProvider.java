package com.bsuir.alex.archive.client.controller.command;

import com.bsuir.alex.archive.client.controller.command.impl.*;
import com.bsuir.alex.archive.client.controller.constant.ClientControllerConstant;

import java.util.HashMap;
import java.util.Map;

/**
 * ClientCommandProvider class
 *
 * @author Alex Shevelyanchik
 * @version 1.0
 */
public class ClientCommandProvider {
    /**
     * clientCommands {@link HashMap<>} contains ClientCommands
     */
    private static final Map<String, ClientCommand> clientCommands = new HashMap<>() {
        {
            put(ClientControllerConstant.ADD_COMMAND, new AddCommand());
            put(ClientControllerConstant.CONNECT_COMMAND, new ConnectCommand());
            put(ClientControllerConstant.EDIT_COMMAND, new EditCommand());
            put(ClientControllerConstant.LOGIN_COMMAND, new LoginCommand());
            put(ClientControllerConstant.GET_COMMAND, new GetUserByIdCommand());
        }
    };

    /**
     * Private constructor to close the ability of instantiating {@link ClientCommandProvider}
     */
    private ClientCommandProvider() {
    }

    /**
     * Gets ClientCommand by name of {@link ClientCommand}
     *
     * @param name name of {@link ClientCommand}
     * @return {@link ClientCommand}
     */
    public static ClientCommand getCommandByName(String name) {
        return clientCommands.get(name);
    }
}
