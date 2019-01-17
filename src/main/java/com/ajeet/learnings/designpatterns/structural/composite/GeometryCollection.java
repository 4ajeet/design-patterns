package com.ajeet.learnings.designpatterns.structural.composite;

import com.ajeet.learnings.designpatterns.structural.bridge.Geometry;

import java.util.ArrayList;
import java.util.List;

/**
 * This represents a directory or container of <code>{@link Geometry}</code>
 */
public final class GeometryCollection implements IGeometry {
    private final List<IGeometry> geometryList = new ArrayList<>();

    public void addGeometry(IGeometry geometry){
        geometryList.add(geometry);
    }

    public void addGeometryList(List<IGeometry> geometry){
        geometryList.addAll(geometry);
    }

    public List<IGeometry> getGeometryList() {
        return geometryList;
    }
}
