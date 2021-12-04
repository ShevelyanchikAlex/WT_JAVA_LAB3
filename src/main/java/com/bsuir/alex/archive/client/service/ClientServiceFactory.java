package com.bsuir.alex.archive.client.service;

import com.bsuir.alex.archive.client.service.impl.ClientServiceImpl;

/**
 * ServiceFactory class
 *
 * @author Alex Shevelyanchik
 * @version 1.0
 */
public final class ClientServiceFactory {
    /**
     * Field instance - instance of {@link ClientServiceFactory}
     */
    private static final ClientServiceFactory instance = new ClientServiceFactory();

    /**
     * Field clientService - {@link ClientServiceImpl}
     */
    private final ClientService clientService = new ClientServiceImpl();

    /**
     * Private constructor to close the ability of instantiating {@link ClientServiceFactory}.
     */
    private ClientServiceFactory() {
    }

    /**
     * Gets {@link ClientService}
     *
     * @return {@link ClientService}
     */
    public ClientService getClientService() {
        return clientService;
    }

    /**
     * Gets instance of {@link ClientServiceFactory}
     *
     * @return {@link ClientServiceFactory} instance
     */
    public static ClientServiceFactory getInstance() {
        return instance;
    }
}
