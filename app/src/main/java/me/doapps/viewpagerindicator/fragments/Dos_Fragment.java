package me.doapps.viewpagerindicator.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.doapps.william.viewpagerindicator.R;

/**
 * Created by william on 16/02/2015.
 */
public class Dos_Fragment extends Fragment {

    public static final Dos_Fragment newInstance() {
        return new Dos_Fragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_dos, container, false);
        return view;
    }
}
