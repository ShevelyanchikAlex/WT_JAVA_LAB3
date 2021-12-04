package com.bsuir.alex.archive.client.controller.command.impl;

import com.bsuir.alex.archive.client.controller.command.ClientCommand;
import com.bsuir.alex.archive.client.service.ClientService;
import com.bsuir.alex.archive.client.service.ServiceException;
import com.bsuir.alex.archive.client.service.ClientServiceFactory;

/**
 * EditCommand class
 *
 * @author Alex Shevelyanchik
 * @version 1.0
 */
public class EditCommand implements ClientCommand {
    /**
     * {@inheritDoc}
     */
    @Override
    public String execute(String request) {
        ClientServiceFactory serviceFactory = ClientServiceFactory.getInstance();
        ClientService clientService = serviceFactory.getClientService();

        String response;

        try {
            clientService.sendRequest(request);
            response = clientService.getResponse();
        } catch (ServiceException e) {
            response = e.getMessage();
        }
        return response;
    }
}
