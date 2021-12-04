package com.bsuir.alex.archive.client.controller.command;

/**
 * Command interface
 *
 * @author Alex Shevelyanchik
 * @version 1.0
 */
public interface ClientCommand {
    /**
     *
     *
     * @param request request
     * @return response
     */
    String execute(String request);
}
