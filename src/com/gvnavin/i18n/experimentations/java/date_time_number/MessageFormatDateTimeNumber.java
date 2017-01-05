package com.gvnavin.i18n.experimentations.java.date_time_number;

import java.text.MessageFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by gnavin on 12/30/16.
 */
public class MessageFormatDateTimeNumber {

    public static void main(String[] args) {

        printFormattedString("message_format_pattern_date_number");
        printFormattedString("message_format_pattern_time_date_number");
        printFormattedString("message_format_pattern_time_date_number_sub_format_1");
        printFormattedString("message_format_pattern_time_date_number_sub_format_2");

        System.out.println("--------------------------------------------------------");

    }

    private static void printFormattedString(final String pattern) {

        final ResourceBundle rb = ResourceBundle.getBundle("MessageBundle", Locale.US);

        final String messageFormatPatternTimeDateNumber = rb.getString(pattern);
        final String formattedStringTimeDateNumber = MessageFormat.format(messageFormatPatternTimeDateNumber,
                new Object[]{new Date(), 2}
        );
        System.out.println("formattedStringTimeDateNumber = " + formattedStringTimeDateNumber);
    }

}
