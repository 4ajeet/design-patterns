package com.ajeetsingh.design.patterns.structural.composite;

import com.ajeetsingh.design.patterns.structural.bridge.geom.Geometry;

import java.util.ArrayList;
import java.util.List;

/**
 * This represents a directory or container of <code>{@link Polygon}</code>
 */
public class MultiPolygon implements Geometry {
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
