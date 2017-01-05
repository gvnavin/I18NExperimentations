package com.gvnavin.i18n.experimentations;

import java.util.*;

/**
 * Created by gnavin on 12/30/16.
 */
public class LocaleProperties {

    public static void main(String[] args) {

        final Locale[] availableLocales = Locale.getAvailableLocales();
        System.out.println("Available Locales");
        for (final Locale availableLocale : availableLocales) {
            System.out.println(availableLocale);
        }
        System.out.println("------------------------------------------");

        printLocalDetails(Locale.getDefault());
        printLocalDetails(Locale.US);
        printLocalDetails(Locale.FRANCE);
        printLocalDetails(Locale.GERMANY);
        printLocalDetails(new Locale("en","IN"));
        printLocalDetails(new Locale("hi","IN"));

    }

    private static void printLocalDetails(final Locale locale) {
        System.out.println(locale.getDisplayCountry());
        System.out.println(locale.getDisplayLanguage());
        System.out.println(locale.getDisplayName());
        System.out.println(locale.getISO3Country());
        System.out.println(locale.getISO3Language());
        System.out.println(locale.getLanguage());
        System.out.println(locale.getCountry());
        System.out.println("--------------------------------------------------");
    }
}
