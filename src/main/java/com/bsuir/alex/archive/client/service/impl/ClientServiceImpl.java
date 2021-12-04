package com.bsuir.alex.archive.client.service.impl;

import com.bsuir.alex.archive.client.service.ClientService;
import com.bsuir.alex.archive.client.service.ServiceException;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * ClientServiceImpl class implemented ClientService
 *
 * @author Alex Shevelyanchik
 * @version 1.0
 */
public class ClientServiceImpl implements ClientService {
    private static final String HOST_NAME = "localhost";
    private static final int PORT = 8008;

    private DataInputStream inputStream;
    private DataOutputStream outputStream;

    /**
     * ClientServiceImpl Constructor
     */
    public ClientServiceImpl() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean connect(String request) throws ServiceException {
        try {
            Socket socket = new Socket(HOST_NAME, PORT);
            inputStream = new DataInputStream(socket.getInputStream());
            outputStream = new DataOutputStream(socket.getOutputStream());
            return true;
        } catch (IOException e) {
            throw new ServiceException(e);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void sendRequest(String request) throws ServiceException {
        try {
            outputStream.writeUTF(request);
        } catch (IOException e) {
            throw new ServiceException();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getResponse() throws ServiceException {
        try {
            return inputStream.readUTF();
        } catch (IOException e) {
            throw new ServiceException();
        }
    }
}
