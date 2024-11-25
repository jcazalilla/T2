package moreno.cazalilla.jesusmaria.t2;


import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceActivity;

import androidx.annotation.Nullable;
import androidx.preference.CheckBoxPreference;
import androidx.preference.ListPreference;
import androidx.preference.PreferenceFragmentCompat;

public class PreferencesFragment extends PreferenceFragmentCompat {


    public void onCreatePreferences(@Nullable Bundle savedInstanceState, String rootKey) {

        //inflamos el archivo de preferencias xml
        setPreferencesFromResource(R.xml.preferences, rootKey);

    }
}
