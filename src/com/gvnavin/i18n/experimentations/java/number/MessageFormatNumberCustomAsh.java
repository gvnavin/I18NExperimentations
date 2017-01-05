package com.gvnavin.i18n.experimentations.java.number;

/**
 * Created by gnavin on 1/1/17.
 */
public class MessageFormatNumberCustomAsh {


    //https://docs.oracle.com/javase/tutorial/i18n/format/decimalFormat.html
    public static void main(String[] args) {

        System.out.println("Format Number Decimal with #");

        NumberFormatUtil.formatNumberDecimal(145.23, "message_format_pattern_number_integer", "##.##");
        NumberFormatUtil.formatNumberDecimal(1456.2, "message_format_pattern_number_integer", "##.##");
        NumberFormatUtil.formatNumberDecimal(123.23567, "message_format_pattern_number_integer", "##.##"); //rounding off with 2 decimal digits
        NumberFormatUtil.formatNumberDecimal(123, "message_format_pattern_number_integer", "###.##");
        NumberFormatUtil.formatNumberDecimal(123.23567, "message_format_pattern_number_integer", "0000.##");

    }



}
