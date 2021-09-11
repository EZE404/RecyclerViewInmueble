package com.albornoz.recyclerviewinmueble;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class InmuebleDetalles extends AppCompatActivity {

    private ImageView ivFoto;
    private TextView tvDireccion, tvPrecio, tvCantAmbientes, tvDisponible;
    private Bundle extras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inmueble_detalles);
        extras = getIntent().getExtras();
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
        ivFoto.setImageResource(extras.getInt("idFoto"));
        tvDireccion.setText("Dirección: "+extras.getString("direccion"));
        tvPrecio.setText("Precio: "+extras.getDouble("precio"));
        tvCantAmbientes.setText("Cantidad de ambientes: "+extras.getInt("cantAmbientes"));
        tvDisponible.setText((extras.getBoolean("disponible")) ? "Disponible" : "No Disponible");
    }
}