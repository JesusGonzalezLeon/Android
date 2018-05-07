package com.example.jesusleon.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Relative extends AppCompatActivity implements View.OnClickListener {
    Button regresa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative);
        regresa=(Button)this.findViewById(R.id.reg);
        regresa.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        finish();
    }
}
