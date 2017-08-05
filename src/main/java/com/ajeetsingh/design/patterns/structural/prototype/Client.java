package com.ajeetsingh.design.patterns.structural.prototype;

public final class Client {

    public static void main(String[] args) {
        VectorTile vectorTile = (VectorTile) TilesFactory.getTile(TileType.VectorTile);
        vectorTile.setVisibilityConstraints(new VisibilityConstraints(100));
        vectorTile.setStyle(new IStyle() {
        });

        RasterTile rasterTile = (RasterTile) TilesFactory.getTile(TileType.RasterTile);
        rasterTile.setVisibilityConstraints(new VisibilityConstraints(2000));

    }
}
