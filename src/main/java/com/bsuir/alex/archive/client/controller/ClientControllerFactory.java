package com.bsuir.alex.archive.client.controller;

import com.bsuir.alex.archive.client.controller.impl.ClientControllerImpl;

public class ClientControllerFactory {
    private static final ClientControllerFactory instance = new ClientControllerFactory();
    private final ClientController clientController = new ClientControllerImpl();

    private ClientControllerFactory() {
    }

    public static ClientControllerFactory getInstance() {
        return instance;
    }

    public ClientController getClientController() {
        return getClientController();
    }

}
