package com.ajeetsingh.design.patterns.structural.facade;

import com.sun.istack.internal.NotNull;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Polygon;

public final class PointInPolygon {

    public final boolean isInside(@NotNull Point point,
                                  @NotNull Polygon polygon){
        return polygon.contains(point);
    }
}
