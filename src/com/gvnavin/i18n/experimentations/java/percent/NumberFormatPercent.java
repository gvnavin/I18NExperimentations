package com.gvnavin.i18n.experimentations.java.percent;

import java.text.MessageFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by gnavin on 1/1/17.
 */
public class NumberFormatPercent {

    public static void main(String[] args) {

        displayPercent(Locale.US);
        displayPercent(Locale.UK);
        displayPercent(Locale.GERMANY);
        displayPercent(Locale.FRANCE); //FR has space between number and percentage symbol
        displayPercent(Locale.CANADA);
        displayPercent(Locale.CHINA);
        displayPercent(Locale.JAPAN);
        displayPercent(new Locale("en", "IN"));
        displayPercent(new Locale("hi", "IN"));
    }

    private static void displayPercent(Locale currentLocale) {

        final Double percent = new Double(0.75);

        final NumberFormat percentFormatter = NumberFormat.getPercentInstance(currentLocale);
        final String percentOut = percentFormatter.format(percent);
        System.out.println(percentOut + "   " + currentLocale.toString());
    }

}
