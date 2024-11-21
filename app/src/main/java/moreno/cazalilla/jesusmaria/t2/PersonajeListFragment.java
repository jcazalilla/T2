package moreno.cazalilla.jesusmaria.t2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

import moreno.cazalilla.jesusmaria.t2.databinding.PersonajeListFragmentBinding;


public class PersonajeListFragment extends Fragment {

    //binding para el layout
    private PersonajeListFragmentBinding binding;
    //Array de listas de personajes
    private ArrayList<Personaje> listPersonajes;
    //Adaptador del RecyclerView
    private PersonajesRecyclerViewAdapter adapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //inflamos el layout utilizando binding
        binding = PersonajeListFragmentBinding.inflate(inflater, container, false);


        //SnackBar informando al usuario en la lista de personajes
        Snackbar.make(
                binding.snackBar,
                "Bienvenidos al mundo de Mario",
                BaseTransientBottomBar.LENGTH_SHORT
        ).show();

        return binding.getRoot();
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //iniciliza la lista de los personajes
        inicializaListaPersonajes();

        //configuramos el RecyclerView
        adapter = new PersonajesRecyclerViewAdapter(listPersonajes, getActivity());
        binding.personajeRecyclerview.setLayoutManager(new LinearLayoutManager(getContext()));
        binding.personajeRecyclerview.setAdapter(adapter);
    }

    //método que carga la lista con datos de los personajes
    private void inicializaListaPersonajes() {

        listPersonajes = new ArrayList<>();

        //llenamos la lista de personajes
        listPersonajes.add(new Personaje(
                "Mario",
                "Mario es muy positivo y siempre está alegre.",
                "Increíble capacidad para saltar, destreza en el combate", R.drawable.mario

        ));

        listPersonajes.add(new Personaje(
                "Peach",
                "Siempre está trabajando para crear un mundo en el que todos puedan convivir juntos y felices.",
                "Puede flotar en el aire, lo que le da una buena ventaja al ser arrojada y poder regresar.", R.drawable.peach
        ));
        listPersonajes.add(new Personaje(
                "Luigi",
                "Un poco de nervioso, especialmente si hay fantasmas por ahí. Es el hermano menor de Mario.",
                "Salta más alto pero corre más lento.", R.drawable.luigi
        ));
        listPersonajes.add(new Personaje(
                "Toad",
                "Tiene manchas en la cabeza, es muy alegre y leal.",
                "Es uno de los protectores de la Princesa Peach.", R.drawable.toad
        ));

    }

    @Override
    public void onStart() {
        super.onStart();
        //cambia el título del ActionBar
        if (getActivity() != null) {
            ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle(R.string.lista_de_personajes);
        }
    }
}