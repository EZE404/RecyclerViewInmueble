package com.albornoz.recyclerviewinmueble;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.albornoz.recyclerviewinmueble.models.Inmueble;

import java.util.List;

public class InmuebleAdapter extends RecyclerView.Adapter<InmuebleAdapter.MiViewHolder> {

    private LayoutInflater layoutInflater;
    private Context context;
    private List<Inmueble> inmuebles;

    public InmuebleAdapter(
            Context context,
            List<Inmueble> inmuebles
    ) {
        this.layoutInflater = LayoutInflater.from(context);
        this.context = context;
        this.inmuebles = inmuebles;
    }

    @NonNull
    @Override // Referenciar a la vista item_inmueble y pasarla a la clase MiViewHolder
    public MiViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.item_inmueble, parent, false);
        return new MiViewHolder(view);
    }

    @Override // Se ejecuta por cada inmueble de la lista
    public void onBindViewHolder(@NonNull MiViewHolder holder, int position) {
        Inmueble i = inmuebles.get(position);
        holder.tvDireccion.setText("Dirección: "+i.getDireccion());
        holder.tvPrecio.setText("Precio: "+i.getPrecio());
        holder.ivFoto.setImageResource(i.getIdFoto());
        holder.cvInmueble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, InmuebleDetalles.class);
                intent.putExtra("direccion", i.getDireccion());
                intent.putExtra("precio", i.getPrecio());
                intent.putExtra("idFoto", i.getIdFoto());
                intent.putExtra("cantAmbientes", i.getCantAmbientes());
                intent.putExtra("disponible", i.isDisponible());
                context.startActivity(intent);
            }
        });
    }

    @Override // Retorna la cardinalidad de la lista de inmuebles
    public int getItemCount() {
        return inmuebles.size();
    }

    public class MiViewHolder extends RecyclerView.ViewHolder {

        private CardView cvInmueble;
        private TextView tvDireccion, tvPrecio;
        private ImageView ivFoto;


        public MiViewHolder(@NonNull View itemView) {
            super(itemView);
            tvDireccion = itemView.findViewById(R.id.tvDireccion);
            tvPrecio = itemView.findViewById(R.id.tvPrecio);
            ivFoto = itemView.findViewById(R.id.ivFoto);
            cvInmueble = itemView.findViewById(R.id.cvInmueble);
        }
    }
}
