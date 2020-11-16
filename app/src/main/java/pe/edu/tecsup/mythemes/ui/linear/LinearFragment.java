package pe.edu.tecsup.mythemes.ui.linear;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import pe.edu.tecsup.mythemes.R;
import pe.edu.tecsup.mythemes.activity.MainActivity;
import pe.edu.tecsup.mythemes.adapter.ThemeAdapter;

public class LinearFragment extends Fragment {

    private LinearViewModel dashboardViewModel;
    private RecyclerView rvThemes;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        dashboardViewModel =
                ViewModelProviders.of(this).get(LinearViewModel.class);
        View root = inflater.inflate(R.layout.fragment_layout_linear, container, false);
        rvThemes = root.findViewById(R.id.rvThemesLinear);

        LinearLayoutManager manager = new LinearLayoutManager(getContext(),RecyclerView.VERTICAL, false);
        ThemeAdapter themeAdapter = new ThemeAdapter(( (MainActivity) getActivity()).themes(), R.layout.themes_layout_item_linear);
        rvThemes.setAdapter(themeAdapter);
        rvThemes.setLayoutManager(manager);
        return root;
    }

}