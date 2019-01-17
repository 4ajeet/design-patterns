package com.ajeet.learnings.designpatterns.structural.bridge;

import org.opengis.geometry.Envelope;

import javax.imageio.IIOImage;

public final class LineString implements IRendrableGeometry {
    private final ITheme theme;

    public LineString(ITheme theme) {
        this.theme = theme;
    }

    @Override
    public IIOImage render() {
       return theme.apply(this);
    }

    @Override
    public Envelope getEnvelope() {
        return null;
    }
}
