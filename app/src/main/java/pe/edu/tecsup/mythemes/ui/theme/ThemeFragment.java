package pe.edu.tecsup.mythemes.ui.theme;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import pe.edu.tecsup.mythemes.R;

public class ThemeFragment extends Fragment {

    private ThemeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(ThemeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_theme, container, false);

        return root;
    }
}