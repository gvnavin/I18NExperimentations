package com.gvnavin.i18n.experimentations.java.currency;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by gnavin on 1/1/17.
 */
public class MessageFormatCurrency {

    public static void main(String[] args) {

        //formattedString = "Number Currency : $3.00"
        printFormattedString("message_format_pattern_number_currency");

        //Something wrong
        printFormattedString("message_format_pattern_number_usd");
        printFormattedString("message_format_pattern_number_eur");

    }

    private static void printFormattedString(final String datePattern) {

        final ResourceBundle rb = ResourceBundle.getBundle("MessageBundle", Locale.US);

        final String pattern = rb.getString(datePattern);
        final Object[] arg = { 3 };

        //Static method - default
        final String formattedString = MessageFormat.format(pattern, arg);
        System.out.println("formattedString = " + formattedString);
    }

}
