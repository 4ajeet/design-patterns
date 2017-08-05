package com.ajeetsingh.design.patterns.structural.prototype;

import java.awt.*;

/**
 * It is an expensive object to create multiple times with new keyword, it contains a complex structure
 *
 */
public class VectorTile implements Tile {
    private VisibilityConstraints visibilityConstraints = null;
    private IStyle style = null;

    @Override
    public Image render() {
        System.out.println(this.getClass().getSimpleName() + " rendered at zoom level " + visibilityConstraints.getZoomLavel() + " !!!");
        return null;
    }

    @Override
    public void setVisibilityConstraints(VisibilityConstraints colour) {
        this.visibilityConstraints = visibilityConstraints;
    }

    @Override
    public Tile clone() throws CloneNotSupportedException {
        VectorTile vectorTile = (VectorTile) super.clone();
        vectorTile.setStyle(style);
        vectorTile.setVisibilityConstraints(visibilityConstraints);

        return vectorTile;
    }

    public void setStyle(IStyle style) {
        this.style = style;
    }
}
