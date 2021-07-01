package adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myfilms.R;

import java.util.List;

import model.Filmes;

public class AdapterFilm extends RecyclerView.Adapter<AdapterFilm.MyViewHolder> {

   List<Filmes> listFilms;

    public AdapterFilm(List<Filmes> listFilms) {
        this.listFilms = listFilms;
    }

    @NonNull
    @org.jetbrains.annotations.NotNull
    @Override
    public AdapterFilm.MyViewHolder onCreateViewHolder(@NonNull @org.jetbrains.annotations.NotNull ViewGroup parent, int viewType) {
        View itens = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_recycler_filmes, parent, false);
        return new MyViewHolder(itens);
    }

    @Override
    public void onBindViewHolder(@NonNull @org.jetbrains.annotations.NotNull AdapterFilm.MyViewHolder holder, int position) {
        Filmes filmes = listFilms.get(position);

        holder.imageFilm.setImageResource(filmes.getImagem());
        holder.tituloFilm.setText(filmes.getTitulo());
        holder.descFilm.setText(filmes.getDescricao());
    }

    @Override
    public int getItemCount() {

        return listFilms.size();
    }

   public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imageFilm;
        TextView tituloFilm;
        TextView descFilm;


       public MyViewHolder(@NonNull @org.jetbrains.annotations.NotNull View itemView) {
           super(itemView);
           imageFilm = itemView.findViewById(R.id.imageFilm);
           tituloFilm = itemView.findViewById(R.id.tituloFilm);
           descFilm = itemView.findViewById(R.id.descFilm);
       }
   }
}


