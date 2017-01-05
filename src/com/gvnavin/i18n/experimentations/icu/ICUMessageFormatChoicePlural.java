package com.gvnavin.i18n.experimentations.icu;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by gnavin on 1/3/17.
 */
public class ICUMessageFormatChoicePlural {

    public static void main(String[] args) {

        formatChoicePluralString(0);
        formatChoicePluralString(1);
        formatChoicePluralString(2);
        formatChoicePluralString(99);
        formatChoicePluralString(100);
    }

    private static void formatChoicePluralString(final int number) {

        final ResourceBundle rb = ResourceBundle.getBundle("MessageBundle", Locale.US);
        final String pattern = rb.getString("message_format_pattern_choice_plural");
        //System.out.println("pattern = " + pattern);
        final com.ibm.icu.text.MessageFormat messageFormat = new com.ibm.icu.text.MessageFormat(pattern);

        final Object[] arg = { number };
        final String formattedString = messageFormat.format(arg);

        System.out.println("formattedString = " + formattedString);
    }
}
