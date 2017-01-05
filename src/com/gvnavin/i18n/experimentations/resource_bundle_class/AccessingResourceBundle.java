package com.gvnavin.i18n.experimentations.resource_bundle_class;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by gnavin on 1/5/17.
 */
public class AccessingResourceBundle {

    public static void main(String[] args) {
        ResourceBundle bundle;

        bundle = ResourceBundle.getBundle("com.gvnavin.i18n.experimentations.resource_bundle_class.ExampleResourceBundle");

        System.out.println("price   : " + bundle.getObject("price"));
        System.out.println("currency: " + bundle.getObject("currency"));


        bundle = ResourceBundle.getBundle("com.gvnavin.i18n.experimentations.resource_bundle_class.ExampleResourceBundle", Locale.GERMANY);

        System.out.println("price   : " + bundle.getObject("price"));
        System.out.println("currency: " + bundle.getObject("currency"));
    }
}
