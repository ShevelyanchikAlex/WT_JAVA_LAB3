package com.bsuir.alex.archive.client.service;

/**
 * ClientService class
 *
 * @author Alex Shevelyanchik
 * @version 1.0
 */
public interface ClientService {

    boolean connect(String request) throws ServiceException;

    void sendRequest(String request) throws ServiceException;

    String getResponse() throws ServiceException;
}
