package com.gvnavin.i18n.experimentations.java.time;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by gnavin on 1/4/17.
 */
public class TimeFormatExample {

    public static void main(String[] args) {
        printTime(Locale.UK);
        printTime(Locale.US);
        printTime(Locale.FRANCE);
        printTime(Locale.CHINA);
        printTime(Locale.JAPAN);
        printTime(new Locale("en", "IN"));
        printTime(new Locale("hi", "IN"));
    }

    private static void printTime(Locale locale) {
        DateFormat formatter = DateFormat.getTimeInstance(DateFormat.DEFAULT, locale);
        Date currentDate = new Date();
        String time = formatter.format(currentDate);
        System.out.println(time + " in locale " + locale);
    }

}

/*
15:44:46 in locale en_GB
3:44:46 PM in locale en_US
15:44:46 in locale fr_FR
15:44:46 in locale zh_CN
15:44:46 in locale ja_JP
3:44:46 PM in locale en_IN
३:४४:४६ अपराह्न in locale hi_IN
 */