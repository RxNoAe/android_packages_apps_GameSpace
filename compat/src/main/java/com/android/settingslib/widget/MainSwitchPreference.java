package com.android.settingslib.widget;

import android.content.Context;
import android.util.AttributeSet;

import androidx.preference.Preference;

/** Compile-time stand-in for AOSP SettingsLib MainSwitchPreference. */
public class MainSwitchPreference extends Preference {
    public MainSwitchPreference(Context context) {
        super(context);
    }

    public MainSwitchPreference(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MainSwitchPreference(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
