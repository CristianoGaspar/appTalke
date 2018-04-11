package com.garagetalke.appgarage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class SelectEstadoActivity extends AppCompatActivity {

        Spinner sistemas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity5_select_estado);

        sistemas = (Spinner) findViewById(R.id.spinnerdrop);
        ArrayAdapter arrayAdapter = ArrayAdapter.createFromResource(this, R.array.estados, android.R.layout.simple_spinner_item);
        sistemas.setAdapter(arrayAdapter);

    }
}
