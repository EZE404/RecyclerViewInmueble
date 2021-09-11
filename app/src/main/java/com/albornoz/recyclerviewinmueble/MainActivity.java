package com.albornoz.recyclerviewinmueble;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.albornoz.recyclerviewinmueble.models.Inmueble;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerViewLista;
    private InmuebleAdapter inmuebleAdapter;
    private InmuebleViewModel iViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iViewModel = new InmuebleViewModel();
        recyclerViewLista = findViewById(R.id.RVLista);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(
                this,
                LinearLayoutManager.VERTICAL,
                false
        );
        recyclerViewLista.setLayoutManager(linearLayoutManager);
        inmuebleAdapter = new InmuebleAdapter(this, iViewModel.getInmuebles());
        recyclerViewLista.setAdapter(inmuebleAdapter);
    }
}