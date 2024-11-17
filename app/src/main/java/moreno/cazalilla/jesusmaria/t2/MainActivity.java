package moreno.cazalilla.jesusmaria.t2;


import static androidx.appcompat.app.AlertDialog.*;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;


import moreno.cazalilla.jesusmaria.t2.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    NavController navController;
    ActionBarDrawerToggle toggle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        //cofigurar el control del FragmentManager
        FragmentManager fragmentManager = getSupportFragmentManager();
        //configurar el NavController
        navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        NavigationUI.setupActionBarWithNavController(this, navController);

        // Configurar la navegación
        configureNavigation();

        // Configurar menú toggle
        configureToggleMenu();

        // Configurar el icono del menú en la ActionBar
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    private void configureToggleMenu() {
        // Configurar el ActionBarDrawerToggle
        toggle = new ActionBarDrawerToggle(
                this,
                binding.main,
                R.string.setting_drawer,
                R.string.language_drawer
        );
        binding.main.addDrawerListener(toggle);
        toggle.syncState();
    }

    private void configureNavigation() {
        NavigationUI.setupWithNavController(binding.navView, navController);

        // Manejar la selección de elementos del menú
        binding.navView.setNavigationItemSelectedListener(menuItem -> {
            if (menuItem.getItemId() == R.id.nav_header) {
                navController.navigate(R.id.personajeListFragment); // Navegar al fragmento de inicio
            }
            binding.main.closeDrawers(); // Cerrar el menú
            return true;
        });

        // Maneja la opción de perfil del header del menú
        ImageView marioImageView = binding.navView.getHeaderView(0).findViewById(R.id.header_image);

        marioImageView.setOnClickListener(v -> {
            navController.navigate(R.id.personajeListFragment); // Navegar al fragmento de perfil
            binding.main.closeDrawers(); // Cerrar el menú
        });
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
    public boolean onSupportNavigateUp() {
        //utiliza el método navigationUp del NavController
        return navController.navigateUp() || super.onNavigateUp();
    }

    /**
     * menú en ActionBar "Acerca de..." inflamos el layout
     */
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();//id de la opción del toolbar


        // Manejar clics en el icono del menú del Drawer
        if (toggle.onOptionsItemSelected(item)) {
            return true;
        }
        //manejar clicks de la opción de la toolbar
        if (id == R.id.acerca) {
            // método Alert Dialog Acerca de...
            setAlertDialog();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


    /**
     * Mensaje por AlertDialog de la versión de la App
     * y desarrolada por el autor.
     */
    private void setAlertDialog() {
        AlertDialog.Builder alertaDialogBuilder = new AlertDialog.Builder(this);
        alertaDialogBuilder
                .setTitle("Aplicación desarrollada por:")
                .setMessage("Jesús María Moreno Cazalillla. \n" +
                        "versión 1.0")
                .setPositiveButton("Aceptar", new OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        //dejamos vacío y cierra dialogo al pulsar aceptar
                    }
                })// no gestionamos el botón negativo, solo mostramos info
                .create().show();

    }
}




