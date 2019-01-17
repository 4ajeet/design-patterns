package com.ajeet.learnings.designpatterns.structural.facade;


import com.vividsolutions.jts.geom.Geometry;
import com.vividsolutions.jts.geom.util.GeometryTransformer;
import org.geotools.geometry.jts.JTS;
import org.geotools.referencing.CRS;
import org.opengis.referencing.FactoryException;
import org.opengis.referencing.crs.CoordinateReferenceSystem;
import org.opengis.referencing.operation.MathTransform;
import org.opengis.referencing.operation.TransformException;

public final class GeometryTransformerFacade {
    private final GeometryTransformer geometryTransformer;

    public GeometryTransformerFacade() {
        this.geometryTransformer = new GeometryTransformer();
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
