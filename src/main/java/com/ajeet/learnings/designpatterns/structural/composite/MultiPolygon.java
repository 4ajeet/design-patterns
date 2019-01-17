package com.ajeet.learnings.designpatterns.structural.composite;

import com.ajeet.learnings.designpatterns.structural.bridge.Geometry;

import java.util.ArrayList;
import java.util.List;

/**
 * This represents a directory or container of <code>{@link Polygon}</code>
 */
public class MultiPolygon implements IGeometry {
    private final List<Polygon> polygons = new ArrayList<>();

    public void addPolygon(Polygon geometry){
        polygons.add(geometry);
    }

    public void addPolygonList(List<Polygon> geometry){
        polygons.addAll(geometry);
    }

    public List<Polygon> getPolygons() {
        return polygons;
    }
}
