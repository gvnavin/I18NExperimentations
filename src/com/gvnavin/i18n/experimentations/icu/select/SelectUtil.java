package com.gvnavin.i18n.experimentations.icu.select;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by gnavin on 1/4/17.
 */
public class SelectUtil {

    public static void formatSelectPluralString(final int number, final String gender, final String key) {

        final ResourceBundle rb = ResourceBundle.getBundle("MessageBundle", Locale.US);
        final String pattern = rb.getString(key);
        //System.out.println("pattern = " + pattern);
        final com.ibm.icu.text.MessageFormat messageFormat = new com.ibm.icu.text.MessageFormat(pattern);

        final Object[] arg = { gender, number };
        final String formattedSelectChoicePluralString = messageFormat.format(arg);

        System.out.println("formattedSelectChoicePluralString = " + formattedSelectChoicePluralString);
    }
}
