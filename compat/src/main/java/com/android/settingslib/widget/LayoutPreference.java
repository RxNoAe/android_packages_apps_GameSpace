package com.android.settingslib.widget;

import android.content.Context;
import android.util.AttributeSet;

import androidx.preference.Preference;

/** Compile-time stand-in for AOSP SettingsLib LayoutPreference. */
public class LayoutPreference extends Preference {
    public LayoutPreference(Context context) {
        super(context);
    }

    public LayoutPreference(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public LayoutPreference(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
