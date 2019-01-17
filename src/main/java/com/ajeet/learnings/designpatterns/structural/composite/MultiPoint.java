package com.ajeet.learnings.designpatterns.structural.composite;

import com.ajeet.learnings.designpatterns.structural.bridge.Geometry;

import java.util.ArrayList;
import java.util.List;

/**
 * This represents a directory or container of <code>{@link Point}</code>
 */
public class MultiPoint implements IGeometry {
    private final List<Point> points = new ArrayList<>();

    public void addPolygon(Point geometry){
        points.add(geometry);
    }

    public void addPointList(List<Point> geometry){
        points.addAll(geometry);
    }

    public List<Point> getPointList() {
        return points;
    }
}
