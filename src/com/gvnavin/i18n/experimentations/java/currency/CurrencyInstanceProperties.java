package com.gvnavin.i18n.experimentations.java.currency;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

/**
 * Created by gnavin on 1/4/17.
 */
public class CurrencyInstanceProperties {

    public static void main(String[] args) {

        System.out.println("Available Currencies : " + Currency.getAvailableCurrencies());

        printCurrencyProperties(Locale.US);
        printCurrencyProperties(Locale.UK);
        printCurrencyProperties(Locale.GERMANY);
        printCurrencyProperties(Locale.CHINA);
        printCurrencyProperties(new Locale("en", "IN"));
        printCurrencyProperties(new Locale("hi", "IN"));

    }

    private static void printCurrencyProperties(final Locale locale) {
        System.out.println("------------------------------------------------------------------------");
        Currency currencyInstance = Currency.getInstance(locale);

        System.out.println("locale = " + locale);
        System.out.println("currencyInstance.getCurrencyCode() = " + currencyInstance.getCurrencyCode());
        System.out.println("currencyInstance.getDisplayName() = " + currencyInstance.getDisplayName());
        System.out.println("currencyInstance.getDisplayName(locale) = " + currencyInstance.getDisplayName(locale));
        System.out.println("currencyInstance.getSymbol() = " + currencyInstance.getSymbol());
        System.out.println("currencyInstance.getSymbol(locale) = " + currencyInstance.getSymbol(locale));
        System.out.println("currencyInstance.getDefaultFractionDigits() = " + currencyInstance.getDefaultFractionDigits());
        System.out.println("currencyInstance.getNumericCode() = " + currencyInstance.getNumericCode());
    }

}
