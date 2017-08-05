package com.ajeetsingh.design.patterns.structural.composite;

import com.ajeetsingh.design.patterns.structural.bridge.geom.Geometry;

import java.util.ArrayList;
import java.util.List;

/**
 * This represents a directory or container of <code>{@link Point}</code>
 */
public class MultiPoint implements Geometry {
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
