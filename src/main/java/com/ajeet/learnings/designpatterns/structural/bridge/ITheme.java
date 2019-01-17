package com.ajeet.learnings.designpatterns.structural.bridge;

import javax.imageio.IIOImage;

/**
 * Second end of bridge
 *  RendrableGeometry => ITheme
 */
public interface ITheme {
    public IIOImage apply(IRendrableGeometry geometry);
}
