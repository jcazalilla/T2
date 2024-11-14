package moreno.cazalilla.jesusmaria.t2;

import androidx.recyclerview.widget.RecyclerView;

import moreno.cazalilla.jesusmaria.t2.databinding.PersonajeCardviewBinding;


public class PersonajeViewHolder extends RecyclerView.ViewHolder {

    private final PersonajeCardviewBinding binding;

    public PersonajeViewHolder(PersonajeCardviewBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public void bind(Personaje currentPersonaje) {

        binding.name.setText(currentPersonaje.getName());
        binding.image.setImageResource(currentPersonaje.getPhotoId());


        //asegura que se apliquen los cambios de inmediato
        binding.executePendingBindings();

    }
}
