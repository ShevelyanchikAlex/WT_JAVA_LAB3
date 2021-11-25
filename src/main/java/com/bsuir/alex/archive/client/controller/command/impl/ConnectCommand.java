package com.bsuir.alex.archive.client.controller.command.impl;

import com.bsuir.alex.archive.client.controller.command.Command;
import com.bsuir.alex.archive.client.service.ClientService;
import com.bsuir.alex.archive.client.service.ServiceException;
import com.bsuir.alex.archive.client.service.ServiceFactory;

public class ConnectCommand implements Command {
    @Override
    public String execute(String request) {
        System.out.println("wtf");
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        ClientService clientService = serviceFactory.getClientService();
        String response;

        try {
            response = clientService.connect(request) ? "Succes connection" : "bad";
        } catch (ServiceException e) {
            response = e.getMessage();
        }

        return response;
    }
}
