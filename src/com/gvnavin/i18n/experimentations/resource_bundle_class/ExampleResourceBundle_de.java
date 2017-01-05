package com.gvnavin.i18n.experimentations.resource_bundle_class;

import java.util.ListResourceBundle;

/**
 * Created by gnavin on 1/5/17.
 */
public class ExampleResourceBundle_de extends ListResourceBundle {
    @Override
    protected Object[][] getContents() {
        return contents;
    }

    private Object[][] contents = {
            { "price"   , new Double(20.00) },
            { "currency", "EUR" },
    };
}
