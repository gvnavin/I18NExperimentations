package com.gvnavin.i18n.experimentations.icu;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by gnavin on 1/3/17.
 */
public class ICUMessageFormatPlural {

    //String.format is not fully internationalized, doesn't have support for plural form, select etc..,

    public static void main(String[] args) {

        formatPluralString(0);
        formatPluralString(1);
        formatPluralString(2);
        formatPluralString(99);
    }

    private static void formatPluralString(final int number) {

        final ResourceBundle rb = ResourceBundle.getBundle("MessageBundle", Locale.US);
        final String pattern = rb.getString("message_format_pattern_plural");
        //System.out.println("pattern = " + pattern);
        final com.ibm.icu.text.MessageFormat messageFormat = new com.ibm.icu.text.MessageFormat(pattern);

        final Object[] arg = { number };
        final String formattedPluralString = messageFormat.format(arg);

        System.out.println("formattedPluralString = " + formattedPluralString);
    }
}

/*
formattedPluralString = "you have no friends.";
formattedPluralString = "you have 1 friend.";
formattedPluralString = "you have 2 friends.";
formattedPluralString = "you have 99 friends.";
 */