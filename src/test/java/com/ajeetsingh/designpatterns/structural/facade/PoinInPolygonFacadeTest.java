package com.ajeetsingh.design.patterns.structural.facade;

import com.ajeet.learnings.design.patterns.structural.facade.GeometryTransformer;
import com.ajeet.learnings.design.patterns.structural.facade.PoinInPolygonFacade;
import com.ajeet.learnings.design.patterns.structural.facade.PointInPolygon;
import com.ajeet.learnings.design.patterns.structural.facade.WKTParser;
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