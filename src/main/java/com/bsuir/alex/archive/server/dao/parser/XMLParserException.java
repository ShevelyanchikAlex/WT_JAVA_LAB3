package com.bsuir.alex.archive.server.dao.parser;

public class XMLParserException extends Throwable {
    public XMLParserException() {
    }

    public XMLParserException(String message) {
        super(message);
    }

    public XMLParserException(String message, Throwable cause) {
        super(message, cause);
    }

    public XMLParserException(Throwable cause) {
        super(cause);
    }
}
