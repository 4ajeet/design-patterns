package com.ajeet.learnings.designpatterns.structural.adaptor;

import org.w3c.dom.Document;

public interface XmlReader {
    public Document read(String xmlText);
}
