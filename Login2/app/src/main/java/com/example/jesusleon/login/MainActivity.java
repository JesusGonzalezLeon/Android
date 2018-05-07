package com.example.jesusleon.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText usuario,password;
    Button ingresa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usuario =(EditText)this.findViewById(R.id.editText3);
        password = (EditText)this.findViewById(R.id.editText4);
        ingresa=(Button)this.findViewById(R.id.button2);

        ingresa.setOnClickListener(this );
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button2:
                Intent i = new Intent(MainActivity.this, Inicio.class);
                startActivity(i);
                onStop();
                break;
        }
    }
}
