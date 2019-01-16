package com.ajeet.learnings.design.patterns.structural.facade;

import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Polygon;

import java.util.Objects;

public final class PointInPolygon {

    public final boolean isInside(Point point,
                                  Polygon polygon){
        Objects.nonNull(point);
        Objects.nonNull(polygon);
        return polygon.contains(point);
    }
}
