package com.ajeet.learnings.design.patterns.structural.bridge;

import com.ajeet.learnings.design.patterns.structural.bridge.geom.Polygon;
import com.ajeet.learnings.design.patterns.structural.bridge.geom.RendrableGeometry;
import com.ajeet.learnings.design.patterns.structural.bridge.theme.RangeTheme;
import com.ajeet.learnings.design.patterns.structural.bridge.theme.RasterTheme;
import com.ajeet.learnings.design.patterns.structural.bridge.geom.LineString;

public final class Client {

    public static void main(String[] args) {
        RendrableGeometry polygon = new Polygon(new RangeTheme());
        polygon.render();

        RendrableGeometry lineString = new LineString(new RasterTheme());
        lineString.render();
    }
}