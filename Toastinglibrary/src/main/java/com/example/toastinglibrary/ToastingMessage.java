package com.example.toastinglibrary;

import android.content.Context;
import android.widget.Toast;

public class ToastingMessage {

    public static void s(Context c, String message) {

        Toast.makeText(c, message, Toast.LENGTH_SHORT).show();

    }

    public static void toastMessageShortOrLong(Context c, boolean isLong, String message) {

        if (isLong) {
            Toast.makeText(c, message, Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(c, message, Toast.LENGTH_SHORT).show();
        }


    }
}
