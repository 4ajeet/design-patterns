package com.ajeet.learnings.design.patterns.structural.facade;


import com.vividsolutions.jts.geom.Geometry;
import org.geotools.geometry.jts.JTS;
import org.geotools.referencing.CRS;
import org.opengis.referencing.FactoryException;
import org.opengis.referencing.crs.CoordinateReferenceSystem;
import org.opengis.referencing.operation.MathTransform;
import org.opengis.referencing.operation.TransformException;

public final class GeometryTransformer {
    private final com.vividsolutions.jts.geom.util.GeometryTransformer geometryTransformer;

    public GeometryTransformer() {
        this.geometryTransformer = new com.vividsolutions.jts.geom.util.GeometryTransformer();
    }

    public final Geometry transform(Geometry sourceGeometry, int coordinateReferenceSystem){
        if(sourceGeometry == null){
            return null;
        }
        try {
            CoordinateReferenceSystem sourceCRS = CRS.decode("EPSG:" + sourceGeometry.getSRID());
            CoordinateReferenceSystem targetCRS = CRS.decode("EPSG:23032");
            if (sourceCRS.equals(targetCRS)){
                return sourceGeometry;
            }
            MathTransform transform = CRS.findMathTransform(sourceCRS, targetCRS);
            return JTS.transform( sourceGeometry, transform);
        } catch (FactoryException ex) {
            throw new RuntimeException(ex);
        } catch (TransformException ex) {
            throw new RuntimeException(ex);
        }
    }
}
