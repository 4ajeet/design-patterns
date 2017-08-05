package com.ajeetsingh.design.patterns.structural.prototype;

import com.google.common.collect.ImmutableMap;

public final class TilesFactory {
    private static final ImmutableMap<TileType, Tile> TILE_PROTOTYPES;

    static {
        TILE_PROTOTYPES = ImmutableMap.<TileType, Tile>builder()
        .put(TileType.VectorTile, new VectorTile())
        .put(TileType.RasterTile, new RasterTile())
        .build();
    }

    public static Tile getTile(TileType tileType){
        Tile tile = TILE_PROTOTYPES.get(tileType);
        return tile.clone();
    }
}
