package me.doapps.viewpagerindicator.activities;

import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.doapps.william.viewpagerindicator.R;
import com.viewpagerindicator.TitlePageIndicator;

import me.doapps.viewpagerindicator.adapters.TabAdapter;


public class MainActivity extends ActionBarActivity {

    //Variables que contendran los objetos de la interface
    TitlePageIndicator titlePageIndicator;
    ViewPager viewPager;
    //Variable que contendra un objeto de la clase TabAdapter
    TabAdapter tabAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Asocia la interface principal con la MainActivity
        setContentView(R.layout.activity_main);
        //Asociar los objetos con las variables
        titlePageIndicator = (TitlePageIndicator) findViewById(R.id.indicator);
        viewPager = (ViewPager) findViewById(R.id.pager);
        //Instanciamos la clase TabAdapter y le enviamos el administrador de fragmentos
        tabAdapter = new TabAdapter(getSupportFragmentManager());
        //establecemos el adaptador para el viewPager
        viewPager.setAdapter(tabAdapter);
        //establecemos el viewpager para el titlePageIndicator (enlazamos)
        titlePageIndicator.setViewPager(viewPager);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
