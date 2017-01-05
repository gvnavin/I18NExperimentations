package com.gvnavin.i18n.experimentations.icu.select;

/**
 * Created by gnavin on 1/3/17.
 */
public class ICUMessageFormatSelectWrong {

    public static void main(String[] args) {

        System.out.println("No plural form");

        System.out.println("no complete thoughts, not easy for translation");

        SelectUtil.formatSelectPluralString(0, "male", "message_format_pattern_select_simple_wrong");
        SelectUtil.formatSelectPluralString(0, "male", "message_format_pattern_select_simple_wrong");
        SelectUtil.formatSelectPluralString(1, "male", "message_format_pattern_select_simple_wrong");
        SelectUtil.formatSelectPluralString(2, "male", "message_format_pattern_select_simple_wrong");
        SelectUtil.formatSelectPluralString(99, "male", "message_format_pattern_select_simple_wrong");

        System.out.println("------------------------------------------------------------");

        SelectUtil.formatSelectPluralString(0, "female", "message_format_pattern_select_simple_wrong");
        SelectUtil.formatSelectPluralString(1, "female", "message_format_pattern_select_simple_wrong");
        SelectUtil.formatSelectPluralString(2, "female", "message_format_pattern_select_simple_wrong");
        SelectUtil.formatSelectPluralString(99, "female", "message_format_pattern_select_simple_wrong");

    }

}
