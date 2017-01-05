package com.gvnavin.i18n.experimentations.java.number;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * Created by gnavin on 1/4/17.
 */
public class NumberFormatExample {

    public static void main(String[] args) {
        printDifferentCurrency();
    }

    private static void printFormattedNumbers(Locale locale) {
        double dbl = 10500.3245;
        NumberFormat formatter = NumberFormat.getInstance(locale);
        String currency = formatter.format(dbl);
        System.out.println(currency + " for the locale " + locale);
    }

    private static void printDifferentCurrency() {
        printFormattedNumbers(Locale.UK);
        printFormattedNumbers(Locale.US);
        printFormattedNumbers(Locale.FRANCE);  // space and , --> 10 500,325 for the locale fr_FR
        printFormattedNumbers(Locale.GERMANY);  // .and , 10.500,325 for the locale de_DE
        printFormattedNumbers(Locale.CHINA);
        printFormattedNumbers(Locale.JAPAN);
        printFormattedNumbers(Locale.CANADA);
        printFormattedNumbers(new Locale("en", "IN"));
        printFormattedNumbers(new Locale("hi", "IN"));
    }
}

/*

10,500.325 for the locale en_GB
10,500.325 for the locale en_US
10 500,325 for the locale fr_FR
10.500,325 for the locale de_DE
10,500.325 for the locale zh_CN
10,500.325 for the locale ja_JP
10,500.325 for the locale en_CA
10,500.325 for the locale en_IN
१०,५००.३२५ for the locale hi_IN

 */