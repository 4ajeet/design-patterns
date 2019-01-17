package com.ajeet.learnings.designpatterns.structural.bridge;

import org.opengis.geometry.Envelope;

import java.awt.*;

public final class Polygon implements IRendrableGeometry {
    private final ITheme theme;

    public Polygon(ITheme theme) {
       this.theme = theme;
    }

    @Override
    public Image render() {
        return null;
    }

    @Override
    public Envelope getEnvelope() {
        return null;
    }
}
