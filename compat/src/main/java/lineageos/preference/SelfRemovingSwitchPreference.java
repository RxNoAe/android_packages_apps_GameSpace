package lineageos.preference;

import android.content.Context;
import android.util.AttributeSet;

import androidx.preference.SwitchPreferenceCompat;

/** Compile-time stand-in for LineageOS SelfRemovingSwitchPreference. */
public class SelfRemovingSwitchPreference extends SwitchPreferenceCompat {
    public SelfRemovingSwitchPreference(Context context) {
        super(context);
    }

    public SelfRemovingSwitchPreference(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SelfRemovingSwitchPreference(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
