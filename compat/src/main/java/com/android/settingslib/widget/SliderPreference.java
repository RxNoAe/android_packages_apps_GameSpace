package com.android.settingslib.widget;

import android.content.Context;
import android.util.AttributeSet;

import androidx.preference.Preference;
import androidx.preference.PreferenceViewHolder;

import com.google.android.material.slider.LabelFormatter;

/** Compile-time stand-in for AOSP SettingsLib SliderPreference. */
public class SliderPreference extends Preference {
    public static final int HAPTIC_FEEDBACK_MODE_ON_TICKS = 1;

    public SliderPreference(Context context) {
        super(context);
    }

    public SliderPreference(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SliderPreference(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public int getValue() {
        return 0;
    }

    public void setValue(int value) {
    }

    public void setShowSliderValue(boolean show) {
    }

    public void setHapticFeedbackMode(int mode) {
    }

    public void setLabelFormater(LabelFormatter formatter) {
    }

    @Override
    public void onBindViewHolder(PreferenceViewHolder holder) {
        super.onBindViewHolder(holder);
    }
}
