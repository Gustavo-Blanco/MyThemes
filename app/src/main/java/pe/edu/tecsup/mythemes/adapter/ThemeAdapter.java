package pe.edu.tecsup.mythemes.adapter;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textview.MaterialTextView;
import java.util.List;
import pe.edu.tecsup.mythemes.R;
import pe.edu.tecsup.mythemes.activity.MainActivity;
import pe.edu.tecsup.mythemes.model.Theme;

public class ThemeAdapter extends RecyclerView.Adapter<ThemeAdapter.ThemeViewHolder> {

    private List<Theme> themes;
    private int fragmentId;

    public ThemeAdapter(List<Theme> themes, int fragmentId) {
        this.fragmentId = fragmentId;
        this.themes = themes;
    }

    public static class ThemeViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private MaterialTextView title, description, rating, theme;
        private ImageView image;
        ThemeAdapter themeAdapter;

        public ThemeViewHolder(@NonNull View itemView, ThemeAdapter themeAdapter) {
            super(itemView);
            this.image = itemView.findViewById(R.id.image);
            this.title = itemView.findViewById(R.id.title);
            this.description = itemView.findViewById(R.id.description);
            this.theme = itemView.findViewById(R.id.theme);
            this.rating = itemView.findViewById(R.id.rating);
            this.themeAdapter = themeAdapter;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick( View v) {
            String languaje = this.title.getText().toString();
            final AlertDialog.Builder builder = new AlertDialog.Builder(v.getContext(), R.style.AlertDialogStyle);
            builder.setTitle("Eliminar lenguaje de programación");
            builder.setMessage("¿Desea eliminar '"+languaje+"' de la lista?")
            .setPositiveButton("Sí", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    int position = getAdapterPosition();
                    themeAdapter.themes.remove(position);
                    themeAdapter.notifyItemRemoved(position);
                }
            }).setNegativeButton("No", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Toast.makeText(builder.getContext(), "Eliminación cancelada",Toast.LENGTH_SHORT).show();
                }
            }).show();
        }
    }

    @NonNull
    @Override
    public ThemeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(this.fragmentId, parent, false);
        return new ThemeViewHolder(view, this);
    }

    @Override
    public void onBindViewHolder(@NonNull ThemeViewHolder holder, int position) {
        Theme theme =this.themes.get(position);
        holder.title.setText(theme.getTitle());
        holder.description.setText(theme.getDescription());
        holder.theme.setText(theme.getTheme());
        holder.rating.setText(theme.getRating());
        holder.image.setImageResource(theme.getImage());
    }

    @Override
    public int getItemCount() {
        return this.themes.size();
    }

}
