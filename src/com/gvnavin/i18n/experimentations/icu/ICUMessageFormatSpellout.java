package com.gvnavin.i18n.experimentations.icu;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by gnavin on 1/3/17.
 */
public class ICUMessageFormatSpellout {

    public static void main(String[] args) {

        formatSpelloutString(0);
        formatSpelloutString(1);
        formatSpelloutString(2);
        formatSpelloutString(3);
        formatSpelloutString(11);
        formatSpelloutString(99);
        formatSpelloutString(100);
    }

    private static void formatSpelloutString(final int number) {

        final ResourceBundle rb = ResourceBundle.getBundle("MessageBundle", Locale.US);
        final String pattern = rb.getString("message_format_pattern_spellout");
        //System.out.println("pattern = " + pattern);
        final com.ibm.icu.text.MessageFormat messageFormat = new com.ibm.icu.text.MessageFormat(pattern);

        final Object[] arg = { number };
        final String formattedSpelloutString = messageFormat.format(arg);

        System.out.println("formattedSpelloutString = " + formattedSpelloutString);
    }
}

/*

formattedSpelloutString = "0 spelling is zero"
formattedSpelloutString = "1 spelling is one"
formattedSpelloutString = "2 spelling is two"
formattedSpelloutString = "3 spelling is three"
formattedSpelloutString = "11 spelling is eleven"
formattedSpelloutString = "99 spelling is ninety-nine"
formattedSpelloutString = "100 spelling is one hundred"

 */