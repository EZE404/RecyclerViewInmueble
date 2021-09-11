package com.albornoz.recyclerviewinmueble;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.albornoz.recyclerviewinmueble.models.Inmueble;

import java.util.ArrayList;
import java.util.List;

public class InmuebleViewModel extends ViewModel {

    private List<Inmueble> inmuebles;

    public InmuebleViewModel() {
        inmuebles = new ArrayList<>();
        inmuebles.add(new Inmueble(1,"Mitre 350", 67000000, R.drawable.casa_1, 5, true));
        inmuebles.add(new Inmueble(2,"Caseros 653", 4000000, R.drawable.casa_2, 4, true));
        inmuebles.add(new Inmueble(3,"Pringles 570", 87500000, R.drawable.casa_3, 4, false));
        inmuebles.add(new Inmueble(4,"Bolivar 235", 2200000, R.drawable.casa_4, 5, false));
        inmuebles.add(new Inmueble(5, "San Martín 789", 14550000, R.drawable.casa_5, 6, true));
    }

    public List<Inmueble> getInmuebles() {
        if (inmuebles == null) {
            inmuebles = new ArrayList<>();
        }
        return inmuebles;
    }

    public void setInmuebles(List<Inmueble> inmuebles) {
        this.inmuebles = inmuebles;
    }

    public Inmueble getById(int id) {
        Inmueble inmueble = null;
        for (Inmueble i: inmuebles) {
            if (id == i.getId()) {
                inmueble = i;
            }
        }
        return inmueble;
    }
}