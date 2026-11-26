package lineageos.providers;

import android.content.ContentResolver;
import android.provider.Settings;

/** Compile-time stand-in for LineageOS LineageSettings. */
public final class LineageSettings {
    public static final class System {
        public static final String KEY_THREE_FINGERS_SWIPE_ACTION = "three_finger_swipe_action";

        public static int getIntForUser(ContentResolver resolver, String name, int def, int user) {
            return Settings.System.getIntForUser(resolver, name, def, user);
        }

        public static boolean putIntForUser(ContentResolver resolver, String name, int value, int user) {
            return Settings.System.putIntForUser(resolver, name, value, user);
        }
    }
}
