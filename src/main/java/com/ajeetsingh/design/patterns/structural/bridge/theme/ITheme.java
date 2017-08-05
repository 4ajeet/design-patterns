package com.ajeetsingh.design.patterns.structural.bridge.theme;

import com.ajeetsingh.design.patterns.structural.bridge.geom.RendrableGeometry;

/**
 * Second end of bridge
 *  RendrableGeometry => ITheme
 */
public interface ITheme {
    public void apply(RendrableGeometry geometry);
}
