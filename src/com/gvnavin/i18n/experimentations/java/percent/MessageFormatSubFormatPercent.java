package com.gvnavin.i18n.experimentations.java.percent;

import com.gvnavin.i18n.experimentations.java.CommonUtil;

import java.text.MessageFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by gnavin on 1/1/17.
 */
public class MessageFormatSubFormatPercent {

    public static void main(String[] args) {

        CommonUtil.printFormattedString("message_format_pattern_number_percent", 0.20); //result will be num*100

    }

}
