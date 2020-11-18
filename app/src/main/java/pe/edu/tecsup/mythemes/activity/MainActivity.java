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
                "Java es un lenguaje multiplataforma, basado en programación orientada a objetos",
                "Javascript es un lenguaje de secuencias de comandos que te permite crear contenido de actualización dinámica",
                "Go es un lenguaje desarrollado por Google en 2009, que se ha popularizado mucho en los últimos años.",
                "Kotlin es un lenguaje de programación orientado principalmente a objetos de calidad industrial.",
                "Python es un lenguaje de programación interpretado cuya filosofía hace hincapié en la legibilidad de su código, especializado en inteligencia artificial",
                "Es un lenguaje que se creó para diseñar sistemas operativos, como Unix y otros muchos. Es un lenguaje de bajo nivel.",
                "Scala es un lenguaje multi-paradigma diseñado para expresar patrones comunes de programación en forma concisa, elegante y con tipos seguros",
                "Ruby es un lenguaje de programación interpretado, reflexivo y orientado a objetos.",
                "Swift es un lenguaje de multiparadigma creado por Apple enfocado en el desarrollo de aplicaciones para iOS y macOS.",
                "Dart es un lenguaje open source desarrollado en Google con el objetivo de permitir a los desarrolladores utilizar un lenguaje orientado a objetos y con análisis estático de tipo"
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