package com.bsuir.alex.archive.runner;

import com.bsuir.alex.archive.client.Client;
import com.bsuir.alex.archive.server.Server;

public class Main {
    public static void main(String[] args) {
        new Server().start();
        new Client().start();
    }
}
