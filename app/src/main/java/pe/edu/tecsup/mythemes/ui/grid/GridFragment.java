package pe.edu.tecsup.mythemes.ui.grid;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import pe.edu.tecsup.mythemes.R;
import pe.edu.tecsup.mythemes.activity.MainActivity;
import pe.edu.tecsup.mythemes.adapter.ThemeAdapter;

public class GridFragment extends Fragment {

    private GridViewModel notificationsViewModel;
    private RecyclerView rvThemesGrid;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        notificationsViewModel =
                ViewModelProviders.of(this).get(GridViewModel.class);
        View root = inflater.inflate(R.layout.fragment_layout_grid, container, false);
        rvThemesGrid = root.findViewById(R.id.rvThemesGrid);
        GridLayoutManager manager = new GridLayoutManager(getContext(),2);
        ThemeAdapter themeAdapter = new ThemeAdapter(((MainActivity)getActivity()).themes(), R.layout.themes_layout_item_grid);
        rvThemesGrid.setAdapter(themeAdapter);
        rvThemesGrid.setLayoutManager(manager);

        return root;
    }
}