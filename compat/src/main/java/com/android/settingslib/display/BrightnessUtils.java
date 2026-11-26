package com.android.settingslib.display;

/** Compile-time stand-in for AOSP SettingsLib BrightnessUtils. */
public final class BrightnessUtils {
    public static final int GAMMA_SPACE_MIN = 0;
    public static final int GAMMA_SPACE_MAX = 65535;

    public static int convertGammaToLinear(int val, int min, int max) {
        return val;
    }

    public static float convertGammaToLinearFloat(int val, float min, float max) {
        return val / (float) GAMMA_SPACE_MAX;
    }

    public static float convertLinearToGammaFloat(float val, float min, float max) {
        return val * GAMMA_SPACE_MAX;
    }

    public static double getPercentage(double val, float min, float max) {
        return val;
    }
}
