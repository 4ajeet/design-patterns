package com.ajeetsingh.design.patterns.structural.bridge.geom;

import com.ajeetsingh.design.patterns.structural.bridge.theme.ITheme;

import java.awt.*;

public final class Point extends RendrableGeometry {

    public Point(ITheme theme) {
        super(theme);
    }

    @Override
    public Image render() {
        theme.apply(this);
        return null;
    }

}
