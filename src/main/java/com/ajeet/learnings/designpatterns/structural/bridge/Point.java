package com.ajeet.learnings.designpatterns.structural.bridge;

import org.opengis.geometry.Envelope;

import javax.imageio.IIOImage;
import java.util.Objects;

public final class Point implements IRendrableGeometry {
    private final ITheme theme;

    public Point(ITheme theme){
        this.theme= Objects.requireNonNull(theme, "theme cant be null");
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
