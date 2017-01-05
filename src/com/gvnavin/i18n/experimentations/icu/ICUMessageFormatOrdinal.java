package com.gvnavin.i18n.experimentations.icu;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by gnavin on 1/3/17.
 */
public class ICUMessageFormatOrdinal {

    public static void main(String[] args) {

        formatOrdinalString(0);
        formatOrdinalString(1);
        formatOrdinalString(2);
        formatOrdinalString(3);
        formatOrdinalString(11);
        formatOrdinalString(99);
        formatOrdinalString(100);
    }

    private static void formatOrdinalString(final int number) {

        final ResourceBundle rb = ResourceBundle.getBundle("MessageBundle", Locale.US);
        final String pattern = rb.getString("message_format_pattern_ordinal");
        //System.out.println("pattern = " + pattern);
        final com.ibm.icu.text.MessageFormat messageFormat = new com.ibm.icu.text.MessageFormat(pattern);

        final Object[] arg = { number };
        final String formattedOrdinalString = messageFormat.format(arg);

        System.out.println("formattedOrdinalString = " + formattedOrdinalString);
    }
}

/*
formattedOrdinalString = "0th place"
formattedOrdinalString = "1st place"
formattedOrdinalString = "2nd place"
formattedOrdinalString = "3rd place"
formattedOrdinalString = "11th place"
formattedOrdinalString = "99th place"
formattedOrdinalString = "100th place"
 */