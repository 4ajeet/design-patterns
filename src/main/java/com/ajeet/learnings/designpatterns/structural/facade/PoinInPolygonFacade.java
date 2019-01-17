package com.ajeet.learnings.designpatterns.structural.facade;


import com.vividsolutions.jts.geom.Geometry;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Polygon;

/**
 * This class works as a Facade design pattern - hides the complexity for client
 */
public final class PoinInPolygonFacade {
    private final WKTParser wktParser;
    private final GeometryTransformerFacade geometryTransformer;
    private final PointInPolygon pointInPolygon;

    public PoinInPolygonFacade(WKTParser wktParser, GeometryTransformerFacade geometryTransformer, PointInPolygon pointInPolygon) {
        this.wktParser = wktParser;
        this.geometryTransformer = geometryTransformer;
        this.pointInPolygon = pointInPolygon;
    }

    public final boolean isLocationInsideBoundary(String locationWkt, String boundaryWkt){
        Geometry location = wktParser.parse(locationWkt);
        Geometry boundary = wktParser.parse(boundaryWkt);

        //This check is not required for WKT format, because WKT does not support to provide a SRID
        //This is just for demo purpose, this will be usefull in other formats - like GeoJSON
        if(location.getSRID() != boundary.getSRID()){
            location = geometryTransformer.transform(location, boundary.getSRID());
        }
        return pointInPolygon.isInside((Point)location, (Polygon)boundary);
    }
}
