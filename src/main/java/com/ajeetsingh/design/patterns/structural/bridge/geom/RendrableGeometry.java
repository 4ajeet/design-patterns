package com.ajeetsingh.design.patterns.structural.bridge.geom;

import com.ajeetsingh.design.patterns.structural.bridge.theme.ITheme;

import java.awt.*;

/**
 * First end of bridge
 *  RendrableGeometry => ITheme
 */
public abstract class RendrableGeometry implements Geometry {
    protected final ITheme theme;

    public RendrableGeometry(ITheme theme) {
        this.theme = theme;
    }

    public abstract Image render();
}
