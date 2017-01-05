package com.gvnavin.i18n.experimentations.java;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by gnavin on 1/1/17.
 */
public class MessageFormatNonStaticExample {

    public static void main(String[] args) {

        messageFormatNonStaticExample();

    }


    // when MessageFormat used inside loop then create new MessageFormat object
    // otherwise use static MessageFormat.format
    public static void messageFormatNonStaticExample() {

        final ResourceBundle rb = ResourceBundle.getBundle("MessageBundle", Locale.US);
        final String pattern = rb.getString("message_format_pattern");
        final MessageFormat mf = new MessageFormat(pattern);

        for (int i = 0; i < 5; i++) {
            final Object[] arg = { i };
            final String formattedString = mf.format(arg);
            System.out.println("formattedString = " + formattedString);
        }
    }
}
