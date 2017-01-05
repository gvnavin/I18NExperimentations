package com.gvnavin.i18n.experimentations;

import java.util.Locale;
import java.util.ResourceBundle;

public class Main {

    public static void main(String[] args) {
        //US
        ResourceBundle rb = ResourceBundle.getBundle("MessageBundle", Locale.US);
        System.out.println("helloResourceString = " + rb.getString("hello"));

        //indonesia
        Locale.setDefault(new Locale("in", "ID"));
        rb = ResourceBundle.getBundle("MessageBundle");
        System.out.println("Message in " + Locale.getDefault() + ": " + rb.getString("hello"));

    }
}
