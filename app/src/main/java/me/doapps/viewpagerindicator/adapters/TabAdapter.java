package me.doapps.viewpagerindicator.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import me.doapps.viewpagerindicator.fragments.Dos_Fragment;
import me.doapps.viewpagerindicator.fragments.Tres_Fragment;
import me.doapps.viewpagerindicator.fragments.Uno_Fragment;

//Para representar los fragmentos como páginas que se mostraran en el ViewPager
public class TabAdapter extends FragmentPagerAdapter {

    //Arreglo de cadenas que serán los títulos de los fragmentos
    protected static final String[] containt = new String[] { "FRAGMENTO UNO", "FRAGMENTO DOS", "FRAGMENTO TRES"};
    //Contador de pestañas|fragmentos
    private int count = containt.length;

    //Constructor que requiere un adminsitrador de fragmentos
    public TabAdapter(FragmentManager fm) {
        super(fm);
    }

    //Método sobreescrito que retorna el fragmento solicitado de acuerdo a una posición
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return Uno_Fragment.newInstance();
            case 1:
                return Dos_Fragment.newInstance();
            case 2:
                return Tres_Fragment.newInstance();
            default:
                return null;
        }
    }

    //Método sobreescrito que retorna el título del fragmento de acuerdo a una posición
    @Override
    public CharSequence getPageTitle(int position) {
        return containt[position % containt.length];
    }

    //Método sobreescrito que retorna la cantidad de fragmentos|pestañas
    @Override
    public int getCount() {
        return count;
    }
}
