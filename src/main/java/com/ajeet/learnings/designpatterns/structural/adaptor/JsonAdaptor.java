package com.ajeet.learnings.designpatterns.structural.adaptor;

import org.w3c.dom.Document;

import java.util.Objects;

public class JsonAdaptor implements JsonReader {
    private final XmlReader xmlReader;

    public JsonAdaptor(XmlReader xmlReader) {
        Objects.requireNonNull(xmlReader, "xmlReader cant be null.");
        this.xmlReader = xmlReader;
    }

    @Override
    public JsonObject read(String xmlText) {
        Document document = xmlReader.read(xmlText);
        return toJson(document);
    }

    private JsonObject toJson(Document document) {
        return new JsonObject();
    }
}
