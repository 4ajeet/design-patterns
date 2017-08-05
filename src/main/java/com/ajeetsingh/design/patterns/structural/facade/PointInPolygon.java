package com.ajeetsingh.design.patterns.structural.facade;

import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Polygon;

public final class PointInPolygon {

    public final boolean isInside(Point point, Polygon polygon){
        return polygon.contains(point);
    }
}
