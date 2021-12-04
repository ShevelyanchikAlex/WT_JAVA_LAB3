package com.bsuir.alex.archive.client.controller.command.impl;

import com.bsuir.alex.archive.client.controller.command.ClientCommand;
import com.bsuir.alex.archive.client.controller.constant.ClientControllerConstant;
import com.bsuir.alex.archive.client.service.ClientService;
import com.bsuir.alex.archive.client.service.ServiceException;
import com.bsuir.alex.archive.client.service.ClientServiceFactory;

/**
 * ConnectCommand class
 *
 * @author Alex Shevelyanchik
 * @version 1.0
 */
public class ConnectCommand implements ClientCommand {
    /**
     * {@inheritDoc}
     */
    @Override
    public String execute(String request) {
        ClientServiceFactory serviceFactory = ClientServiceFactory.getInstance();
        ClientService clientService = serviceFactory.getClientService();

        String response;

        try {
            response = clientService.connect(request) ? ClientControllerConstant.SUCCESS_CONNECT : ClientControllerConstant.BAD_CONNECT;
        } catch (ServiceException e) {
            response = e.getMessage();
        }

        return response;
    }
}
