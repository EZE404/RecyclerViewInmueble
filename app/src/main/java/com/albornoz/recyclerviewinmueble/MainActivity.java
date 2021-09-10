package com.albornoz.recyclerviewinmueble;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.albornoz.recyclerviewinmueble.models.Inmueble;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerViewLista;
    private InmuebleAdapter inmuebleAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerViewLista = findViewById(R.id.RVLista);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(
                this,
                1,
                GridLayoutManager.VERTICAL,
                false
        );
        recyclerViewLista.setLayoutManager(gridLayoutManager);
        inmuebleAdapter = new InmuebleAdapter(getLayoutInflater(), this, getInmuebles());
        recyclerViewLista.setAdapter(inmuebleAdapter);
    }

    private List<Inmueble> getInmuebles() {
        List<Inmueble> inmuebles = new ArrayList<Inmueble>();

        inmuebles.add(new Inmueble("Mitre 350", 67000000, R.drawable.casa_1));
        inmuebles.add(new Inmueble("Caseros 653", 4000000, R.drawable.casa_2));
        inmuebles.add(new Inmueble("Pringles 570", 87500000, R.drawable.casa_3));
        inmuebles.add(new Inmueble("Bolivar 235", 2200000, R.drawable.casa_4));
        inmuebles.add(new Inmueble("San Martín 789", 14550000, R.drawable.casa_5));

        return inmuebles;
    }
}