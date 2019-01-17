package com.ajeet.learnings.designpatterns.structural.composite;

public final class Client {

    public static void main(String[] args) {
        GeometryCollection geometryCollection = new GeometryCollection();

        MultiPolygon multiPolygon = new MultiPolygon();
        multiPolygon.addPolygon(new Polygon());
        geometryCollection.addGeometry(multiPolygon);

        GeometryCollection geometryCollection1 = new GeometryCollection();
        geometryCollection1.addGeometry(geometryCollection);
    }
}
