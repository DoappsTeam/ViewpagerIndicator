package me.doapps.viewpagerindicator.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.doapps.william.viewpagerindicator.R;

public class Uno_Fragment extends Fragment{
//Al importar la librería del Fragment, es recomendable importar android.support.v4.app.Fragment;
//ya que esta soporta desde la API 9 hasta la actual

    //Método usado para llamar al fragmento desde el viewpagerindicator
    public static final Uno_Fragment newInstance() {
        return new Uno_Fragment();
    }

    //Método sobreescrito para asociar una interface al fragment
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_uno, container, false);
        return view;
    }
}
