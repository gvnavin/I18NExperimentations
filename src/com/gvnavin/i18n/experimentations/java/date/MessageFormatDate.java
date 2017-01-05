package com.gvnavin.i18n.experimentations.java.date;

import com.gvnavin.i18n.experimentations.java.CommonUtil;

import java.util.Date;

/**
 * Created by gnavin on 1/1/17.
 */
public class MessageFormatDate {

    public static void main(String[] args) {

        CommonUtil.printFormattedString("message_format_pattern_date_short", new Date());
        CommonUtil.printFormattedString("message_format_pattern_date_medium", new Date());
        CommonUtil.printFormattedString("message_format_pattern_date_long", new Date());
        CommonUtil.printFormattedString("message_format_pattern_date_full", new Date());
        CommonUtil.printFormattedString("message_format_pattern_date_format", new Date());

    }

}
