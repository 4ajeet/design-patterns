package com.ajeetsingh.design.patterns.structural.bridge.theme;

import com.ajeetsingh.design.patterns.structural.bridge.geom.RendrableGeometry;

public final class RasterTheme implements ITheme {

    @Override
    public void apply(RendrableGeometry geometry) {
        System.out.println(this.getClass().getSimpleName() + " applied on " + geometry.getClass().getSimpleName());
    }

}
