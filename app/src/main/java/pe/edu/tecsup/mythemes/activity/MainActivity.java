package pe.edu.tecsup.mythemes.activity;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import java.util.ArrayList;
import java.util.List;

import pe.edu.tecsup.mythemes.R;
import pe.edu.tecsup.mythemes.model.Theme;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(navView, navController);
    }

    public List<Theme> themes (){
        String theme = "Programación";
        String[] descriptions = {
                "Desarrollado en 1995 por Sun Microsystems, su principal punto fuerte es que es muy versátil. Puede usarse prácticamente para todo, desde aplicaciones webs a programas de ordenadores, apps de Android, juegos, etc.",

                "Javascript es el lenguaje más utilizado para escribir aplicaciones dentro de las páginas webs. Funciona directamente en el navegador",

                "Go es un lenguaje desarrollado por Google en 2009, que se ha popularizado mucho en los últimos años. Está inspirado en C, pero aspira a ser tan fácil de entender como Python, sin perder la rapidez de C++.",

                "se utiliza mucho para desarrollar aplicaciones Android, desarrollo web, aplicaciones científicas, y apps multiplataforma que van a funcionar tanto en iOS como en Android.",

                " El lenguaje Python ha vuelto con fuerza en los últimos tiempos porque se ha descubierto que es perfecto para desarrollar una tecnología enfocada en la inteligencia artificial",

                "Es un lenguaje que se creó para diseñar sistemas operativos, como Unix y otros muchos. Es un lenguaje de bajo nivel, muy rápido y eficiente, también comenzó a usarse para escribir aplicaciones y programas.",

                "Scala se ejecuta en la máquina virtual de Java, y puede usar las miles de librerías Java y Javascript, así que resulta muy sencillo incorporarlo a las actualizaciones de aplicaciones ya existentes",

                "Se usa principalmente para crear aplicaciones web, pero también se pueden creer aplicaciones de escritorio, o apps para el móvil.",

                "Swift es un lenguaje de programación creado por Apple para diseñar apps para iOS, Mac, el Apple TV y el Apple Watch. Es el lenguaje oficial de la plataforma Apple",

                "Se ha vuelto muy popular porque es un lenguaje pensado para desarrollar interfases de usuario: menús, botones de acceso, y otros comandos de entrada que son imprescindibles en las apps de móvil y en las páginas web."

        };
        List<Theme> themes = new ArrayList<Theme>();
        themes.add(new Theme(R.drawable.ic_java,theme,"Java","puesto: 1",descriptions[0]));
        themes.add(new Theme(R.drawable.ic_javascript,theme,"Javascript","puesto: 2",descriptions[1]));
        themes.add(new Theme(R.drawable.ic_gopher_front,theme,"Go","puesto: 3",descriptions[2]));
        themes.add(new Theme(R.drawable.ic_kotlin,theme,"Kotlin","puesto: 4",descriptions[3]));
        themes.add(new Theme(R.drawable.ic_python,theme,"Python","puesto: 5",descriptions[4]));
        themes.add(new Theme(R.drawable.ic_c,theme,"C","puesto: 6",descriptions[5]));
        themes.add(new Theme(R.drawable.ic_scala,theme,"Scala","puesto: 7",descriptions[6]));
        themes.add(new Theme(R.drawable.ic_ruby,theme,"Ruby","puesto: 8",descriptions[7]));
        themes.add(new Theme(R.drawable.ic_swift,theme,"Swift","puesto: 9",descriptions[8]));
        themes.add(new Theme(R.drawable.ic_dart,theme,"Dart","puesto: 10",descriptions[9]));
        return themes;
    }
}