package com.bsuir.alex.archive.client.controller.impl;

import com.bsuir.alex.archive.client.controller.ClientController;
import com.bsuir.alex.archive.client.controller.command.ClientCommandProvider;
import com.bsuir.alex.archive.client.controller.command.ClientCommand;
import com.bsuir.alex.archive.client.controller.constant.ClientControllerConstant;

/**
 * ClientControllerImpl class
 *
 * @author Alex Shevelyanchik
 * @version 1.0
 */
public class ClientControllerImpl implements ClientController {
    @Override
    public String executeRequest(String request) {
        String commandName;
        commandName = request.split("\\s+")[0];

        ClientCommand command = ClientCommandProvider.getCommandByName(commandName);

        if (command == null) {
            return ClientControllerConstant.INVALID_COMMAND_RESPONSE;
        } else {
            return command.execute(request);
        }
    }
}
