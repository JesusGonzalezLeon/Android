package com.example.jesusleon.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class Inicio extends AppCompatActivity implements AdapterView.OnItemSelectedListener, View.OnClickListener {
    Spinner spinner;
    Button info;
    int spinnerposicion = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        spinner =(Spinner) this.findViewById(R.id.tipos);
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this,R.array.tipos, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

        info=(Button)this.findViewById(R.id.button);
        info.setOnClickListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        spinnerposicion = adapterView.getSelectedItemPosition();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    @Override
    public void onClick(View view) {
        Intent i;
        switch (spinnerposicion){
            case 0:
            Toast.makeText(view.getContext(),"Seleccione un tipo de layout", Toast.LENGTH_SHORT).show();
                break;
            case 1:
                i = new Intent(Inicio.this, Linear.class);
                startActivity(i);
                break;
            case 2:
                Intent k = new Intent(Inicio.this, Table.class);
                startActivity(k);
                break;
            case 3:
                i = new Intent(Inicio.this, Frame.class);
                startActivity(i);
                break;
            case 4:
                i = new Intent(Inicio.this, Relative.class);
                startActivity(i);
                break;
        }
    }
}
