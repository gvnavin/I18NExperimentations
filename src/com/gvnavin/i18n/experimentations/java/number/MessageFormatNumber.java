package com.gvnavin.i18n.experimentations.java.number;

import com.gvnavin.i18n.experimentations.java.CommonUtil;

/**
 * Created by gnavin on 1/1/17.
 */
public class MessageFormatNumber {

    public static void main(String[] args) {

        CommonUtil.printFormattedString("message_format_pattern_number_integer", 31231.3423);
        CommonUtil.printFormattedString("message_format_pattern_number_format", 31231.3423);

    }

}
