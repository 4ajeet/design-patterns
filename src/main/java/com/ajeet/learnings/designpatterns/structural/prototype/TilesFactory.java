package com.ajeet.learnings.designpatterns.structural.prototype;

import com.google.common.collect.ImmutableMap;

public final class TilesFactory {
    private static final ImmutableMap<TileType, Tile> TILE_PROTOTYPES;

    static {
        TILE_PROTOTYPES = ImmutableMap.<TileType, Tile>builder()
        .put(TileType.VectorTile, new VectorTile())
        .put(TileType.RasterTile, new RasterTile())
        .build();
    }

    public static Tile getTile(TileType tileType)  {
        Tile tile = TILE_PROTOTYPES.get(tileType);
        try {
            return (Tile) tile.clone();
        } catch (CloneNotSupportedException ex) {
            throw new RuntimeException(ex);
        }
    }
}
