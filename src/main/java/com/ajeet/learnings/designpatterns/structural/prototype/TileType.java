package com.ajeet.learnings.designpatterns.structural.prototype;

public enum TileType {
    VectorTile,
    RasterTile;

    public TileType getByName(String name){
        for (TileType tileType : values()){
            if(tileType.name().equals(name)){
                return tileType;
            }
        }
        throw new IllegalArgumentException("Unsupported tile type.");
    }
}
