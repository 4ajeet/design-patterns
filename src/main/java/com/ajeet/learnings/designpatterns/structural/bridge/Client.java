package com.ajeet.learnings.designpatterns.structural.bridge;

/**
 * Decouples an abstraction from its implementation so that the two can vary independently.
 */
public final class Client {

    public static void main(String[] args) {
        IRendrableGeometry polygon = new Polygon(new RangeTheme());
        polygon.render();

        IRendrableGeometry lineString = new LineString(new RasterTheme());
        lineString.render();
    }
}