package com.bsuir.alex.archive.client;

import com.bsuir.alex.archive.client.controller.ClientController;
import com.bsuir.alex.archive.client.controller.impl.ClientControllerImpl;

import java.util.Scanner;

public class Client extends Thread {
    @Override
    public void run() {
        Scanner input = new Scanner(System.in);
        ClientController clientController = new ClientControllerImpl();

        String request;
        String response;
        clientController.executeRequest("connect");
        // add id="s5" name="Alex" address="qwerty" dateOfBirth="1999-01-01" averageGrade="1.9"
        // edit id="s1" name="Ron" address="123" dateOfBirth="2004-11-21" averageGrade="9.9"

        while (true) {
            System.out.print(">> ");
            request = input.nextLine();
            response = clientController.executeRequest(request);
            System.out.println(response);
        }
    }
}
