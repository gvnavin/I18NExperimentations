package com.gvnavin.i18n.experimentations.java.date;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by gnavin on 1/4/17.
 */
public class DateFormatExample {

    public static void main(String[] args) {
        printDate(Locale.UK);
        printDate(Locale.US);
        printDate(Locale.FRANCE);
        printDate(Locale.CHINA);
        printDate(Locale.JAPAN);
        printDate(new Locale("en", "IN"));
        printDate(new Locale("hi", "IN"));
    }

    private static void printDate(final Locale locale) {
        final DateFormat formatter = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
        final Date currentDate = new Date();
        final String date = formatter.format(currentDate);
        System.out.println("Date is : " + date + " in locale: " + locale);
    }

}

/*
Date is : 04-Jan-2017 in locale: en_GB
Date is : Jan 4, 2017 in locale: en_US
Date is : 4 janv. 2017 in locale: fr_FR
Date is : 2017-1-4 in locale: zh_CN
Date is : 2017/01/04 in locale: ja_JP
Date is : 4 Jan, 2017 in locale: en_IN
Date is : ४ जनवरी, २०१७ in locale: hi_IN
 */
