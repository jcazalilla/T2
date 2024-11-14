package moreno.cazalilla.jesusmaria.t2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import moreno.cazalilla.jesusmaria.t2.databinding.PersonajeCardviewBinding;
import moreno.cazalilla.jesusmaria.t2.databinding.PersonajeListFragmentBinding;


public class PersonajesRecyclerViewAdapter extends RecyclerView.Adapter<PersonajeViewHolder> {

    private final ArrayList<Personaje> listPersonajes;
    private final Context context;

    public PersonajesRecyclerViewAdapter(ArrayList<Personaje> listPersonajes, Context context) {

        this.listPersonajes = listPersonajes;
        this.context = context;
    }


    //Método que crea el ViewHolder
    @NonNull
    @Override
    public PersonajeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        PersonajeCardviewBinding binding = PersonajeCardviewBinding.inflate(
                LayoutInflater.from(parent.getContext()), parent, false);

        return new PersonajeViewHolder(binding);
    }


    //Método para enlazar datos en el ViewHolder
    @Override
    public void onBindViewHolder(@NonNull PersonajeViewHolder holder, int position) {

        Personaje currentPersonaje = this.listPersonajes.get(position);
        holder.bind(currentPersonaje);

        //manejar el evento click
        holder.itemView.setOnClickListener(view ->
            itemClicked(currentPersonaje, view));

    }


    @Override
    public int getItemCount() {
        return listPersonajes.size();
    }

    private void itemClicked(Personaje currentPersonaje, View view) {

        //llama a la función personajeClicked de la ActivityMain
        ((MainActivity) context).personajeClicked(currentPersonaje, view);
    }
}
