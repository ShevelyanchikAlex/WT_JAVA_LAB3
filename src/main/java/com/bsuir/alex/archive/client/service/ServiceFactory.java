package com.bsuir.alex.archive.client.service;

import com.bsuir.alex.archive.client.service.impl.ClientServiceImpl;

/**
 * ServiceFactory class
 *
 * @author Alex Shevelyanchik
 * @version 1.0
 */
public final class ServiceFactory {
    /**
     * Field instance - instance of {@link ServiceFactory}
     */
    private static final ServiceFactory instance = new ServiceFactory();

    /**
     * Field clientService - {@link ClientServiceImpl}
     */
    private final ClientService clientService = new ClientServiceImpl();

    /**
     * Private constructor to close the ability of instantiating {@link ServiceFactory}.
     */
    private ServiceFactory() {
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
     * Gets instance of {@link ServiceFactory}
     *
     * @return {@link ServiceFactory} instance
     */
    public static ServiceFactory getInstance() {
        return instance;
    }
}
