package com.drdisagree.colorblendr.config;

import static android.content.Context.MODE_PRIVATE;

import android.content.SharedPreferences;

import com.drdisagree.colorblendr.ColorBlendr;
import com.drdisagree.colorblendr.common.Const;

@SuppressWarnings("unused")
public class RPrefs {

    public static SharedPreferences prefs = ColorBlendr.getAppContext().createDeviceProtectedStorageContext().getSharedPreferences(Const.SharedPrefs, MODE_PRIVATE);
    static SharedPreferences.Editor editor = prefs.edit();

    public static void putBoolean(String key, boolean val) {
        editor.putBoolean(key, val).apply();
    }

    public static void putInt(String key, int val) {
        editor.putInt(key, val).apply();
    }

    public static void putLong(String key, long val) {
        editor.putLong(key, val).apply();
    }

    public static void putFloat(String key, float val) {
        editor.putFloat(key, val).apply();
    }

    public static void putString(String key, String val) {
        editor.putString(key, val).apply();
    }

    public static boolean getBoolean(String key) {
        return prefs.getBoolean(key, false);
    }

    public static boolean getBoolean(String key, Boolean defValue) {
        return prefs.getBoolean(key, defValue);
    }

    public static int getInt(String key) {
        return prefs.getInt(key, 0);
    }

    public static int getInt(String key, int defValue) {
        return prefs.getInt(key, defValue);
    }

    public static long getLong(String key) {
        return prefs.getLong(key, 0);
    }

    public static long getLong(String key, long defValue) {
        return prefs.getLong(key, defValue);
    }

    public static float getFloat(String key) {
        return prefs.getFloat(key, 0);
    }

    public static float getFloat(String key, float defValue) {
        return prefs.getFloat(key, defValue);
    }

    public static String getString(String key) {
        return prefs.getString(key, null);
    }

    public static String getString(String key, String defValue) {
        return prefs.getString(key, defValue);
    }

    public static void clearPref(String key) {
        editor.remove(key).apply();
    }

    public static void clearPrefs(String... keys) {
        for (String key : keys) {
            editor.remove(key).apply();
        }
    }

    public static void clearAllPrefs() {
        editor.clear().apply();
    }
}