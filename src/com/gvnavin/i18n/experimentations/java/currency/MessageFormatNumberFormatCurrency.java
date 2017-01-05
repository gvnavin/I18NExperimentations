package com.gvnavin.i18n.experimentations.java.currency;

import java.text.MessageFormat;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by gnavin on 1/1/17.
 */
public class MessageFormatNumberFormatCurrency {

    public static void main(String[] args) {

        //formattedString = "Number Currency : $3.00"
        formatNumberCurrency("message_format_pattern_number","USD", Locale.US, 343.567);

        //formattedString = "Number Currency : €3.00"
        formatNumberCurrency("message_format_pattern_number","EUR", Locale.UK, 343.567);

        // Locale has two types of constants,
        // 1. defines only language - Locale.GERMAN,
        // 2. defines both language and country - Locale.GERMANY
        // You should use only the Locale with both the language and country.
        // formattedString = "Number Currency : 343,57 €"
        formatNumberCurrency("message_format_pattern_number","EUR", Locale.GERMANY, 343.567);

        // formattedString = "Number Currency : Rs.343.57"
        formatNumberCurrency("message_format_pattern_number","INR",
                new Locale("en", "IN"), 343.567);

        // formattedString = "Number Currency : रू ३४३.५७"
        formatNumberCurrency("message_format_pattern_number","INR",
                new Locale("hi", "IN"), 343.567);

    }

    private static void formatNumberCurrency(final String key, final String currencyCode, final Locale locale, final double number) {

        final ResourceBundle rb = ResourceBundle.getBundle("MessageBundle", Locale.US);
        final String pattern = rb.getString(key);
        final MessageFormat messageFormat = new MessageFormat(pattern);
        final NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);

        numberFormat.setCurrency(Currency.getInstance(currencyCode));
        messageFormat.setFormatByArgumentIndex(0, numberFormat);

        final Object[] arg = { number };
        final String formattedString = messageFormat.format(arg);

        System.out.println("formattedString = " + formattedString);

    }

}
