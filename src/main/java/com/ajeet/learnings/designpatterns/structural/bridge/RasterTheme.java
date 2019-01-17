package com.ajeet.learnings.designpatterns.structural.bridge;

import javax.imageio.IIOImage;

public final class RasterTheme implements ITheme {

    @Override
    public IIOImage apply(IRendrableGeometry geometry) {
        System.out.println(this.getClass().getSimpleName() + " applied on " + geometry.getClass().getSimpleName());
        return null;
    }

}
