package moreno.cazalilla.jesusmaria.t2;


import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.preference.PreferenceFragmentCompat;

public class PreferencesHelper extends PreferenceFragmentCompat {

    private static final String PREF_kEY="es";
    private static final String KEY_LANGUAGE="language";

    @Override
    public void onCreatePreferences(@Nullable Bundle savedInstanceState, @Nullable String rootKey) {

        //inflar el layout
        setPreferencesFromResource(R.xml.preferences, rootKey);
    }

    public static void saveLanguage(Context context, String languange){

        SharedPreferences prefs = context.getSharedPreferences(PREF_kEY, Context.MODE_PRIVATE);

        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(KEY_LANGUAGE, languange);
        editor.apply();
    }

    public static String getLanguage (Context context){

        SharedPreferences prefs = context.getSharedPreferences(PREF_kEY, Context.MODE_PRIVATE);
        return prefs.getString(KEY_LANGUAGE, null);
    }

}
