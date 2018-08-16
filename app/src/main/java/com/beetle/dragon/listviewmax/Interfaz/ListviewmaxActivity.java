package com.beetle.dragon.listviewmax.Interfaz;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.beetle.dragon.listviewmax.R;

import java.util.ArrayList;

public class ListviewmaxActivity extends Activity {

        private ArrayList<Persona> arrayList;
        private ListView listViewPersona;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listviewmax);
    }
}
