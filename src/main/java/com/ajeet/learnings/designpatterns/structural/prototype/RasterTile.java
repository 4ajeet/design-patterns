package com.ajeet.learnings.design.patterns.structural.prototype;

import java.awt.*;

/**
 * It is an expensive object to create multiple times with new keyword, it contains a complex structure
 */
public final class RasterTile implements Tile {
    private VisibilityConstraints visibilityConstraints = null;

    @Override
    public Image render() {
        return null;
    }

    @Override
    public Tile clone() throws CloneNotSupportedException {
        RasterTile rasterTile = (RasterTile) super.clone();
        rasterTile.setVisibilityConstraints(visibilityConstraints);

        return rasterTile;
    }

    @Override
    public void setVisibilityConstraints(VisibilityConstraints visibilityConstraints) {
        this.visibilityConstraints = visibilityConstraints;
    }
}
