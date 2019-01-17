package com.ajeet.learnings.designpatterns.structural.bridge;

import org.opengis.geometry.Envelope;

import java.awt.*;

public final class LineString implements IRendrableGeometry {
    private final ITheme theme;

    public LineString(ITheme theme) {
        this.theme = theme;
    }

    @Override
    public Image render() {
        theme.apply(this);
        return null;
    }

    @Override
    public Envelope getEnvelope() {
        return null;
    }
}
