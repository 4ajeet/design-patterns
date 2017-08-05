package com.ajeetsingh.design.patterns.structural.facade;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public final class PoinInPolygonFacadeTest {

    @Test
    public void isLocationInsideBoundary(){
        WKTParser wktParser = new WKTParser();
        GeometryTransformer geometryTransformer = new GeometryTransformer();
        PointInPolygon pointInPolygon = new PointInPolygon();

        PoinInPolygonFacade facade = new PoinInPolygonFacade(wktParser, geometryTransformer, pointInPolygon);
        String boundary = "POLYGON((1 1,5 1,5 5,1 5,1 1))"; // This is a square of 4 by 4
        String location = "POINT(3 3)";

        assertTrue(facade.isLocationInsideBoundary(location, boundary));
    }

}