package com.ajeet.learnings.designpatterns.structural.composite;

import com.ajeet.learnings.designpatterns.structural.bridge.Geometry;

import java.util.ArrayList;
import java.util.List;

/**
 * This represents a director or container of <code>{@link LineString}</code>
 */
public class MultiLineString implements IGeometry {
    private final List<LineString> lineStrings = new ArrayList<>();

    public void addLineString(LineString geometry){
        lineStrings.add(geometry);
    }

    public void addLineStringList(List<LineString> geometry){
        lineStrings.addAll(geometry);
    }

    public List<LineString> getLinStringList() {
        return lineStrings;
    }
}
