package com.ajeet.learnings.design.patterns.structural.facade;

import com.vividsolutions.jts.geom.Geometry;
import com.vividsolutions.jts.io.ParseException;
import com.vividsolutions.jts.io.WKTReader;

/**
 * Utility, feature or service to parse a Well Known Text to <code>Geometry</code> object.
 */
public final class WKTParser {
    private final WKTReader wktReader;

    public WKTParser() {
        wktReader = new WKTReader();
    }

    public final Geometry parse(String geoJsonString){
        Geometry geometry = null;
        try {
            geometry = wktReader.read(geoJsonString);
        }  catch (ParseException ex) {
            throw new RuntimeException(ex);
        }
        return geometry;
    }
}
