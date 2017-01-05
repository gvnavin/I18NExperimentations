package com.gvnavin.i18n.experimentations.java;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by gnavin on 1/4/17.
 */
public class CommonUtil {

    public static void printFormattedString(final String key, final Object obj) {

        final ResourceBundle rb = ResourceBundle.getBundle("MessageBundle", Locale.US);

        final String pattern = rb.getString(key);
        final Object[] arg = { obj };

        //Static method - default
        final String formattedString = MessageFormat.format(pattern, arg);
        System.out.println("formattedString = " + formattedString);
    }
}
