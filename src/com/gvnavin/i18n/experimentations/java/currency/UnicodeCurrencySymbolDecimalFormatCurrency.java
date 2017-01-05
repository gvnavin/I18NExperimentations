package com.gvnavin.i18n.experimentations.java.currency;

import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by gnavin on 1/4/17.
 */
public class UnicodeCurrencySymbolDecimalFormatCurrency {

    public static void main(String[] args) {
        formatNumberDecimal(145.23);
        formatNumberDecimal(1456.2);
        formatNumberDecimal(123.23567); //rounding off with 2 decimal digits
        formatNumberDecimal(123);

    }

    //You can format date also
    private static void formatNumberDecimal(final double number) {

        final ResourceBundle rb = ResourceBundle.getBundle("MessageBundle", Locale.US);
        final String pattern = rb.getString("message_format_pattern_number_integer");
        final MessageFormat messageFormat = new MessageFormat(pattern);
        final NumberFormat numberFormat = new DecimalFormat("\u00a40000.00");
        messageFormat.setFormatByArgumentIndex(0, numberFormat);

        final Object[] arg = { number };
        final String formattedString = messageFormat.format(arg);

        System.out.println("formattedString = " + formattedString);

    }
}
