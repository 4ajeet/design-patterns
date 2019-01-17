package com.ajeet.learnings.designpatterns.structural.bridge;

/**
 * Second end of bridge
 *  RendrableGeometry => ITheme
 */
public interface ITheme {
    public void apply(IRendrableGeometry geometry);
}
