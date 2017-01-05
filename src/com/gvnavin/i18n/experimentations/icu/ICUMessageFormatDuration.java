package com.gvnavin.i18n.experimentations.icu;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by gnavin on 1/3/17.
 */
public class ICUMessageFormatDuration {

    public static void main(String[] args) {

        formatDurationString(0);
        formatDurationString(1);
        formatDurationString(2);
        formatDurationString(3);
        formatDurationString(11);
        formatDurationString(100);
        formatDurationString(1000);
        formatDurationString(10000);
        formatDurationString(100000);
    }

    private static void formatDurationString(final int number) {

        final ResourceBundle rb = ResourceBundle.getBundle("MessageBundle", Locale.US);
        final String pattern = rb.getString("message_format_pattern_duration");
        //System.out.println("pattern = " + pattern);
        final com.ibm.icu.text.MessageFormat messageFormat = new com.ibm.icu.text.MessageFormat(pattern);

        final Object[] arg = { number };
        final String formatDurationString = messageFormat.format(arg);

        System.out.println("formatDurationString = " + formatDurationString);
    }
}

/*
formatDurationString = "Duration: 0 sec."
formatDurationString = "Duration: 1 sec."
formatDurationString = "Duration: 2 sec."
formatDurationString = "Duration: 3 sec."
formatDurationString = "Duration: 11 sec."
formatDurationString = "Duration: 1:40"
formatDurationString = "Duration: 16:40"
formatDurationString = "Duration: 2:46:40"
formatDurationString = "Duration: 27:46:40"
 */