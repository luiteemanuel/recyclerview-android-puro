package activitys;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.myfilms.R;

import java.util.ArrayList;
import java.util.List;

import adapter.AdapterFilm;
import model.Filmes;

public class MainActivity extends AppCompatActivity {
    List <Filmes> listfilmes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerFilmes = findViewById(R.id.recyclerView);

        listfilmes = new ArrayList<>();

        //lista filmes
        this.criarFilmes();

        //configura adaptaer
        AdapterFilm adapterFilm = new AdapterFilm(listfilmes);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerFilmes.setLayoutManager(layoutManager);
        recyclerFilmes.setHasFixedSize(true);
        recyclerFilmes.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        recyclerFilmes.setAdapter(adapterFilm);
    }
    public void criarFilmes(){
        Filmes filmes = new Filmes(R.drawable.borat,  "Borat: Fita de Cinema Seguinte ", "23 de outubro de 2020");
        listfilmes.add(filmes);

        filmes  = new Filmes(R.drawable.after,  "After 2: Depois da Verdade", "2 de setembro de 2020");
        listfilmes.add(filmes);

        filmes  = new Filmes(R.drawable.desafio,  "O Desafio", "19 de dezembro de 2019 ");
        listfilmes.add(filmes);

        filmes  = new Filmes(R.drawable.fast,  "Velozes & Furiosos 9 ", "19 de maio de 2021");
        listfilmes.add(filmes);

        filmes  = new Filmes(R.drawable.cacador,  "O Caçador de Recompensas ", "16 de junho de 2020");
        listfilmes.add(filmes);

        filmes  = new Filmes(R.drawable.queen,  "Bohemian Rhapsody ", "24 de outubro de 2018");
        listfilmes.add(filmes);

        filmes  = new Filmes(R.drawable.remorcio,  "Sem Remorso ", "29 de abril de 2021");
        listfilmes.add(filmes);

        filmes  = new Filmes(R.drawable.soldados,  "O Caçador de Recompensas", "16 de junho de 2020");
        listfilmes.add(filmes);

        filmes  = new Filmes(R.drawable.todo,  "Todo Mundo em Pânico 2", "4 de julho de 2001");
        listfilmes.add(filmes);

        filmes  = new Filmes(R.drawable.tony,  "Tony Parker – Entre os Maiores ", "6 de janeiro de 2021");
        listfilmes.add(filmes);

        filmes  = new Filmes(R.drawable.veloses,  "Velozes & Furiosos 8 ", "2 de abril de 2017");
        listfilmes.add(filmes);

        filmes  = new Filmes(R.drawable.mortal,  "Mortal Kombat  ", "7 de abril de 2021");
        listfilmes.add(filmes);

    }
}
