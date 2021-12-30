package com.example.mytoggles.togglz;

import org.togglz.core.Feature;
import org.togglz.core.annotation.Label;

public enum Features implements Feature {

    @Label("Foo")
    FOO,

    @Label("Fee")
    FEE,

}
