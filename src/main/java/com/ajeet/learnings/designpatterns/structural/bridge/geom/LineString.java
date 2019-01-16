package com.ajeet.learnings.design.patterns.structural.bridge.geom;

import com.ajeet.learnings.design.patterns.structural.bridge.theme.ITheme;

import java.awt.*;

public final class LineString extends RendrableGeometry {

    public LineString(ITheme theme) {
        super(theme);
    }

    @Override
    public Image render() {
        theme.apply(this);
        return null;
    }
}
