package com.gvnavin.i18n.experimentations.java.choice;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by gnavin on 1/3/17.
 */
public class MessageFormatChoice {

    //https://docs.oracle.com/javase/7/docs/api/java/text/ChoiceFormat.html
    //X matches j if and only if limit[j] <= X < limit[j+1]

    public static void main(String[] args) {

        formatString(0);
        formatString(3);
        formatString(99);
        formatString(100);
        formatString(1000);
    }

    private static void formatString(final int number) {
        final ResourceBundle rb = ResourceBundle.getBundle("MessageBundle", Locale.US);
        final String pattern = rb.getString("message_format_pattern_choice");
        //System.out.println("pattern = " + pattern);
        final MessageFormat messageFormat = new MessageFormat(pattern);

        final Object[] arg = { number };
        final String formattedString = messageFormat.format(arg);

        System.out.println("formattedString = " + formattedString);
    }
}
