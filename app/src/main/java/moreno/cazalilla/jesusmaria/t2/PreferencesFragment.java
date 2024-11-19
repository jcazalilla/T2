package moreno.cazalilla.jesusmaria.t2;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.preference.PreferenceFragmentCompat;

public class PreferencesFragment extends PreferenceFragmentCompat {
    @Override
    public void onCreatePreferences(@Nullable Bundle savedInstanceState, @Nullable String rootKey) {

        //inflar el layout
        setPreferencesFromResource(R.xml.preferences, rootKey);



    }
}
