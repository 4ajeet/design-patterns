package com.ajeetsingh.design.patterns.structural.prototype;

public interface Tile extends Rendrable, Cloneable {
    public void setVisibilityConstraints(VisibilityConstraints colour);
    public Object clone() throws CloneNotSupportedException;
}
