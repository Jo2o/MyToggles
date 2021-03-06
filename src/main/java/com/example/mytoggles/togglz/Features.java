package com.example.mytoggles.togglz;

import org.togglz.core.Feature;
import org.togglz.core.annotation.Label;
import org.togglz.core.context.FeatureContext;

public enum Features implements Feature {

    @Label("Foo")
    FOO,

    @Label("Fee")
    FEE;

    public boolean isActive() {
        return FeatureContext.getFeatureManager().isActive(this);
    }
}
