package com.gvnavin.i18n.experimentations.java.currency;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * Created by gnavin on 1/4/17.
 */
public class NumberFormatCurrency {

    public static void main(String[] args) {
        printDifferentCurrency();
    }

    private static void printCurrency(Locale locale) {
        double dbl = 10500.3245;
        NumberFormat formatter = NumberFormat.getCurrencyInstance(locale);
        String currency = formatter.format(dbl);
        System.out.println(currency + " for the locale " + locale);
    }

    private static void printDifferentCurrency() {
        printCurrency(Locale.UK);
        printCurrency(Locale.US);
        printCurrency(Locale.FRANCE);
        printCurrency(Locale.GERMANY);
        printCurrency(Locale.CHINA);
        printCurrency(Locale.JAPAN);
        printCurrency(Locale.CANADA);
        printCurrency(new Locale("en", "IN"));
        printCurrency(new Locale("hi", "IN"));
    }
}

/*

£10,500.32 for the locale en_GB
$10,500.32 for the locale en_US
10 500,32 € for the locale fr_FR
10.500,32 € for the locale de_DE
￥10,500.32 for the locale zh_CN
￥10,500 for the locale ja_JP
$10,500.32 for the locale en_CA
Rs.10,500.32 for the locale en_IN
रू १०,५००.३२ for the locale hi_IN

 */