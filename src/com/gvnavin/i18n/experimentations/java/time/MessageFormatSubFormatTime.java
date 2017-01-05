package com.gvnavin.i18n.experimentations.java.time;

import com.gvnavin.i18n.experimentations.java.CommonUtil;

import java.util.Date;

/**
 * Created by gnavin on 1/1/17.
 */
public class MessageFormatSubFormatTime {

    public static void main(String[] args) {
        CommonUtil.printFormattedString("message_format_pattern_time_short", new Date());
        CommonUtil.printFormattedString("message_format_pattern_time_medium", new Date());
        CommonUtil.printFormattedString("message_format_pattern_time_long", new Date());
        CommonUtil.printFormattedString("message_format_pattern_time_full", new Date());
    }

}
