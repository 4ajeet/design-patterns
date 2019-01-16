package com.ajeet.learnings.design.patterns.structural.composite;

import com.ajeet.learnings.design.patterns.structural.bridge.geom.Geometry;

import java.util.ArrayList;
import java.util.List;

/**
 * This represents a directory or container of <code>{@link Geometry}</code>
 */
public final class GeometryCollection implements Geometry {
    private final List<Geometry> geometryList = new ArrayList<>();

    public void addGeometry(Geometry geometry){
        geometryList.add(geometry);
    }

    public void addGeometryList(List<Geometry> geometry){
        geometryList.addAll(geometry);
    }

    public List<Geometry> getGeometryList() {
        return geometryList;
    }
}
