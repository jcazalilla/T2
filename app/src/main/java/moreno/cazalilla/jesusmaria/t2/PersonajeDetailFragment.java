package moreno.cazalilla.jesusmaria.t2;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import moreno.cazalilla.jesusmaria.t2.databinding.PersonajeDetailFragmentBinding;


public class PersonajeDetailFragment extends Fragment {


    private PersonajeDetailFragmentBinding binding;
    Button button;
    Navigation navigation;

    public View onCreateView(@NonNull LayoutInflater inflater, @NonNull ViewGroup container,
                             Bundle savedInstanceState) {

        //inflamos el layout para este fragmento
        binding = PersonajeDetailFragmentBinding.inflate(inflater,
                container, false);

        //con viewBinding controlamos evento del botón para volver a listado de personajes
        binding.btnVolver.setOnClickListener(this::changeToListFragment);

        return binding.getRoot();
    }


    private void changeToListFragment(View view) {
        //navegamos al fragmento listado de personajes
        Navigation.findNavController(view).navigate(R.id.personajeListFragment);
    }


    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        if (getArguments() != null) {
            String name = getArguments().getString("name");
            String description = getArguments().getString("description");
            String ability = getArguments().getString("ability");
            int image = getArguments().getInt("image");

            //asignar los datos a los componentes
            binding.name.setText(name);
            binding.description.setText(description);
            binding.ability.setText(ability);
            binding.image.setImageResource(image);

        }
    }



    public void onStart() {
        super.onStart();

        //cambia el título de la ActionBar
        if (getActivity() != null) {
            ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle(R.string.detalles_del_personje);
        }
    }
}
