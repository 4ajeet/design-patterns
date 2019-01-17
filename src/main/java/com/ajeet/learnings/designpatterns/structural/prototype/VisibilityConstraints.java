package com.ajeet.learnings.designpatterns.structural.prototype;

import java.io.Serializable;

public final class VisibilityConstraints implements Serializable {
    private final int zoomLavel;

    public VisibilityConstraints(int zoomLavel) {
        this.zoomLavel = zoomLavel;
    }

    public int getZoomLavel() {
        return zoomLavel;
    }
}
