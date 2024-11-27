package moreno.cazalilla.jesusmaria.t2;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.preference.PreferenceFragmentCompat;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import moreno.cazalilla.jesusmaria.t2.databinding.SettingsFragmentBinding;


public class SettingsFragment extends PreferenceFragmentCompat {

    private SettingsFragmentBinding binding;

    @Override
    public void onCreatePreferences(@Nullable Bundle savedInstanceState, @Nullable String rootKey) {
        setPreferencesFromResource(R.xml.preferences, rootKey);
    }


    @Override
    public void onStart() {
        super.onStart();
        //cambia el título del ActionBar
        if (getActivity() != null) {
            ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle(R.string.settings);
        }
    }

    private void changeToListFragment(View view) {
        //navegamos al fragmento listado de personajes
        Navigation.findNavController(view).navigate(R.id.personajeListFragment);
    }
}