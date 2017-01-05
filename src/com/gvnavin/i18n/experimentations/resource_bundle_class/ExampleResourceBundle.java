package com.gvnavin.i18n.experimentations.resource_bundle_class;

import java.util.ListResourceBundle;

/**
 * Created by gnavin on 1/5/17.
 */
public class ExampleResourceBundle extends ListResourceBundle {
    @Override
    protected Object[][] getContents() {
        return contents;
    }

    private Object[][] contents = {
            { "price"   , new Double(10.00) },
            { "currency", "USD" },
    };
}
