package com.bsuir.alex.archive.client.controller.command.impl;

import com.bsuir.alex.archive.client.controller.command.Command;
import com.bsuir.alex.archive.client.service.ClientService;
import com.bsuir.alex.archive.client.service.ServiceException;
import com.bsuir.alex.archive.client.service.ServiceFactory;

public class GetUserByIdCommand implements Command {
    @Override
    public String execute(String request) {
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
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
