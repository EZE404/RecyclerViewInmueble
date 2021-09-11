package com.albornoz.recyclerviewinmueble;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.albornoz.recyclerviewinmueble.models.Inmueble;

public class InmuebleDetalles extends AppCompatActivity {

    private InmuebleViewModel iViewModel;
    private ImageView ivFoto;
    private TextView tvDireccion, tvPrecio, tvCantAmbientes, tvDisponible;
    private int idInmueble;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inmueble_detalles);
        iViewModel = new InmuebleViewModel();
        idInmueble = getIntent().getExtras().getInt("id");
        inicializarViews();
        cargarDetallesInmueble();
    }

    private void inicializarViews() {
        ivFoto = findViewById(R.id.ivFotoDetalles);
        tvDireccion = findViewById(R.id.tvDireccionDetalles);
        tvPrecio = findViewById(R.id.tvPrecioDetalles);
        tvCantAmbientes = findViewById(R.id.tvCantAmbientes);
        tvDisponible = findViewById(R.id.tvDisponibilidad);
    }

    private void cargarDetallesInmueble() {
        Inmueble i = iViewModel.getById(idInmueble);
        // TODO: VER SI SE PUEDE LLEVAR EL IF AL VIEWMODEL
        if (i != null) {
            ivFoto.setImageResource(i.getIdFoto());
            tvDireccion.setText("Dirección: "+i.getDireccion());
            tvPrecio.setText("Precio: "+i.getPrecio());
            tvCantAmbientes.setText("Cantidad de ambientes: "+i.getCantAmbientes());
            tvDisponible.setText((i.isDisponible()) ? "Disponible" : "No Disponible");
        } else {
            /* TODO: HACER OTRA ACTIVITY O LLENAR LOS VIEWS CON DATOS GENÉRICOS
            *   O HACER UN MUTABLE DATA CON ALGÚN BOOLEANO */
            Log.d("inmueble", "cargarDetallesInmueble: No se encontró inmueble");
        }
    }
}