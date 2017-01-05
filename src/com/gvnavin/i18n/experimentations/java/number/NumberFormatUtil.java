package com.gvnavin.i18n.experimentations.java.number;

import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by gnavin on 1/4/17.
 */
public class NumberFormatUtil {

    //You can format date also
    public static void formatNumberDecimal(final double number, final String key, final String numberFormatPattern) {

        final ResourceBundle rb = ResourceBundle.getBundle("MessageBundle", Locale.US);
        final String pattern = rb.getString(key);
        final MessageFormat messageFormat = new MessageFormat(pattern);
        final NumberFormat numberFormat = new DecimalFormat(numberFormatPattern);
        messageFormat.setFormatByArgumentIndex(0, numberFormat);

        final Object[] arg = { number };
        final String formattedString = messageFormat.format(arg);

        System.out.println("formattedString = " + formattedString);

    }

}
