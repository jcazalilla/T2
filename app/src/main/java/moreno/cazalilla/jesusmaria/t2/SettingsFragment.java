package moreno.cazalilla.jesusmaria.t2;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.preference.PreferenceFragmentCompat;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

import moreno.cazalilla.jesusmaria.t2.databinding.PersonajeDetailFragmentBinding;
import moreno.cazalilla.jesusmaria.t2.databinding.PersonajeListFragmentBinding;
import moreno.cazalilla.jesusmaria.t2.databinding.SettingsFragmentBinding;


public class SettingsFragment extends PreferenceFragmentCompat {

    private SettingsFragmentBinding binding;

    @Override
    public void onCreatePreferences(@Nullable Bundle savedInstanceState, @Nullable String rootKey) {
        setPreferencesFromResource(R.xml.preferences, rootKey);


    }



    private void changeToListFragment(View view) {
        //navegamos al fragmento listado de personajes
        Navigation.findNavController(view).navigate(R.id.personajeListFragment);
    }

    @Override
    public void onStart() {
        super.onStart();
        //cambia el título del ActionBar
        if (getActivity() != null) {
            ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle(R.string.settings);
        }
    }

}