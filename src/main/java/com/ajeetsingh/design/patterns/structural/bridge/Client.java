package com.ajeetsingh.design.patterns.structural.bridge;

import com.ajeetsingh.design.patterns.structural.bridge.geom.LineString;
import com.ajeetsingh.design.patterns.structural.bridge.geom.Polygon;
import com.ajeetsingh.design.patterns.structural.bridge.geom.RendrableGeometry;
import com.ajeetsingh.design.patterns.structural.bridge.theme.RangeTheme;
import com.ajeetsingh.design.patterns.structural.bridge.theme.RasterTheme;

public final class Client {

    public static void main(String[] args) {
        RendrableGeometry polygon = new Polygon(new RangeTheme());
        polygon.render();

        RendrableGeometry lineString = new LineString(new RasterTheme());
        lineString.render();
    }
}