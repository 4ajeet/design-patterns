package com.ajeet.learnings.designpatterns.structural.bridge;

public final class RasterTheme implements ITheme {

    @Override
    public void apply(IRendrableGeometry geometry) {
        System.out.println(this.getClass().getSimpleName() + " applied on " + geometry.getClass().getSimpleName());
    }

}
