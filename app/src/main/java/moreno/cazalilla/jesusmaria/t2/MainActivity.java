package moreno.cazalilla.jesusmaria.t2;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;


import moreno.cazalilla.jesusmaria.t2.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    NavController navController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        //configurar el NavController
        navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        NavigationUI.setupActionBarWithNavController(this,navController);
    }

    //método para manejar el click en el RecyclerView
    public void personajeClicked(Personaje currentPersonaje, View view) {

        //crear Bundle para pasar los datos
        Bundle bundle = new Bundle();

        bundle.putString("name", currentPersonaje.getName());
        bundle.putString("description", currentPersonaje.getDescription());
        bundle.putString("ability", currentPersonaje.getAbility());
        bundle.putInt("image", currentPersonaje.getPhotoId());

        //navegar al PersonajeDetailFragment con el Bundle
        Navigation.findNavController(view).navigate(R.id.personajeDetailFragment, bundle);
    }

    @Override
    public boolean onSupportNavigateUp(){
        //utiliza el método navigationUp del NavController
        return navController.navigateUp()||super.onNavigateUp();
    }
}